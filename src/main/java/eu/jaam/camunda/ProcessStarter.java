package eu.jaam.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class ProcessStarter implements InitializingBean {

    private final RuntimeService runtimeService;

    public ProcessStarter(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (int i = 0; i < 10; i++) {
             runtimeService.startProcessInstanceByKey("outbox-pattern", Collections.singletonMap("messageId", UUID.randomUUID().toString()));
        }
    }
}
