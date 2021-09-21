package pongolino.behavioral.command.receivers;

import pongolino.behavioral.command.casa.aparelhos.Alarme;
import pongolino.behavioral.command.Command;
import pongolino.behavioral.command.casa.aparelhos.Alarme;

public class ControladorAlarmeReceiver implements Command {
    private Alarme alarme;

    public ControladorAlarmeReceiver(Alarme alarme) {
        this.alarme = alarme;
    }

    @Override
    public void pressionarBotao() {
        if (this.alarme.isArmado()) {
            this.alarme.desarmar();
        }
        else {
            this.alarme.armar();
        }
    }
}
