package EjerciciosTema4;

public class SmartWatch extends SmartDevice{

    // 1. Atributos

    String modelo;
    boolean nfc;
    boolean frecuenciaCardiaca;
    boolean microfono;

    // 2. Constructor

    public SmartWatch(){
    }

    public SmartWatch(String modelo, boolean nfc, boolean frecuenciaCardiaca, boolean microfono){
        this.modelo = modelo;
        this.nfc = nfc;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.microfono = microfono;
    }

    // 3. Metodos


    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", nfc=" + nfc +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", microfono=" + microfono +
                '}';
    }
}
