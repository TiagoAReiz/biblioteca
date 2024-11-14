public class biblioteca_func extends pessoa{
  private int n_inde;
  private String email;
  private String setor;

  public biblioteca_func(String nome, String d_nasc, int cep, String numero, int n_inde, String email, String setor){
    super(nome, d_nasc, cep, numero);
    this.n_inde = n_inde;
    this.email = n_inde + "@biblioteca.com";
    this.setor = setor;
  }
  public int get_n_inde(){
    return this.n_inde;
  }
  public String get_email(){
    return this.email;
  }
  public String get_setor(){
    return this.setor;
  }
  
}