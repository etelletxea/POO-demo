package excepciones;

public class Maquina {
    public void inspeccionarEquipaje(Equipaje eq)
    { PeligroException p = new PeligroException(1);
        for (int i=0;i<eq.miArray.length;i++){
            if (eq.miArray[i].peligrosa){
                p.showMessage();
            }
        }
    }

}
