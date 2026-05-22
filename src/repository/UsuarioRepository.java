
package repository;
import model.Usuario;

import java.util.ArrayList;


public class UsuarioRepository {


    private ArrayList<Usuario> usuarios;

    public UsuarioRepository() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> listarTodos() {
        return usuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
return null;

    }
public void remover(int id){
        for (Usuario usuario : usuarios) {
            if (usuario.getId() ==id){
                usuarios.remove(usuario);
                return;

            }
        }
}


































}
