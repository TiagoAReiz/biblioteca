public class pessoa{
  private String nome;
  private String d_nasc;
  private int cep;
  private String numero;

  public pessoa(String nome, String d_nasc, int cep, String numero){
    this.nome = nome;
    this.d_nasc = d_nasc;
    this.cep = cep;
    this.numero = numero;
  }
  public String get_nome(){
    return this.nome;
  }
  public String get_d_nasc(){
    return this.d_nasc;
  }
  public int get_cep(){
    return this.cep;
  }
  public String get_numero(){
    return this.numero;
  }
}