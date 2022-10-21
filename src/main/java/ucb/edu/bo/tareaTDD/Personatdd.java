package ucb.edu.bo.tareaTDD;

public class Personatdd {

    private int pisoA;
    private int seleccionado;

    public Personatdd(){
        pisoA = (int)(Math.random()*(3)+1);
    }

    public int getPisoPersonatdd(){
        return pisoA;
    }

    public void setSeleccion(){
        do{
            System.out.println("Seleccion de la persona");
            seleccionado = (int)(Math.random()*(3)+1);
        }while(seleccionado==pisoA);
    }

    public int getSeleccion(){
        return seleccionado;
    }
    
}
