package pongolino.behavioral.command.receivers;

import pongolino.behavioral.command.Command;
import pongolino.behavioral.command.casa.aparelhos.Luz;

public class ControladorLuzReceiver implements Command {
    private Luz luz;

    public ControladorLuzReceiver(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void pressionarBotao() {
        /*
        * Equivalente a luz.setLigada(!luz.getLigada()))
        * Mas preferi deixar bem simples.
        * */

        if (this.luz.isLigada()) {
            this.luz.desligar();
        }
        else {
            this.luz.ligar();
        }
    }


}
