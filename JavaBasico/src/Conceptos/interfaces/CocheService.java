package Conceptos.interfaces;

import Conceptos.objeto.Coche;

public interface CocheService {
    // la interface define el contrato para definir lo que hay que hacer
    // una de las clases que implemente la interface para definir como lo va a hacer
    // por lo que puede haber múltiples implementaciones de lo mismo

    public Coche crearCocheDemo();

    public void destruirCoche(Coche coche);
    // al crear esta nueva clase tengo que ir al resto de implementaciones ya que al crear un nuevo método estamos obligando
    // a que estas clases lo implementen




}
