/**
 * Clase base (Superclase) que representa un producto genérico en el sistema.
 * Contiene los atributos y comportamientos comunes que serán heredados
 * por las clases derivadas.
 */
public class Producto {
    // Se utiliza 'protected' para permitir que las clases hijas accedan
    // directamente a estos atributos manteniendo el encapsulamiento.
    protected int id;
    protected String nombre;
    protected double precio;

    /**
     * Constructor de la clase base Producto.
     * @param id Identificador único del producto.
     * @param nombre Nombre comercial del producto.
     * @param precio Precio base del producto.
     */
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método base para mostrar la información general del producto.
     * Será sobrescrito por las subclases para añadir detalles específicos.
     */
    public void mostrarDetalles() {
        System.out.println("ID: " + id + " | Producto: " + nombre + " | Precio: $" + String.format("%.2f", precio));
    }

    /**
     * Método reutilizable que aplica un porcentaje de descuento al precio actual.
     * @param porcentaje Porcentaje a descontar (ej. 10 para 10%).
     */
    public void aplicarDescuento(double porcentaje) {
        double descuento = this.precio * (porcentaje / 100);
        this.precio -= descuento;
        System.out.println("-> Se aplicó un " + porcentaje + "% de descuento a: " + nombre);
    }
}