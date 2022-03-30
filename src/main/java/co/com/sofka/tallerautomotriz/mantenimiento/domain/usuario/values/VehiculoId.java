package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values;

import co.com.sofka.domain.generic.Identity;

public class VehiculoId extends Identity {

    //constructor vacio
    public VehiculoId(){

    }
    private VehiculoId(String id){
        super(id);
    }

    //metodo para pedir el identificador sin necesidad de new
    public static VehiculoId of(String id){
        return new VehiculoId(id);
    }
}
