package pe.edu.pe.tf.dtos;
import pe.edu.pe.tf.entities.Outfit;

import java.time.LocalDate;

public class CatalogoDTO {
    private int id_catalogo;
    private LocalDate i_fecha_creacion;
    private LocalDate i_fecha_modificacion;
    private Outfit ou;

    public int getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(int id_catalogo) {
        this.id_catalogo = id_catalogo;
    }

    public LocalDate getI_fecha_creacion() {
        return i_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        this.i_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return i_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        this.i_fecha_modificacion = i_fecha_modificacion;
    }

    public Outfit getOu() {
        return ou;
    }

    public void setOu(Outfit ou) {
        this.ou = ou;
    }
}
