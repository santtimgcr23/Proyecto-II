public class Orden {
    int mesa;
    Hamburguesa hamburguesa;
    int precio;
    public Orden(int mesa, Hamburguesa hamburguesa, int precio) {
        this.mesa = mesa;
        this.hamburguesa = hamburguesa;
        this.precio = precio;
    }

    public int getMesa() {
        return mesa;
    }
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }
    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
