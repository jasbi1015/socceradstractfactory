package factorias;

import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

    
public abstract class Equipofactory{

protected abstract Arquero crearArquero();
protected abstract Defensor crearDefensor();
protected abstract Atacante crearAtacante();

}
