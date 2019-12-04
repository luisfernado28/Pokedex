package bo.upb.programacion3.codelabpokedex.model.utils;

import bo.upb.programacion3.codelabpokedex.model.Repository.Usuario;
import bo.upb.programacion3.codelabpokedex.model.types.UsuarioTipo;
import bo.upb.programacion3.codelabpokedex.model.ui.userLogged;

public class ResponseMapper {

    public static userLogged mapUserToUserLooged(Usuario user) {
        if (user.getEmail().equals(Constants.USER_EMAIL_HOST)) {
            return new userLogged(user.getEmail(), UsuarioTipo.Entrenador);
        } else {
            return new userLogged(user.getEmail(), UsuarioTipo.Aprendiz);
        }
    }
}
