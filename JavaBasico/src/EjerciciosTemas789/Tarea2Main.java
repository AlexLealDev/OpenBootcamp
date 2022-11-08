package EjerciciosTemas789;

public class Tarea2Main {

    public static void main(String[] args) {

        int array[][] = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 10;
        array[1][1] = 20;
        array[1][2] = 30;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.println("Estoy en i= " + i + ", + j= " + j);
                System.out.println(array[i][j]);
            }
        }
    }
}
