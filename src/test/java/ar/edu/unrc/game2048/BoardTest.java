package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Testing de Unidad para los métodos públicos de la clase Board.
 */
public class BoardTest {
    /**
     * Test para el constructor de la clase Board con tamaño por defecto.
     */
    @Test
    public void constructorPorDefectoTest () {
        // Arrange - Act.
        Board tablero = new Board ();

        // Assert.
        assertEquals (4, tablero.getSize ());
        assertEquals (0, tablero.getScore());
    }

    /**
     * Test para el constructor de la clase Board con tamaño pasado como parámetro correcto.
     */
    @Test
    public void constructorTamañoPorParametroCorrectoTest () {
        // Arrange.
        int size = 10;

        // Act.
        Board tablero = new Board (size);

        // Assert.
        assertEquals (10, tablero.getSize ());
        assertEquals (0, tablero.getScore());
    }

    /**
     * Test para el constructor de la clase Board con tamaño pasado como parámetro incorrecto.
     */
    @Test
    public void constructorTamañoPorParametroIncorrectoTest () {
        // Arrange.
        int size = 0;

        // Act - Assert.
        assertThrows (IllegalArgumentException.class, () -> {Board tablero = new Board (size);});
    }

    /**
     * Test para el constructor de la clase Board que copia un tablero dado.
     */
    @Test
    public void constructorCopiaTableroTest () {
        // Arrange.
        Board tablero1 = new Board(10);
        Cell celula1 = new Cell (2);
        tablero1.setCell (0, 0, celula1);

        // Act.
        Board resultado = new Board (tablero1);

        // Assert.
        assertEquals (10, resultado.getSize ());
        assertEquals (0, resultado.getScore());
        assertEquals (celula1, resultado.getCell (0, 0));
    }

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