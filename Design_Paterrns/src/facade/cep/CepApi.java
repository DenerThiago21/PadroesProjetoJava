package facade.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public static String getCidade(String cep) {
        return "Imbuia";
    }

    public static String getEstado(String cep) {
        return "SC";
    }
}
