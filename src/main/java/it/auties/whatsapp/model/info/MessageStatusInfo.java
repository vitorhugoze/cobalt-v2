package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.message.model.MessageStatus;

public interface MessageStatusInfo<T extends MessageStatusInfo<T>> extends Info, MessageInfo<T> {
    MessageStatus status();

    T setStatus(MessageStatus status);
}
