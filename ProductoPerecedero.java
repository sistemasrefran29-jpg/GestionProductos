/**
 * Segunda clase derivada que hereda de Producto.
 * Representa alimentos o insumos con fecha de caducidad.
 */
public class ProductoPerecedero extends Producto {
    // Atributo único de esta subclase
    private String fechaCaducidad;

    /**
     * Constructor de ProductoPerecedero.
     * Inicializa los miembros heredados usando 'super()' y asigna la fecha de caducidad.
     */
    public ProductoPerecedero(int id, String nombre, double precio, String fechaCaducidad) {
        super(id, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Sobrescritura del método mostrarDetalles() para incluir la caducidad.
     */
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("   [Categoría: Perecedero | Fecha de Caducidad: " + fechaCaducidad + "]");
    }

    /**
     * Método exclusivo de la subclase ProductoPerecedero.
     * Aplica un descuento automático de liquidación por proximidad de caducidad,
     * reutilizando el método aplicarDescuento() heredado de la clase base.
     */
    public void aplicarLiquidacionPorCaducidad() {
        System.out.println("-> Alerta de caducidad próxima (" + fechaCaducidad + "). Aplicando liquidación...");
        super.aplicarDescuento(50); // Reutiliza el método de la clase base
    }
}