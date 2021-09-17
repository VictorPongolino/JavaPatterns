package pongolino.estrutural.adapter;

public class TomadaAdapter extends TomadaDoisPinos{
    private TomadaTresPinos tomadaTresPinos;
    public TomadaAdapter(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }

    @Override
    public void conectar() {
        System.out.println("Adaptado tomada de três pinos em uma tomada de dois ...!");
        tomadaTresPinos.conectar();
        super.conectar();
    }
}
