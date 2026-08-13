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

    @Test
    public void testIsWinning() {
        int value = 2048;
        Cell cell = new Cell(value);

        Board board = new Board();
        board.setCell(0, 0, cell);

        boolean isWinning = board.isWinningBoard();

        assertTrue(isWinning);
    }

    @Test
    public void testIsWinningNegative() {
        int value = 1024;
        Cell cell = new Cell(value);

        Board board = new Board();
        board.setCell(0, 0, cell);

        boolean isWinning = board.isWinningBoard();

        assertFalse(isWinning);
    }
}