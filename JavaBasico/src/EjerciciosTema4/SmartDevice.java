package EjerciciosTema4;

public class SmartDevice {

    // 1. Atributos
    String marca;
    String fabricacionPais;
    int fabricacionAno;
    double peso;
    double alto;
    double ancho;
    double precio;

    // 2. Constructor
    public SmartDevice (){
    }

    public SmartDevice(String marca, String fabricacionPais, int fabricacionAno, double peso,
                       double alto, double ancho, double precio) {
        this.marca = marca;
        this.fabricacionPais = fabricacionPais;
        this.fabricacionAno = fabricacionAno;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.precio = precio;
    }
// 3. Metodos


    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", fabricacionPais='" + fabricacionPais + '\'' +
                ", fabricacionAno=" + fabricacionAno +
                ", peso=" + peso +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", precio=" + precio +
                '}';
    }
}
