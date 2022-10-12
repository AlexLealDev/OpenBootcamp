public class Tema4 {

    // PRIMERA PARTE

    public class Main  {

        public static void main(String [] args) {
            int numero = 3;

            if (numero < 0) {
                System.out.println("el número es negativo");
            } else if (numero > 0) {
                System.out.println("el número es positivo");
            } else {
                System.out.println("el número es 0");
            }
        }
    }

// SEGUNDA PARTE

    public class Main  {

        public static void main(String [] args) {
            int numeroWhile = 0;

            while (numeroWhile < 3) {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            }
        }
    }

// TERCERA PARTE

    public class Main  {

        public static void main(String [] args) {
            int numeroWhile = 0;

            do {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            } while (numeroWhile < 3); {
            }
        }
    }


// CUARTA PARTE

    public class Main  {

        public static void main(String [] args) {
            for (int numeroFor = 0; int numeroFor <=3; int numeroFor = numeroFor + 1); {
                System.out.println(numeroFor);
            }
        }
    }

// QUINTA PARTE

    public class Main  {

        public static void main(String [] args) {
            var estacion = "verano";

            switch (estacion) {
                case "verano":
                    System.out.println("es verano");
                    break;
                case "otoño":
                    System.out.println("es otoño");
                    break;
                case "inviero":
                    System.out.println("es invierno");
                    break;
                case "primavera":
                    System.out.println("es primavera");
                    break;
                default:
                    System.out.println("no has introducido una estación");
            }
        }
    }
}
