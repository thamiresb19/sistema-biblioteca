
import model.Livro;

import java.util.ArrayList;
import java.util.Scanner;

import service.BibliotecaService;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        BibliotecaService bibliotecaService = new BibliotecaService();

        while (true) {

            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar livros");
            System.out.println("0 - Sair");


            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("DIgite o nome do autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("DIgite o ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.println("DIgite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    bibliotecaService.cadastrarLivro(titulo, autor, isbn, quantidade);
                    break;

                case 2:
                    System.out.println("Digite o ID do usuário: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o nome do usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.println("Digite o E-mail: ");
                    String email = scanner.nextLine();
                    bibliotecaService.adicionarUsuario(id, usuario, email);
                    break;

                case 3:

                    System.out.println("Digite o ID do usuário: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o ISBN: ");
                    String isbnLivro = scanner.nextLine();
                    scanner.nextLine();
                    bibliotecaService.realizarEmprestimo(idUsuario, isbnLivro);
                    break;

                case 4:
                    System.out.println("Digite o ID do emprestimo: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();
                    bibliotecaService.devolverLivro(idLivro);
                    break;

                case 5:
                    ArrayList<Livro> livros = bibliotecaService.listarLivros();
                    for (Livro livro : livros) {
                        System.out.println(livro);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:


            }


        }

    }
}