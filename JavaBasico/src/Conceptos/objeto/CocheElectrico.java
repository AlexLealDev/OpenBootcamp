package Conceptos.objeto;

public class CocheElectrico extends Coche {
    // al poner extends estamos haciendo una herencia de una clase, usando las propiedades de la original o padre

    String motorElectrico;

    public CocheElectrico(){

    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, double peso, double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
        //el metodo super nos permite invocar a un constructor de la clase posterior
    }

    @Override
    public void acelerar(Integer cantidad) {
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
