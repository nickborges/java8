package oca.enums;

public enum EnumBooleanToString {
    TRUE("S"),
    FALSE("N");

    private String stringValue;

    EnumBooleanToString(String stringValue) {
        this.stringValue = stringValue;
    }

    public static String fromBoolean(Boolean paramBoolean){
        return EnumBooleanToString.valueOf(
                String.valueOf(paramBoolean.booleanValue()).toUpperCase()
        ).getStringValue();
    }

    public String getStringValue() {
        return this.stringValue;
    }

}