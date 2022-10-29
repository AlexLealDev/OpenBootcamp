package EjerciciosTema4;

public class SmartPhone extends SmartDevice {


    // 1. Atributos
    String modelo;
    String sistemaOperativo;
    double pixelsCamara;
    int gigasRam;
    int almacenamiento;
    boolean nfc;

    // 2. Constructor

    public SmartPhone() {
        }

    public SmartPhone(String modelo, String sistemaOperativo, double pixelsCam, int gigasRam, int almacenamiento,
                      boolean nfc) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.pixelsCamara = pixelsCam;
        this.gigasRam = gigasRam;
        this.almacenamiento = almacenamiento;
        this.nfc = nfc;
    }

    // 3. Metodos

}
