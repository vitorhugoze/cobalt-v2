package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredCallButtonBuilder {
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage phoneNumber;

    public HighlyStructuredCallButtonBuilder() {
        text = null;
        phoneNumber = null;
    }

    public HighlyStructuredCallButtonBuilder text(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text) {
        this.text = text;
        return this;
    }

    public HighlyStructuredCallButtonBuilder phoneNumber(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCallButton build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCallButton(text, phoneNumber);
    }

}
