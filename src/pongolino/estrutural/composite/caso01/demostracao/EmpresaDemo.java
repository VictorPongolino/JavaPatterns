package pongolino.estrutural.composite.caso01.demostracao;

import pongolino.estrutural.composite.caso01.Time;
import pongolino.estrutural.composite.caso01.leaf.Programador;

public class EmpresaDemo {
    public static void main(String[] args) {
        Time time = new Time("TI");

        Time time2 = new Time("Backend");
        time2.adicionar(new Programador("Victor", "Engenheiro de Software"));
        time2.adicionar(new Programador("Jéssica", "Analista de Sistemas"));
        time2.adicionar(new Programador("Juliana", "Engenheira de Software"));

        Time time3 = new Time("Frontend");
        time3.adicionar(new Programador("Paulinho", "UI"));

        time.adicionar(time2);
        time.adicionar(time3);

        time.showCargo();
    }
}
