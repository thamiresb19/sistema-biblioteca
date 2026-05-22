package service;

import model.Livro;
import model.Usuario;
import model.Emprestimo;

import repository.EmprestimoRepository;
import repository.LivroRepository;
import repository.UsuarioRepository;

import java.util.ArrayList;

public class BibliotecaService {

    private LivroRepository livroRepository;
    private UsuarioRepository usuarioRepository;
    private EmprestimoRepository emprestimoRepository;
    private int contadorEmprestimo = 1;

    public BibliotecaService() {

        this.livroRepository = new LivroRepository();
        this.usuarioRepository = new UsuarioRepository();
        this.emprestimoRepository = new EmprestimoRepository();
    }

    public void cadastrarLivro(String titulo, String autor, String isbn, int quantidadeTotal) {
        Livro livro = new Livro(titulo, autor, isbn, quantidadeTotal);
        livroRepository.adicionar(livro);
    }


    public void adicionarUsuario(int id, String nome, String email) {
        Usuario usuario = new Usuario(id, nome, email);
        usuarioRepository.adicionarUsuario(usuario);
    }

    public void realizarEmprestimo(int idUsuario, String isbn) {
        Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
        Livro livro = livroRepository.buscarPorIsbn(isbn);
        if (livro.getQuantidadeDisponivel() > 0) {
            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
            int idEmprestimo = contadorEmprestimo++;
            Emprestimo emprestimo = new Emprestimo(idEmprestimo, usuario, livro, "30/06/2026");
            emprestimoRepository.adicionar(emprestimo);
            System.out.println("Empréstimo realizado com sucesso! ID do empréstimo: " + idEmprestimo);

        } else {
            System.out.println("Sem exemplares disponíveis");
        }

    }

    public void devolverLivro(int id) {


        Emprestimo emprestimo = emprestimoRepository.buscarPorId(id);
        emprestimo.setAtivo(false);
        emprestimo.getLivro().setQuantidadeDisponivel(emprestimo.getLivro().getQuantidadeDisponivel() + 1);
        System.out.println("Livro devolvido com sucesso!");

    }

    public ArrayList<Livro> listarLivros() {
       return livroRepository.listarTodos();
    }


}
