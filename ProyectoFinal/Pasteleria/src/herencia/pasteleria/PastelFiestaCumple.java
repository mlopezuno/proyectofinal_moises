package herencia.pasteleria;

public class PastelFiestaCumple extends Pastel{
        private int velas;

        public PastelFiestaCumple(){
                setSabor("Chocolate");
        }

        public PastelFiestaCumple(int velas, String sabor, double precio) {
                super (sabor, precio);
                this.velas = velas;
        }

        public int getVelas() {
                return velas;
        }

        public void setVelas(int velas) {
                this.velas=velas;
        }
}
