import java.time.LocalDate;

public class emprestimo_dev{
  private pessoa pessoa;
  private exemplar_cadastro exemplar;
  private LocalDate data_emp;
  private LocalDate data_dev;

  public emprestimo_dev(pessoa pessoa, exemplar_cadastro exemplar, LocalDate data_emp, LocalDate data_dev){
    this.pessoa = pessoa;
    this.exemplar = exemplar;
    this.data_emp= LocalDate.now();
    this.data_dev = data_emp.plusDays(15);
    exemplar.setDisponibilidade(false);
  }
  public void devolver() {
      exemplar.setDisponibilidade(true); // Marcar exemplar como disponível
      data_dev = LocalDate.now();
  }
  public exemplar_cadastro get_exemplar(){
    return exemplar;
  }
  public pessoa get_pessoa(){
    return pessoa;
  }
  public LocalDate get_data_emp(){
    return data_emp;
  }
  public LocalDate get_data_dev(){
    return data_dev;
  }

}