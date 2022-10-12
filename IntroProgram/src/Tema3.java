public class Tema3 {

// PRIMERA PARTE

    public class parte1 {

        public void main(String[] args) {
            int n1 = 1;
            int n2 = 2;
            int n3 = 3;
            System.out.println("resultado: " + (n1+ n2+ n3));
        }
    }

// SEGUNDA PARTE

    public class parte2 {

        public parte2(String[] args) {
            SEAT miCoche = new SEAT();
            miCoche.sumarPuerta();
            System.out.println(miCoche.puerta);
        }
    }

    class SEAT{

        public int puerta = 1;
        public void sumarPuerta() {
            this.puerta++;
        }

    }
}
