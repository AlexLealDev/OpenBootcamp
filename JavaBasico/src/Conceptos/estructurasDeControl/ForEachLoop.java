package Conceptos.estructurasDeControl;

public class ForEachLoop {

    public static void main(String[] args) {

        int suma = 10;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int numero : numeros){
            System.out.println(suma += numero);
        }

    }

}
