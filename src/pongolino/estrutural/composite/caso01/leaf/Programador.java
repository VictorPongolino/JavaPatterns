package pongolino.estrutural.composite.caso01.leaf;


import pongolino.estrutural.composite.caso01.component.Funcionario;

public class Programador implements Funcionario {
    private String nome;
    private String cargo;

    public Programador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void showCargo() {
        System.out.println(String.format("Eu sou %s e meu cargo é de %s !", this.nome, this.cargo));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
