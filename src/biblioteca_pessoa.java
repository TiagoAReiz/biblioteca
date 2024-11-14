
import java.util.HashSet;

public class biblioteca_pessoa extends pessoa {
    private static HashSet<Integer> registrosExistentes = new HashSet<Integer>();
    private int n_Registro;
    private String email;
    private String livros_emp;
    private int totalEmprestimos;
    private String data_cad;

    public biblioteca_pessoa(String nome, String d_nasc, int cep, String numero, int n_Registro, String data_cad, String livros_emp) {
        super(nome, d_nasc, cep, numero);

        if (registrosExistentes.contains(n_Registro)) {
            System.out.println("Erro: Registro de usuário já existe! Cadastro não realizado.");
            return; // Saída antecipada se o registro já existe
        }

        // Se o registro for único, adiciona ao conjunto e inicializa o objeto
        this.n_Registro = n_Registro;
        registrosExistentes.add(n_Registro); // Adiciona o novo registro ao conjunto
        this.email = n_Registro + "@biblioteca.com";
        this.data_cad = data_cad;
        this.livros_emp = livros_emp;
        this.totalEmprestimos = 0;
    }

    public int get_n_Registro() {
        return this.n_Registro;
    }

    public String get_email() {
        return this.email;
    }
    public String get_data_cad(){

      return data_cad;
    }
    public String get_livros_emp(){
      return this.livros_emp;
    }
    public int getTotalEmprestimos() {
        return this.totalEmprestimos;
    }

    public void incrementarEmprestimos() {
        this.totalEmprestimos++;
    }
}
