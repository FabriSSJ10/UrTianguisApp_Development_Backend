package pe.edu.pe.tf.dtos;
import pe.edu.pe.tf.entities.Outfit;

import java.time.LocalDate;

public class CatalogoDTO {
    private int Id_catalogo;
    private LocalDate I_fecha_creacion;
    private LocalDate I_fecha_modificacion;
    private Outfit Ou;

    public int getId_catalogo() {
        return Id_catalogo;
    }

    public void setId_catalogo(int id_catalogo) {
        Id_catalogo = id_catalogo;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public Outfit getOu() {
        return Ou;
    }

    public void setOu(Outfit ou) {
        Ou = ou;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }
}
