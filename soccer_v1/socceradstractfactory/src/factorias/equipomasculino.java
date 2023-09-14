package factorias;

import partes.Arquero;
import partes.ArqueroHombre;
import partes.Atacante;
import partes.Defensor;
import partes.DefensorHombre;
import partes.AtacanteHombre;

public class equipomasculino  extends Equipofactory {

@Override
        public Arquero crearArquero(){

            return new ArqueroHombre();
                
        }

 @Override 
 
        public Defensor  crearDefensor() {

            return new DefensorHombre();
                
        }

  @Override
  
        public Atacante crearAtacante(){

            return new AtacanteHombre();
        }
    }   
    

