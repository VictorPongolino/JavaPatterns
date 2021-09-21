package pongolino.behavioral.command.receivers;

import pongolino.behavioral.command.Command;
import pongolino.behavioral.command.casa.aparelhos.Radio;

public class ControladorRadioReceiver implements Command {
    private Radio radio;

    public ControladorRadioReceiver(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void pressionarBotao() {
        if (this.radio.isLigado()) {
            this.radio.desligar();
        } else {
          this.radio.ligar();
        }
    }
}
