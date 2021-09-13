package pongolino.estrutural.composite.caso01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pongolino.estrutural.composite.caso01.component.Funcionario;

public class Time implements Funcionario {

    private List<Funcionario> funcionarios = new ArrayList<>();

    private String nome;
    public Time (String nome) {
        setNome(nome);
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar (Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void remover (Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(this.funcionarios);
    }

    @Override
    public void showCargo() {
        System.out.println("Time: " + getNome());
        for (Funcionario funcionario : getFuncionarios()) {
            funcionario.showCargo();
        }
    }
}
