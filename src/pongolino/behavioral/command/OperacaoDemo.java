package pongolino.behavioral.command;

import pongolino.behavioral.command.casa.aparelhos.Alarme;
import pongolino.behavioral.command.casa.aparelhos.Luz;
import pongolino.behavioral.command.casa.aparelhos.Radio;
import pongolino.behavioral.command.invoker.ControleAparelhosCasa;
import pongolino.behavioral.command.receivers.ControladorAlarmeReceiver;
import pongolino.behavioral.command.receivers.ControladorLuzReceiver;
import pongolino.behavioral.command.receivers.ControladorRadioReceiver;

public class OperacaoDemo {
    public static void main(String[] args) {
        ControleAparelhosCasa controleAparelhosCasa = new ControleAparelhosCasa();
        controleAparelhosCasa.adicionarControlador("luzCozinha", new ControladorLuzReceiver(new Luz()));
        controleAparelhosCasa.adicionarControlador("luzQuarto", new ControladorLuzReceiver(new Luz()));
        controleAparelhosCasa.adicionarControlador("alarmeGaragem", new ControladorAlarmeReceiver(new Alarme()));

        Radio radio = new Radio();
        radio.setVolume(50);
        radio.setCanal("UM-CANAL-RADIO");
        radio.setTemCD(false);

        controleAparelhosCasa.adicionarControlador("radioSala", new ControladorRadioReceiver(radio));

        Command command = controleAparelhosCasa.pegarOperacaoCadastrada("alarmeGaragem");
        if (command != null) {
            command.pressionarBotao();
            command.pressionarBotao();
        }
    }
}
