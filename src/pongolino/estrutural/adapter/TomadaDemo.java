package pongolino.estrutural.adapter;

public class TomadaDemo {
    public static void main(String[] args) {
        TomadaTresPinos tomadaTresPinos = new TomadaTresPinos();
        TomadaAdapter tomadaAdapter = new TomadaAdapter(tomadaTresPinos);
        tomadaAdapter.conectar();
    }
}
