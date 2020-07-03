package more.orientacaoObjetos;

public class NotaFiscal {

    private Double valor;

    public NotaFiscal(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void desconta(){
        if (valor > 10000) {
            valor *= 0.98;
        } else {
            valor *= 0.95;
        }
    }
}
