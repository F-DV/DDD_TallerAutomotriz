package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;

public class Tipo implements ValueObject<Tipo.Mantto> {

    private final Mantto value;

    public Tipo(Mantto value) {

        this.value = value;
    }

    @Override
    public Mantto value() {
        return value;
    }

    public enum  Mantto {
        PREVENTIVO,CORRECTIVO
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tipo other = (Tipo) obj;
        if (value != other.value)
            return false;
        return true;
    }

    

}
