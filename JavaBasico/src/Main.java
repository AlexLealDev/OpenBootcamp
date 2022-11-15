public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Alex";
        boolean b = "name".getClass().getSimpleName()=="String";
        System.out.println(b);

        boolean a = "name" instanceof String;
        System.out.println(a);
        
        int valor = 15;
        System.out.println(valor % 5 == 0);

        int valor1 = 11;
        System.out.println(valor1 % 5 != 5);
    }
}