package EjerciciosTema4;

public class Main {

    public static void main(String[] args) {

        SmartDevice huawei = new SmartDevice("Xiaomi", "Taiwan", 2020, 30.5, 15.25,
                2.85, 199.99);

        System.out.println(huawei);

        SmartPhone poco = new SmartPhone("Poco M4", "Android", 64, 64,
                256,true);

        System.out.println(poco);

        SmartWatch redmi = new SmartWatch("Redmi Watch Lite 2", true, true, false);

        System.out.println(redmi);

    }
}
