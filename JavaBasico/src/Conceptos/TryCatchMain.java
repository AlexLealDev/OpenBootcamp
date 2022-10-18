package Conceptos;

public class TryCatchMain {

    public static void main(String[] args) {

        try { //try te da la opción de que el programa corra pese a que contenga un fallo
            int result = 5 / 0;
        } catch (ArithmeticException e) { //dentro del catch escribimos lo que queremos que pase si se produce el problema
            e.printStackTrace(); //esto sirve para poder tener registro del fallo (en color rojo)
        } finally { //finally se ejecutará independientemente de si ha ido bien o mal (hay o no error)
            System.out.println("cierre de recursos");
        }

        System.out.println("fin");

    }
}
