import java.util.Random;

public class Factura {
    String codigo;
    int mesa;
    int precio;
    Hamburguesa hamb;
    Orden orden;

    public Factura(Orden orden){
        this.codigo = generarCodigo();
        this.mesa = orden.getMesa();
        this.hamb = orden.getHamburguesa();
        this.precio = hamb.getPrecio();
    }

    public String generarCodigo(){
        Random r = new Random();
        int num = r.nextInt(999999);
        return String.format("%06d", num);
    }

    public String toString(){
        String s = "\nLA COCINA DE ICEBOX\n";
        s += "ORDEN NÚMERO " + codigo + "";
        s += "\nDETALLES DE LA COMPRA:\n";
        s += hamb.getNombre() + "\nPRECIO: $" + hamb.getPrecio();
        s += "\nTOTAL: $" + precio;
        s += "\n¡GRACIAS POR SU VISITA!";
        return s;
    }
}
