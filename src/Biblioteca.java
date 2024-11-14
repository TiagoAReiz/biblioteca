import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<biblioteca_pessoa> usuarios = new ArrayList<>();
    private ArrayList<biblioteca_func> funcionarios = new ArrayList<>();
    private ArrayList<livro_cadastro> livros = new ArrayList<>();
    private ArrayList<exemplar_cadastro> exemplares = new ArrayList<>();
    private ArrayList<emprestimo_dev> emprestimosAtivos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Construtor para adicionar usuário e funcionário de exemplo
    public Biblioteca() {
        // Criando um usuário e funcionário de exemplo

    }

    

    public void menu() {
        biblioteca_pessoa usuarioExemplo = new biblioteca_pessoa(
                "Cleber", "2000-01-01", 123456, "11944434123", 1001, "12/11/2024", "livro1");
        biblioteca_func funcionarioExemplo = new biblioteca_func(
                "Ana", "1995-12-05", 987654, "1188885566", 2001, "ana@biblioteca.com", "Recepção");
        usuarios.add(usuarioExemplo);
        funcionarios.add(funcionarioExemplo);
        livro_cadastro teste = new livro_cadastro(200, "teste", "cleber", "Romance", "Abril", 2024, "aa");
        livros.add(teste);
        exemplar_cadastro exemplarTeste = new exemplar_cadastro(123, "Título do Livro", "Autor Exemplo", "Gênero Exemplo", "Editora Exemplo", 2020, "Lista Exemplar Exemplo", 456, "2024-11-12", "Novo");
        exemplares.add(exemplarTeste);
        int opcao;
        do {
            System.out.println("\nMenu da Biblioteca:");
            System.out.println("1. Buscar usuário por número de registro");
            System.out.println("2. Buscar funcionário por número de identificação");
            System.out.println("3. Buscar livro por código");
            System.out.println("4. Buscar exemplar por código");
            System.out.println("5. Listar todos os usuários");
            System.out.println("6. Listar todos os funcionários");
            System.out.println("7. Listar todos os livros");
            System.out.println("8. Listar todos os exemplares disponíveis de um livro");
            System.out.println("9. Registrar um empréstimo de livro");
            System.out.println("10. Registrar devolução de livro");
            System.out.println("11. Deletar usuario");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o Enter

            switch (opcao) {
                
                case 1:
                    buscarUsuario();
                    break;
                case 2:
                    buscarFuncionario();
                    break;
                case 3:
                    buscarLivro();
                    break;
                case 4:
                    buscarExemplar();
                    break;
                case 5:
                    listarUsuarios();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    listarLivros();
                    break;
                case 8:
                    listarExemplares();
                    break;
                case 9:
                    registrarEmprestimo();
                    break;
                case 10:
                    registrarDevolucao();
                    break;
                    case 11: 
                    deletarUsuarios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private void deletarUsuarios() {
        System.out.print("Digite o número de registro do usuário para deletar: ");
        int registro = scanner.nextInt();
        scanner.nextLine();
        for (biblioteca_pessoa usuario : usuarios) {
            if (usuario.get_n_Registro() == registro) {
                usuarios.remove(usuario);
                System.out.println("Usuário deletado com sucesso.");
                return;
            }
        }
    }
    private void buscarUsuario() {
        System.out.print("Digite o número de registro do usuário: ");
        int registro = scanner.nextInt();
        scanner.nextLine();

        for (biblioteca_pessoa usuario : usuarios) {
            if (usuario.get_n_Registro() == registro) {
                System.out.println(
                        "Usuário encontrado: " + usuario.get_nome() + ", Data de cadastro: " + usuario.get_data_cad());
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    private void buscarFuncionario() {
        System.out.print("Digite o número de identificação do funcionário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (biblioteca_func funcionario : funcionarios) {
            if (funcionario.get_n_inde() == id) {
                System.out.println(
                        "Funcionário encontrado: " + funcionario.get_nome() + ", Setor: " + funcionario.get_setor());
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    private void buscarLivro() {
        System.out.print("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        for (livro_cadastro livro : livros) {
            if (livro.get_n_livro() == codigo) {
                System.out.println("Livro encontrado: " + livro.get_titulo() + ", Autor: " + livro.get_autor()
                        + ", Gênero: " + livro.get_genero());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    private void buscarExemplar() {
        System.out.print("Digite o código do exemplar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        for (exemplar_cadastro exemplar : exemplares) {
            if (exemplar.get_codigo_exemplar() == codigo) {
                System.out.println("Exemplar encontrado: Estado: " + exemplar.get_estado() + ", Disponível: "
                        + exemplar.get_status());
                return;
            }
        }
        System.out.println("Exemplar não encontrado.");
    }

    private void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário registrado.");
        } else {
            System.out.println("Usuários registrados:");
            for (biblioteca_pessoa usuario : usuarios) {
                System.out.println("Registro: " + usuario.get_n_Registro() + ", Nome: " + usuario.get_nome()
                        + ", Data de cadastro: " + usuario.get_data_cad());
            }
        }
    }

    private void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário registrado.");
        } else {
            System.out.println("Funcionários registrados:");
            for (biblioteca_func funcionario : funcionarios) {
                System.out.println("ID: " + funcionario.get_n_inde() + ", Nome: " + funcionario.get_nome() + ", Setor: "
                        + funcionario.get_setor());
            }
        }
    }

    private void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros cadastrados:");
            for (livro_cadastro livro : livros) {
                System.out.println("Código: " + livro.get_n_livro() + ", Título: " + livro.get_titulo() + ", Autor: "
                        + livro.get_autor() + ", Gênero: " + livro.get_genero());
            }
        }
    }

    private void listarExemplares() {
        System.out.print("Digite o codigo do livro: ");
        int codigoLivro = scanner.nextInt();
        scanner.nextLine();
        for(exemplar_cadastro exemplar : exemplares){
            if (exemplar.get_n_livro() == codigoLivro ){
                System.out.println("ID: " + exemplar.get_codigo_exemplar() +
                                   ", Estado: " + exemplar.get_estado() +
                                   ", Disponível: " + exemplar.get_status() +
                                   ", Data de registro: " + exemplar.get_data_aq());
            }else{
                System.out.println("Nenhum exemplar registrado.");
            }
        }
        }

    private void registrarEmprestimo() {
        System.out.print("Digite o número de registro do usuário: ");
        int registro = scanner.nextInt();
        scanner.nextLine();

        biblioteca_pessoa usuario = null;
        for (biblioteca_pessoa u : usuarios) {
            if (u.get_n_Registro() == registro) {
                usuario = u;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("Digite o código do exemplar: ");
        int codigoExemplar = scanner.nextInt();
        scanner.nextLine();

        exemplar_cadastro exemplar = null;
        for (exemplar_cadastro e : exemplares) {
            if (e.get_codigo_exemplar() == codigoExemplar && e.get_status()) {
                exemplar = e;
                break;
            }
        }

        if (exemplar == null) {
            System.out.println("Exemplar não disponível ou não encontrado.");
            return;
        }

        emprestimo_dev emprestimo = new emprestimo_dev(usuario, exemplar, LocalDate.now(),
                LocalDate.now().plusDays(15));
        emprestimosAtivos.add(emprestimo);
        System.out.println("Empréstimo registrado com sucesso.");
    }

    private void registrarDevolucao() {
        System.out.print("Digite o código do exemplar para devolução: ");
        int codigoExemplar = scanner.nextInt();
        scanner.nextLine();

        for (emprestimo_dev emprestimo : emprestimosAtivos) {
            if (emprestimo.get_exemplar().get_codigo_exemplar() == codigoExemplar) {
                emprestimo.devolver();
                emprestimosAtivos.remove(emprestimo);
                System.out.println("Devolução registrada com sucesso.");
                return;
            }
        }
        System.out.println("Empréstimo não encontrado.");
    }

}
