package eu.jaam.camunda.outbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OutboxService {

    private final static Logger logger = LoggerFactory.getLogger(OutboxService.class);

    public void markAsSent(String messageId) {
        logger.info("Marking message with id " + messageId + " as sent");
    }

}
