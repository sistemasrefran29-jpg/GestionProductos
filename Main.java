public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIO DEL SISTEMA DE INVENTARIO (HERENCIA) ===\n");

        Producto pBase = new Producto(100, "Escritorio de Oficina", 3500.00);
        pBase.mostrarDetalles();
        System.out.println("--------------------------------------------------");

        ProductoElectronico laptop = new ProductoElectronico(101, "Laptop HP 240R G10", 15000.00, 12);
        laptop.mostrarDetalles();
        laptop.aplicarDescuento(10);
        laptop.extenderGarantia(12);
        laptop.mostrarDetalles();
        System.out.println("--------------------------------------------------");

        ProductoPerecedero leche = new ProductoPerecedero(205, "Caja de Leche Entera (12 pzas)", 280.00, "20/11/2026");
        leche.mostrarDetalles();
        leche.aplicarLiquidacionPorCaducidad();
        leche.mostrarDetalles();
    }
}