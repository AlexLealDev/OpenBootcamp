public class Tema8 {

    public class Main  {

        public static void main(String [] args) {
            Persona persona = new Persona();
            persona.setEdad(34);
            persona.setNombre("Alex Leal");
            persona.setTelefono(555349248);
            System.out.println(persona.getEdad());
            System.out.println(persona.getNombre());
            System.out.println(persona.getTelefono());
        }

    }

    class Persona {
        private int edad;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        private String nombre;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        private int telefono;

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return this.telefono;
        }
    }
}
