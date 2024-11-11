import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        // JSON representando uma pessoa
        //String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20}";

        // Configura o Gson para lidar com campos ausentes e extras
        Gson gson = new GsonBuilder().serializeNulls().create();

        // Converte o JSON em um objeto do tipo Pessoa
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        // Exibe o objeto Pessoa
        System.out.println(pessoa);
    }
}


