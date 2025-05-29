package it.auties.whatsapp.model.message.model;

import java.util.Optional;

import it.auties.whatsapp.model.info.ContextInfo;

/**
 * A model interface that represents a message sent by a contact that provides a context. Classes
 * that implement this interface must provide an accessor named contextInfo to access said
 * property.
 */
public interface ContextualMessage<T extends ContextualMessage<T>> extends Message {
    Optional<ContextInfo> contextInfo();

    T setContextInfo(ContextInfo contextInfo);
}
