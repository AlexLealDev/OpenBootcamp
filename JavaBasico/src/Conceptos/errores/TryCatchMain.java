package Conceptos.errores;

public class TryCatchMain {

    public static void main(String[] args) {

        try { //try te da la opción de que el programa corra pese a que contenga un fallo
            int result = 5 / 0;
        } catch (ArithmeticException e) { //dentro del catch escribimos lo que queremos que pase si se produce el problema
            e.printStackTrace(); //esto sirve para poder tener registro del fallo (en color rojo)
        } catch (Exception e) { // sirve para recoger excepciones sin saber la clase
          System.out.println("Estoy en una excepción que no es aritmética"); // en este ejemplo no saleta porque si es aritmética
        } finally { //finally se ejecutará independientemente de si ha ido bien o mal (hay o no error)
            System.out.println("cierre de recursos"); // no siempre es recomendable utilizar finally
        }

        System.out.println("fin");

    }
}
