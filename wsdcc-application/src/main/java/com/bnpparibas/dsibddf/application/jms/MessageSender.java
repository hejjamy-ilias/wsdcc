package com.bnpparibas.dsibddf.application.jms;

import java.io.IOException;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;



/**
 * @author Ismail B30653
 *
 */
public final class MessageSender {

	private static final Logger LOGGER = Logger.getLogger(MessageSender.class);
	private static MessageSender instance;
	private static InitialContext ctx;
	private static final Object LOCK_OBJ = new Object();

	/**
	 * Creation de l instance du singleton "MessageSender"
	 * 
	 * @throws IOException
	 */
	private MessageSender() {

	}

	/**
	 * Recupere l instance du singleton "MessageSender"
	 * 
	 * @return
	 * @throws IOException
	 */
	public static MessageSender getInstance() {
		if (instance == null) {
			synchronized (MessageSender.class) {
				instance = new MessageSender();
			}
		}
		return instance;

	}

	/**
	 * Permet d envoyer un message a la queue MQ
	 * 
	 * @param content
	 *            contenu du message envoye
	 */
	public void send(final String content) {

		QueueConnection queueConn = null;
		QueueSession queueSession = null;
		QueueSender queueSender = null;

		try {

			// lookup the queue object
			final Queue queue = (Queue) getContextIntance().lookup("jms/FRSWA02T");

			// lookup the queue connection factory
			final QueueConnectionFactory connFactory = (QueueConnectionFactory) getContextIntance()
					.lookup("jms/ATMSTATS");

			// create a queue connection
			queueConn = connFactory.createQueueConnection();

			// create a queue session
			queueSession = queueConn.createQueueSession(false, Session.DUPS_OK_ACKNOWLEDGE);

			// create a queue sender
			queueSender = queueSession.createSender(queue);
			queueSender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			// create a simple message to say "Hello"
			final TextMessage message = queueSession.createTextMessage(content);

			// send the message
			queueSender.send(message);

			// print what we did
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("[" + MessageSender.class.getName() + "()] Envoi STATS OK : DEBUT[" + message.getText()
						+ "]FIN");
			}

			// close the queue connection
			queueConn.close();
			// close the queue d'envoi
			queueSender.close();
			// close the queue de session
			queueSession.close();
		} catch (NamingException e) {

			LOGGER.error("[" + MessageSender.class.getName() + "()] Exception STATS : " + e);

		} catch (JMSException e) {

			LOGGER.error("[" + MessageSender.class.getName() + "()] Exception STATS : " + e);

		} finally {
			try {
				if (queueConn != null) {
					queueConn.close();
				}
				if (queueSession != null) {
					queueSession.close();
				}

				if (queueSender != null) {
					queueSender.close();
				}
			} catch (JMSException e2) {
				LOGGER.error("/!\\Problème de fermeture des ressources : ", e2);
			}
		}
	}

	public static InitialContext getContextIntance() throws NamingException {
		synchronized (LOCK_OBJ) { // synchronization pour l'objet ctx ( voir
									// état consistent de l’objet statique )
			if (ctx == null) {
				ctx = new InitialContext();
			}
			return ctx;
		}
	}
}