package factorias;

import partes.Arquero;
import partes.ArqueroMujer;
import partes.Atacante;
import partes.DefensorMujer;
import partes.Defensor;
import partes.AtacanteMujer;

public class EquipoFemenino extends Equipofactory {

@Override
        public Arquero crearArquero(){

            return new ArqueroMujer();

        }

 @Override 
 
        public Defensor  crearDefensor() {

            return new DefensorMujer(); 
                
        }

  @Override
  
        public Atacante crearAtacante(){

            return new AtacanteMujer();
        }
    }   

