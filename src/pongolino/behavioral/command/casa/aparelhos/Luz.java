package pongolino.behavioral.command.casa.aparelhos;

public class Luz {
    private boolean ligada;

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        System.out.println("Luz ligada!");
        this.ligada = true;
    }

    public void desligar() {
        System.out.println("Luz desligada!");
        this.ligada = false;
    }

    //    public void ligar() {}
//    public void desligar() {}
}
