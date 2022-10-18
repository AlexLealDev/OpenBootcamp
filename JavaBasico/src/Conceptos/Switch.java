package Conceptos;

public class Switch {

    public static void main(String[] args) {

        String weather = "cloudy";

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo está nublado");
                break;
            case "rainy":
                System.out.println("El tiempo está lluvioso");
                break;
            default:
                System.out.println("El tiempo no está definido");

        }

    }

}
