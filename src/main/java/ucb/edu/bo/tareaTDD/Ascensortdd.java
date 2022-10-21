package ucb.edu.bo.tareaTDD;

public class Ascensortdd {

    private int pisoA;
    private boolean subiendo;
    private int finalizar;
    private boolean ocupado;

    public Ascensortdd(){
        pisoA = 1;
    }
    public int pisoAscensor(){
        return 1;

    }
    
    public void peticionRealizada(int llegadaSubida){
        subiendo = true;
        finalizar = llegadaSubida;
    }

    public boolean sube(){
        return true;
    }
    public int llegadaSubida(){
        return 0;
    }

    public void personaDentro(int finalizar2){
        subiendo = false;
        ocupado = true;

        pisoA = finalizar;
        finalizar = finalizar2;

    }

    public boolean personaIngresada(){
        return ocupado;
    }

    public void dejarAPersona(){
        subiendo = false;
        ocupado = false;
        pisoA = finalizar;
    }


}
