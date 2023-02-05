package subsistemacep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String reguperarCidade(String cep){
        return "Araraquara";
    }

    public String reguperarEstado(String cep){
        return "SP";
    }
}
