package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredFourRowTemplateSimpleBuilder {
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredFourRowTemplateTitle title;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage content;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage footer;
    private java.util.List<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredButtonTemplate> buttons;

    public HighlyStructuredFourRowTemplateSimpleBuilder() {
    }

    public HighlyStructuredFourRowTemplateSimpleBuilder title(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredFourRowTemplateTitle title) {
        this.title = title;
        return this;
    }

    public HighlyStructuredFourRowTemplateSimpleBuilder content(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage content) {
        this.content = content;
        return this;
    }

    public HighlyStructuredFourRowTemplateSimpleBuilder footer(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage footer) {
        this.footer = footer;
        return this;
    }

    public HighlyStructuredFourRowTemplateSimpleBuilder buttons(java.util.List<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredButtonTemplate> buttons) {
        this.buttons = buttons;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredFourRowTemplate build() {
        return it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredFourRowTemplate.simpleBuilder(title, content, footer, buttons);
    }

}
