package ar.edu.unju.escmi.tp3.ejercicio5;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    // Constructor por defecto
    public Producto() {
    }

    // Métodos accesores (getters y setters)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Sobreescritura del método toString
    @Override
    public String toString() {
        return "Producto[codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
}
