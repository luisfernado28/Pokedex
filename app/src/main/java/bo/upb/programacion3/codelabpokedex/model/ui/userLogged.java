package bo.upb.programacion3.codelabpokedex.model.ui;

import bo.upb.programacion3.codelabpokedex.model.types.UsuarioTipo;

public class userLogged {
    private String email;

    private UsuarioTipo type;

    public userLogged(String email, UsuarioTipo type) {
        this.email = email;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public UsuarioTipo getType() {
        return type;
    }
}
