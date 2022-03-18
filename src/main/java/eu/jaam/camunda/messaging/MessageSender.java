package eu.jaam.camunda.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private final static Logger logger = LoggerFactory.getLogger(MessageSender.class);

    public void send(String messageId) {
        logger.info("Sending message with id " + messageId);
    }

}
