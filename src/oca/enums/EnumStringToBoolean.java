package oca.enums;

public enum EnumStringToBoolean {
    S(Boolean.TRUE),
    N(Boolean.FALSE);

    private Boolean booleanValue;

    EnumStringToBoolean(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public static Boolean fromString(String paramString){
        validaParamString(paramString);

        return EnumStringToBoolean.valueOf(
                paramString.toUpperCase()
        ).getBooleanValue();
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    private static void validaParamString(String paramString){
        if(!"S".equalsIgnoreCase(paramString)
                && !"N".equalsIgnoreCase(paramString)){
            throw new RuntimeException("Parâmetro inválido, deve ser S ou N.");
        }
    }
}