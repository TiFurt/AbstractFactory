package projeto.software.game;

public class Game {
    private Textura textura;
    private Modelo modelo;

    public Game(GameFactory gameFactory) {
        this.textura = gameFactory.criarTextura();
        this.modelo = gameFactory.criarModelo();
    }

    public String renderizarTextura() {
        return this.textura.getBytes();
    }

    public String renderizarModelo() {
        return this.modelo.getBytes();
    }
}
