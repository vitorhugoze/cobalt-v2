package it.auties.whatsapp.model.message.model;

/**
 * A model interface that represents a reply to a button message
 */
public non-sealed interface ButtonReplyMessage<T extends ButtonReplyMessage<T>> extends ContextualMessage<T>, ButtonMessage {

}
