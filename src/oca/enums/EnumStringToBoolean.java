package oca.enums;

public enum EnumStringToBoolean {
    S(Boolean.TRUE),
    N(Boolean.FALSE);

    private String stringValue;
    private Boolean booleanValue;

    EnumStringToBoolean(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public static Boolean fromString(String paramString){
        return EnumStringToBoolean.valueOf(
                paramString
        ).getBooleanValue();
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

}