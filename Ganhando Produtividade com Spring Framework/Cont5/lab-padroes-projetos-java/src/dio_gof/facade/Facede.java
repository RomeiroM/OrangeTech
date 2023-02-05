package dio_gof.facade;

import subsistemacep.CepApi;
import subsistemacrm.CrmService;

public class Facede {
    public void migrarCliente(String
     nome, String cep){
        String cidade = CepApi.getInstancia().reguperarCidade(cep);
        String estado = CepApi.getInstancia().reguperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
     }
}
