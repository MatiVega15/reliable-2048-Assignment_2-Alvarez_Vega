package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Testing de Unidad para los métodos públicos de la clase Board.
 */
public class BoardTest {
    @Test
    public void testSize() {
        int value = Board.DEFAULT_SIZE;
        Board board = new Board();
        boolean isBoardCorrect = board.getSize() == value;

        assertTrue(isBoardCorrect);
    }

    @Test
    public void testNotValidSize() {
        int value1 = 4;
        int value2 = 2;
        Board board = new Board(value1);
        boolean isBoardCorrect = board.getSize() == value2;

        assertFalse(isBoardCorrect);
    }
}