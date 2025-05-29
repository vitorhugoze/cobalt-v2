package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredButtonTemplateBuilder {
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredQuickReplyButton> highlyStructuredQuickReplyButton;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredURLButton> highlyStructuredUrlButton;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCallButton> highlyStructuredCallButton;
    private int index;

    public HighlyStructuredButtonTemplateBuilder() {
        highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        index = 0;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredQuickReplyButton(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredQuickReplyButton highlyStructuredQuickReplyButton) {
        this.highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredQuickReplyButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredUrlButton(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredURLButton highlyStructuredUrlButton) {
        this.highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredUrlButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredCallButton(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCallButton highlyStructuredCallButton) {
        this.highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredCallButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder index(int index) {
        this.index = index;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredButtonTemplate build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredButtonTemplate(highlyStructuredQuickReplyButton, highlyStructuredUrlButton, highlyStructuredCallButton, index);
    }

}
