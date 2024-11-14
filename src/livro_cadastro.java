import java.util.HashSet;

public class livro_cadastro {
    private static HashSet<Integer> codigosLivrosExistentes = new HashSet<>();
    private int n_livro;
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private int ano_publi;
    private String lista_exemplares;

    public livro_cadastro(int n_livro, String titulo, String autor, String genero, String editora, int ano_publi, String lista_exemplares) {
        if (codigosLivrosExistentes.contains(n_livro)) {
            System.out.println("Erro: Código do livro já existe! Cadastro não realizado.");
            return; // Saída antecipada se o código do livro já existe
        }

        // Se o código for único, adiciona ao conjunto e inicializa o objeto
        this.n_livro = n_livro;
        codigosLivrosExistentes.add(n_livro); // Adiciona o novo código ao conjunto
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.ano_publi = ano_publi;
        this.lista_exemplares = lista_exemplares;
    }

    public int get_n_livro() {
        return this.n_livro;
    }
    public String get_titulo() {
        return this.titulo;
    }
    public String get_autor() {
        return this.autor;
    }
    public String get_genero() {
        return this.genero;
    }
    public String get_editora() {
        return this.editora;
    }
    public int get_ano_publi() {
        return this.ano_publi;
    }
    public String get_lista_exemplares(){
        return this.lista_exemplares;
    }
}
