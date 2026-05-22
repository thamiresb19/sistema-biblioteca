package model;

public class Emprestimo {

    private int id;
    private Usuario usuario;
    private Livro livro;
    private String dataDevolucao;
    private boolean ativo;


    public Emprestimo(int id, Usuario usuario, Livro livro, String dataDevolucao) {

        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataDevolucao = dataDevolucao;
        this.ativo = true;
    }

    public int getId() {
        return this.id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Id: |" + this.id + "Usuario: |" + this.usuario + "Livro: |" + this.livro + "Data de devolução: |" + this.dataDevolucao + "Ativo: |" + this.ativo;
    }


}