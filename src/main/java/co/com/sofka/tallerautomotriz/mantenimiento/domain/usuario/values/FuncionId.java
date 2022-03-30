package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values;

//generic esta generando el identificador
import co.com.sofka.domain.generic.Identity;

public class FuncionId extends Identity {

    //constructor vacio
    public FuncionId(){

    }
    private FuncionId(String id){
        super(id);
    }

        //metodo para pedir el identificador sin necesidad de new
    public static FuncionId of(String id){
        return new FuncionId(id);
    }

}
