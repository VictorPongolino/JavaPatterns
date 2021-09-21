package pongolino.behavioral.command.casa.aparelhos;

public class Radio {
    private boolean ligado;
    private String canal;
    private int volume;
    private boolean temCD;
    private boolean isLendoCD;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTemCD() {
        return temCD;
    }

    public void setTemCD(boolean temCD) {
        this.temCD = temCD;
    }

    public boolean isLendoCD() {
        return isLendoCD;
    }

    public void lerCD() {
        this.isLendoCD = true;
    }

    public void pararLeitorCD () {
        this.isLendoCD = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void ligar() {
        System.out.println("Rádio ligado!");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("Rádio desligado!");
        this.ligado = false;
    }
}
