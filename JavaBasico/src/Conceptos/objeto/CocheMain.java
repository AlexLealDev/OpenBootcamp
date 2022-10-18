package Conceptos.objeto;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "renault";
        //Coche cocheObj = new Coche();

        Coche cocheObj2 = new CocheElectrico("plata", "renault", "megane", 1500.2, 5.4, "combustión");

        //cocheObj2.acelerar(20);
            System.out.println(cocheObj2);

        cocheObj2.peso = 1250.2;
            System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "betería";
        cocheElectrico.color = "red";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "renault", "megane",
                1234.2,3.4, "bateria");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(40);

        System.out.println(cocheElectrico2);

    }

}
