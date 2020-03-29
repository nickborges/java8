package ocp.streams.dto;

import java.util.ArrayList;
import java.util.List;

public class TesteResponde {
    private List<PessoaDTO> pessoa;
    private List<EstadoDTO> estados;

    public List<PessoaDTO> getPessoa() {
        if(pessoa == null)
            pessoa = new ArrayList<PessoaDTO>();
        return pessoa;
    }

    public List<EstadoDTO> getEstados() {
        if(estados == null)
            estados = new ArrayList<>();
        return estados;
    }
}
