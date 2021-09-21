package pongolino.behavioral.command.invoker;

import pongolino.behavioral.command.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControleAparelhosCasa {
//    private List<Command> operacoesCadastradas = new ArrayList<>();
    private Map<String, Command> operacoesCadastradas = new HashMap<>();

    public Command adicionarControlador (String nomeOperacao, Command command) {
        return operacoesCadastradas.put(nomeOperacao, command);
    }

    public Command removerControlador (Command command) {
        return operacoesCadastradas.remove(command);
    }

    public Command pegarOperacaoCadastrada (String operacao) {
        return operacoesCadastradas.containsKey(operacao)
                ? operacoesCadastradas.get(operacao)
                : null;
    }
}
