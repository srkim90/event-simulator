package com.test.doms.amq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

@Slf4j
@Component
public class CommonErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
        log.info("good man");
    }

//    @Override
//    public boolean isFatal(Throwable t) {
//        log.info("common errorhandler !");
//        if (t instanceof ListenerExecutionFailedException) {
//            ListenerExecutionFailedException lefe = (ListenerExecutionFailedException) t;
//            logger.error("Failed to process inbound message from queue "
//                    + lefe.getFailedMessage().getMessageProperties().getConsumerQueue()
//                    + "; failed message: " + lefe.getFailedMessage(), t);
//        }
//        return super.isFatal(t);
//    }
}
