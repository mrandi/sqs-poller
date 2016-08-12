package io.github.mrandi.handler;

import com.amazonaws.services.sqs.model.Message;
import org.springframework.stereotype.Service;

@Service
public class SqsMessageHandlerImpl implements SqsMessageHandler {

    @Override
    public boolean handle(final Message message) {
        // do something with the message!!!
        message.getBody();
        return true;
    }
}
