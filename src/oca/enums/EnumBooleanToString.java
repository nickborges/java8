package oca.enums;

import java.util.Objects;

public enum EnumBooleanToString {
    TRUE("S"),
    FALSE("N");

    private String stringValue;

    EnumBooleanToString(String stringValue) {
        this.stringValue = stringValue;
    }

    public static String fromBoolean(Boolean paramBoolean){
        validaParamBoolean(paramBoolean);

        return EnumBooleanToString.valueOf(
                String.valueOf(paramBoolean.booleanValue()).toUpperCase()
        ).getStringValue();
    }

    public String getStringValue() {
        return this.stringValue;
    }

    private static void validaParamBoolean(Boolean paramBoolean){
        if(Objects.isNull(paramBoolean)){
            throw new RuntimeException("Parâmetro inválido, deve ser true ou false.");
        }

    }

}