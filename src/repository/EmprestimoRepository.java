package repository;
import model.Emprestimo;

import java.util.ArrayList;

public class EmprestimoRepository {

    private ArrayList<Emprestimo> emprestimos;

    public EmprestimoRepository() {
    emprestimos = new ArrayList<Emprestimo>();
    }
    public void adicionar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);

    }


    public ArrayList<Emprestimo> listarTodos() {
        return emprestimos;
    }

    public Emprestimo buscarPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                return emprestimo;
            }
        }
        return null;

    }
    public void remover(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                emprestimos.remove(emprestimo);
                return;

            }
        }

    }





























}