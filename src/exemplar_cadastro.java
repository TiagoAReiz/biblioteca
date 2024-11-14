
public class exemplar_cadastro extends livro_cadastro{
  private int codigo_exemplar;
  private String estado;
  private boolean status;
  private String data_aq;

  public exemplar_cadastro(int n_livro, String titulo, String autor, String genero, String editora, int ano_publi, String lista_exemplares, int codigo_exemplar, String data_aq, String estado){
    super(n_livro, titulo, autor, genero, editora, ano_publi, lista_exemplares);
    this.codigo_exemplar = codigo_exemplar;
    this.estado = estado;
    this.status = true;
    this.data_aq = data_aq;
  }
  public int get_codigo_exemplar(){
    return this.codigo_exemplar;
  }
  public String get_estado(){
    return this.estado;
  }
  public boolean get_status(){
    return this.status;
  }
  public String get_data_aq(){
    return this.data_aq;
  }
  public void setDisponibilidade(boolean status){
    this.status = status;
  }
}