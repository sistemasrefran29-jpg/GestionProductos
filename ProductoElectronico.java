public class ProductoElectronico extends Producto {
    private int mesesGarantia;

    public ProductoElectronico(int id, String nombre, double precio, int mesesGarantia) {
        super(id, nombre, precio);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("   [Categoría: Electrónica | Garantía: " + mesesGarantia + " meses]");
    }

    public void extenderGarantia(int mesesExtra) {
        this.mesesGarantia += mesesExtra;
        System.out.println("-> Garantía extendida en " + mesesExtra + " meses para " + nombre + ". Total: " + mesesGarantia + " meses.");
    }
}