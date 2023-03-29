package herencia.pasteleria;

public class Pastel {
    private String sabor;
    private double precio;

    public Pastel() {
        sabor = "Vainilla";
    }

    public Pastel(String sabor, double precio) {
        this.sabor = this.sabor;
        this.precio = this.precio;
    }

    protected String getSabor() {return sabor;}

    protected void setSabor(String sabor) {this.sabor=sabor;}

    protected double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        this.precio=precio;
    }
}
