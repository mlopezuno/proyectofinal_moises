package herencia.pasteleria;

public class PastelBoda extends Pastel{
    private int niveles;

    public PastelBoda(){
        setSabor("Almendra");
    }

    public PastelBoda(int niveles, String sabor, double precio) {
        super(sabor, precio);
        this.niveles=niveles;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles=niveles;
    }
}
