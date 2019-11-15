package oca.enums;

public enum EDetalhamentoResultado {
    POSITIVA(1),
    MUDOU_SE(2),
    ENDERECO_INSUFICIENTE(3),
    NAO_EXISTE_O_NUMERO(4),
    DESCONHECIDO(5),
    RECUSADO(6),
    NAO_PROCURADO(7),
    FALECIDO(8),
    OUTROS(9);

    private int value;

    public static EDetalhamentoResultado fromString(String text) {
        for (EDetalhamentoResultado detalhamentoResultado : EDetalhamentoResultado.values()) {
            if (detalhamentoResultado.value == Integer.parseInt(text)) {
                return detalhamentoResultado;
            }
        }
        return null;
    }

    EDetalhamentoResultado(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}