package oca.enums;

public enum EStatusNotificacao {
    POSITIVA("Positiva"),
    NEGATIVA("Negativa");

    private String value;

    EStatusNotificacao(String value) {
        this.value = value;
    }

    public static EStatusNotificacao fromString(String text) {
        return EStatusNotificacao.valueOf(text.toUpperCase());
    }

    public String getValue() {
        return this.value;
    }
}