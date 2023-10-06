package projeto.software.game;

public class MobileGameFactory implements GameFactory {
    @Override
    public Textura criarTextura() {
        return new MobileTextura();
    }

    @Override
    public Modelo criarModelo() {
        return new MobileModelo();
    }
}
