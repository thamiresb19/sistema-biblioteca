
package model;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeTotal;
    private int quantidadeDisponivel;


    public Livro(String titulo, String autor, String isbn, int quantidadeTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeTotal = quantidadeTotal;
        this.quantidadeDisponivel = quantidadeTotal;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }


    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;

    }
@Override
public String toString(){
    return "Titulo: " + this.titulo + " | Autor: " +this.autor+ " | Isbn: " +this.isbn+ " | Quantidade: " +this.quantidadeDisponivel + "\n";



}
}