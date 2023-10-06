package projeto.software.game;

public class PCGameFactory implements GameFactory {
    @Override
    public Textura criarTextura() {
        return new PCTextura();
    }

    @Override
    public Modelo criarModelo() {
        return new PCModelo();
    }
}
