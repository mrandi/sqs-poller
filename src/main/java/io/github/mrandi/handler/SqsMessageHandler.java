package io.github.mrandi.handler;

import com.amazonaws.services.sqs.model.Message;

public interface SqsMessageHandler {

    boolean handle(Message message);

}
