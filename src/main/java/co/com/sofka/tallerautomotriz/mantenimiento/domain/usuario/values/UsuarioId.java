package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values;

import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity {
    //constructor vacio
    public UsuarioId(){

    }
    private UsuarioId(String id){
        super(id);
    }

    //metodo para pedir el identificador sin necesidad de new
    public static UsuarioId of(String id){
        return new UsuarioId(id);
    }
}
