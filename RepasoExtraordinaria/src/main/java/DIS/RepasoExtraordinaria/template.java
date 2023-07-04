package DIS.RepasoExtraordinaria;

public class template {

    private String nombre;
    private String categoria;
    private Double precio;
    private String EAN13;

    public template(String nombre, String categoria, int precio, String EAN13){
        this.nombre= nombre;
        this.categoria= categoria;
        this.precio= Double.valueOf(precio);
        this.EAN13=EAN13;

    }

    public template() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getEAN13() {
        return EAN13;
    }

    public void setEAN13(String EAN13) {
        this.EAN13 = EAN13;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre=" + nombre +
                ", categoria='" + categoria + '\'' +
                ", precio='" + precio + '\'' +
                ", EAN13='" + EAN13 + '\'' +
                '\n';
    }



}
