package projeto.software.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void deveRetornarMobileTextura() {
        GameFactory game = new MobileGameFactory();
        Textura textura = game.criarTextura();
        assertEquals("MobileTextura", textura.getBytes());
    }

    @Test
    void deveRetornarMobileModelo() {
        GameFactory game = new MobileGameFactory();
        Modelo modelo = game.criarModelo();
        assertEquals("MobileModelo", modelo.getBytes());
    }

    @Test
    void deveRetornarPCTextura() {
        GameFactory game = new PCGameFactory();
        Textura textura = game.criarTextura();
        assertEquals("PCTextura", textura.getBytes());
    }

    @Test
    void deveRetornarPCModelo() {
        GameFactory game = new PCGameFactory();
        Modelo modelo = game.criarModelo();
        assertEquals("PCModelo", modelo.getBytes());
    }
}