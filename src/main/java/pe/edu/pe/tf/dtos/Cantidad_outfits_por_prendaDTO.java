package pe.edu.pe.tf.dtos;

public class Cantidad_outfits_por_prendaDTO {
    public String nombre_prenda;
    public int cantidad_outfits;

    public String getNombre_prenda() {
        return nombre_prenda;
    }

    public void setNombre_prenda(String nombre_prenda) {
        this.nombre_prenda = nombre_prenda;
    }

    public int getCantidad_outfits() {
        return cantidad_outfits;
    }

    public void setCantidad_outfits(int cantidad_outfits) {
        this.cantidad_outfits = cantidad_outfits;
    }
}
