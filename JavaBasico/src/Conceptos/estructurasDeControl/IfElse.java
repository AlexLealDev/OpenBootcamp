package Conceptos.estructurasDeControl;

public class IfElse {

    public static void main(String[] args) {

        String dia = "Lunes";
        boolean check = 5 < 10;
        boolean check1 = dia.equals("Lunes");

        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 100;

        if (number1 < number2 && number2 < number3){
            System.out.println("verdadero");
        } else if (number3 < number4) {
            System.out.println("else if");
        } else{
            System.out.println("falso");
        }

        System.out.println("FIN");
    }

}
