package repository;
import model.Livro;
import java.util.ArrayList;


public class LivroRepository {

    private ArrayList<Livro> livros;
    public LivroRepository() {
        this.livros = new ArrayList<>();
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> listarTodos() {
        return livros;
    }

    public Livro buscarPorIsbn(String isbn) {

        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }


    public void remover(String isbn) {
        for (Livro livro : livros) {

            if (livro.getIsbn().equals(isbn)) {
                livros.remove(livro);
                return;
            }

        }

    }


}
