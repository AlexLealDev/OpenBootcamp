public class Tema9 {

    public class Main  {

        public static void main(String [] args) {
            Persona persona = new Persona();
            persona.edad = 34;
            System.out.println(persona.edad);

            persona.nombre = "Alex Leal";
            System.out.println(persona.nombre);

            persona.telefono = 555349248;
            System.out.println(persona.telefono);
        }

        public static void main(String [] args) {
            Cliente cliente = new Cliente();
            cliente.credito = 10000;
            System.out.println(cliente.credito);
        }

        public static void main(String [] args) {
            Trabajador trabajador = new Trabajador();
            trabajador.salario = 1500;
            System.out.println(trabajador.salario);
        }

    }

    class Persona {
        int edad;
        String nombre;
        int telefono;
    }

    class Cliente extends Persona {
        int credito;
    }

    class Trabajador extends Persona {
        int salario;
    }
}
