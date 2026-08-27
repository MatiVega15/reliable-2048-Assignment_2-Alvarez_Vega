package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Set;

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
    public void testGetScore() {
        int value = 2048;
        Cell cell = new Cell(value);

        Board board = new Board();
        board.setCell(0, 0, cell);

        boolean isValid = board.getScore() == value;

        assertFalse(isValid);
    }

    @Test
    public void testAddCell() {
        int value = 512;
        Cell cell = new Cell(value);

        Board board = new Board();
        board.setCell(1, 0, cell);

        boolean isAdded = board.getCell(1, 0).equals(cell);

        assertTrue(isAdded);
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

    @Test
    public void testIsLosing() {
        //Arrange
        Board board = new Board(2);
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(16);
        Cell cell3 = new Cell(8);
        Cell cell4 = new Cell(32);
        board.setCell(0, 0, cell1);
        board.setCell(0, 1, cell2);
        board.setCell(1,0, cell3);
        board.setCell(1, 1, cell4);
        // Act - Assert
        assertTrue(board.isLosingBoard());
    }

    /**
     * Test para el método isLosing con al menos una celda vacía.
     */
    @Test
    public void isLosingBoardConCeldaVaciaTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (4));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, Cell.EMPTY);

        // Act.
        boolean resultado = tablero.isLosingBoard ();

        // Assert.
        assertFalse (resultado);
    }

    /**
     * Test para el método isLosing con fusión horizontal.
     */
    @Test
    public void isLosingBoardConFusionesHorizontalesTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (2));
        tablero.setCell (1, 0, new Cell (4));
        tablero.setCell (1, 1, new Cell (8));

        // Act.
        boolean resultado = tablero.isLosingBoard ();

        // Assert.
        assertFalse (resultado);
    }

    /**
     * Test para el método isLosing con fusión horizontal.
     */
    @Test
    public void isLosingBoardConFusionesHorizontalesTableroMayorTest () {
        // Arrange.
        Board tablero = new Board (3);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (2));
        tablero.setCell (0, 2, new Cell (4));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, new Cell (16));
        tablero.setCell (1, 2, new Cell (32));
        tablero.setCell (2, 0, new Cell (64));
        tablero.setCell (2, 1, new Cell (128));
        tablero.setCell (2, 2, new Cell (256));

        // Act.
        boolean resultado = tablero.isLosingBoard ();

        // Assert.
        assertFalse (resultado);
    }

    /**
     * Test para el método isLosing con fusión horizontal.
     */
    @Test
    public void isLosingBoardConFusionesHorizontalesUltimasColumnasTest () {
        // Arrange.
        Board tablero = new Board (3);
        tablero.setCell (0, 0, new Cell (4));
        tablero.setCell (0, 1, new Cell (2));
        tablero.setCell (0, 2, new Cell (2));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, new Cell (16));
        tablero.setCell (1, 2, new Cell (32));
        tablero.setCell (2, 0, new Cell (64));
        tablero.setCell (2, 1, new Cell (128));
        tablero.setCell (2, 2, new Cell (256));

        // Act.
        boolean resultado = tablero.isLosingBoard ();

        // Assert.
        assertFalse (resultado);
    }

    /**
     * Test para el método isLosing con fusión vertical.
     */
    @Test
    public void isLosingBoardConFusionesVerticalesTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (4));
        tablero.setCell (1, 0, new Cell (2));
        tablero.setCell (1, 1, new Cell (8));

        // Act.
        boolean resultado = tablero.isLosingBoard ();

        // Assert.
        assertFalse (resultado);
    }

    @Test
    public void testFullBoardLleno(){
        //Arrange
                Board board = new Board(2);
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(16);
        Cell cell3 = new Cell(8);
        Cell cell4 = new Cell(32);
        board.setCell(0, 0, cell1);
        board.setCell(0, 1, cell2);
        board.setCell(1,0, cell3);
        board.setCell(1, 1, cell4);
        // Act - Assert
        assertTrue(board.isFull());
    }

    @Test
    public void testFullBoardNoLlenoConCeldas(){
        //Arrange
                Board board = new Board(2);
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(16);
        Cell cell3 = new Cell(8);
        board.setCell(0, 0, cell1);
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1,0, cell3);
        board.setCell(1, 1, cell2);
        // Act - Assert
        assertFalse(board.isFull());
    }

    @Test
    public void testFullBoardNoLlenoSinCeldas(){
        //Arrange
                Board board = new Board(2);
        // Act - Assert
        assertFalse(board.isFull());
    }

    /**
     * Test para el método hasEmptyCell con al menos una celda vacía.
     */
    @Test
    public void hasEmptyCellConCeldaVaciaTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (4));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, Cell.EMPTY);

        // Act.
        boolean resultado = tablero.hasEmptyCells ();

        // Assert.
        assertTrue (resultado);
    }

    /**
     * Test para el método hasEmptyCell sin celdas vacías.
     */
    @Test
    public void hasEmptyCellSinCeldaVaciaTest () {
        // Arrange.
        Board tablero = new Board (1);
        tablero.setCell (0, 0, new Cell (2));

        // Act.
        boolean resultado = tablero.hasEmptyCells ();

        // Assert.
        assertFalse (resultado);
    }

    @Test
    public void testMoveUp() {
        int value = 2;

        Cell finalCell = new Cell(2 * value);
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        Board board = new Board();
        board.setCell(0, 0, myCell1);
        board.setCell(1, 0, myCell2);
        assertTrue(board.moveUp());

        boolean movedUp = board.getCell(0, 0).equals(finalCell);

        assertTrue(movedUp);
    }

    /**
     * Test para el método moveUp sin movimiento.
     */
    @Test
    public void moveUpSinMovimientoTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (8));
        tablero.setCell (1, 0, new Cell (4));
        tablero.setCell (1, 1, new Cell (16));

        // Act.
        boolean resultado = tablero.moveUp ();

        // Assert.
        assertFalse (resultado);
        assertEquals (2, tablero.getCell (0, 0).getValue ());
        assertEquals (4, tablero.getCell (1, 0).getValue ());
        assertEquals (8, tablero.getCell (0, 1).getValue ());
        assertEquals (16, tablero.getCell (1, 1).getValue ());
    }

    /**
     * Test para el método moveUp sin fusiones.
     */
    @Test
    public void moveUpSinFusionesTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, Cell.EMPTY);
        tablero.setCell (0, 1, new Cell (8));
        tablero.setCell (1, 0, new Cell (2));
        tablero.setCell (1, 1, new Cell (16));

        // Act.
        boolean resultado = tablero.moveUp ();

        // Assert.
        assertTrue (resultado);
        assertEquals (2, tablero.getCell (0, 0).getValue ());
        assertEquals (8, tablero.getCell (0, 1).getValue ());
    }

    @Test
    public void testMoveDown() {
        int value = 2;

        Cell finalCell = new Cell(2 * value);
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        Board board = new Board();
        board.setCell(2, 0, myCell1);
        board.setCell(3, 0, myCell2);
        assertTrue(board.moveDown());

        boolean movedUp = board.getCell(3, 0).equals(finalCell);

        assertTrue(movedUp);
    }

    @Test
    public void testMoveLeft() {
        int value = 2;

        Cell finalCell = new Cell(2 * value);
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        Board board = new Board();
        board.setCell(0, 0, myCell1);
        board.setCell(0, 1, myCell2);
        assertTrue(board.moveLeft());

        boolean movedUp = board.getCell(0, 0).equals(finalCell);

        assertTrue(movedUp);
    }

    @Test
    public void testMoveRight() {
        int value = 2;

        Cell finalCell = new Cell(2 * value);
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        Board board = new Board();
        board.setCell(0, 2, myCell1);
        board.setCell(0, 3, myCell2);
        assertTrue(board.moveRight());

        boolean movedUp = board.getCell(0, 3).equals(finalCell);

        assertTrue(movedUp);
    }

    /**
     * Test para el método getEmptyPositions con celdas vacías.
     */
    @Test
    public void getEmptyPositionsConCeldasVaciasTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (4));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, Cell.EMPTY);

        // Act.
        Set <Board.Position> conjunto = tablero.getEmptyPositions ();

        // Assert.
        assertEquals (1, conjunto.size ());
    }

    /**
     * Test para el método getEmptyPositions sin celdas vacías.
     */
    @Test
    public void getEmptyPositionsSinCeldasVaciasTest () {
        // Arrange.
        Board tablero = new Board (2);
        tablero.setCell (0, 0, new Cell (2));
        tablero.setCell (0, 1, new Cell (4));
        tablero.setCell (1, 0, new Cell (8));
        tablero.setCell (1, 1, new Cell (8));

        // Act.
        Set <Board.Position> conjunto = tablero.getEmptyPositions ();

        // Assert.
        assertTrue (conjunto.isEmpty ());
    }

    /**
     * Test para el método getCell con una columna inválida.
     */
    @Test
    public void getCellColumnaInvalidaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.getCell (2, 0);});
    }

    /**
     * Test para el método getCell con una fila inválida.
     */
    @Test
    public void getCellFilaInvalidaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.getCell (1, -1);});
    }

    /**
     * Test para el método getCell con una posición inválida negativa.
     */
    @Test
    public void getCellPosicionNegativaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.getCell (-2, -1);});
    }

    /**
     * Test para el método getCell con una posición válida.
     */
    @Test
    public void getCellPosicionValidaTest () {
        // Arrange.
        Board tablero = new Board (2);
        Cell celda = new Cell (8);
        tablero.setCell (0, 0, celda);

        // Act.
        Cell resultado = tablero.getCell (0, 0);

        // Asssert.
        assertEquals (celda, resultado);
    }

    /**
     * Test para el método setCell con celda nula.
     */
    @Test
    public void setCellNulaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IllegalArgumentException.class, () -> {tablero.setCell (0, 0, null);});
    }

    /**
     * Test para el método setCell con fila inválida.
     */
    @Test
    public void setCellFilaInvalidaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.setCell (2, 0, new Cell (2));});
    }

    /**
     * Test para el método setCell con columna inválida.
     */
    @Test
    public void setCellColumnaInvalidaTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.setCell (0, 2, new Cell (2));});
    }

    /**
     * Test para el método setCell con fila y columna inválida.
     */
    @Test
    public void setCellFilaYColumnaInvalidasTest () {
        // Arrange.
        Board tablero = new Board (2);

        // Act - Asssert.
        assertThrows (IndexOutOfBoundsException.class, () -> {tablero.setCell (2, 2, new Cell (2));});
    }
}