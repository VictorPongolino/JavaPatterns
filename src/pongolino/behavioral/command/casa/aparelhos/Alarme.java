package pongolino.behavioral.command.casa.aparelhos;

public class Alarme {
    private boolean armado;

    public boolean isArmado() {
        return armado;
    }

    public void armar() {
        System.out.println("Alarme armado!");
        this.armado = true;
    }

    public void desarmar() {
        System.out.println("Alarme desarmado!");
        this.armado = false;
    }
}
