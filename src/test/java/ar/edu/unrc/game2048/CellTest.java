package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Testing de Unidad para los métodos públicos de la clase Cell.
 */
public class CellTest {

    /**
     * Test para el constructor de la clase Cell con parámetro correcto.
     */
    @Test
    public void constructorCorrectoTest () {
        // Arrange.
        int valor = 0;

        // Act.
        Cell celda = new Cell (valor);

        // Assert.
        assertTrue (celda.isEmpty ());
        assertEquals (valor, celda.getValue ());
    }

    /**
     * Test para el constructor de la clase Cell con parámetro incorrecto.
     */
    @Test
    public void constructorExcepcionTest () {
        // Arrange.
        int valor = -1;

        // Act - Assert.
        assertThrows (IllegalArgumentException.class, () -> {Cell celula = new Cell (valor);});
    }

    /**
     * Test para el constructor de la clase Cell con parametro no potencia de 2
     */
    @Test
    public void TestCellBadValue() {
        // Arrange.
        int value = 3;

        // Act - Assert.
        assertThrows(IllegalArgumentException.class, () -> {
            new Cell(value); 
        });
    }

    @Test 
    public void isEmptyTest(){
        // Arrange.
        int valor = 0;
        Cell celda = new Cell (valor);

        // Act
        boolean empty = celda.isEmpty();

        // Assert.
        assertTrue(empty);
    }

    @Test
    public void isEmptyFalso(){
        // Arrange.
        int valor = 4;
        Cell celda = new Cell (valor);

        // Act
        boolean empty = celda.isEmpty();

        // Assert.
        assertFalse(empty);
    }

    @Test
    public void testGetValue(){
        // Arrange
        int valor = 2;
        Cell celda = new Cell(valor);

        // Act - Assert.
        assertEquals(2, celda.getValue());
    }

    @Test
    public void canMergeValid() {
        int value = 2;
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        boolean canMerge = myCell1.canMergeWith(myCell2);

        assertTrue(canMerge);
    }

    @Test
    public void canMergeInvalidNewEmpty() {
        int value = 2;
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(0);

        boolean canMerge = myCell1.canMergeWith(myCell2);

        assertFalse(canMerge);
    }

    @Test
    public void canMergeInvalidEmpty() {
        int value = 2;
        Cell myCell1 = new Cell(0);
        Cell myCell2 = new Cell(value);

        boolean canMerge = myCell1.canMergeWith(myCell2);

        assertFalse(canMerge);
    }

    /**
     * Test para el método mergeWith con celdas del mismo valor.
     */
    @Test
    public void mergeWithCorrectoTest () {
        // Arrange.
        Cell celda1 = new Cell (2);
        Cell celda2 = new Cell (2);

        // Act.
        Cell resultado = celda1.mergeWith (celda2);

        // Assert.
        assertFalse (resultado.isEmpty ());
        assertEquals (4, resultado.getValue ());
    }

    /**
     * Test para el método mergeWith con celdas de distinto valor.
     */
    @Test
    public void mergeWithIncorrectoTest () {
        // Arrange.
        Cell celda1 = new Cell (2);
        Cell celda2 = new Cell (4);

        // Act - Assert.
        assertThrows (IllegalArgumentException.class, () -> {celda1.mergeWith (celda2);});
    }

    @Test
    public void equalsTestPositive() {
        int value = 2;
        Cell myCell1 = new Cell(value);
        Cell myCell2 = new Cell(value);

        boolean canMerge = myCell1.equals(myCell2);

        assertTrue(canMerge);
    }

    @Test
    public void equalsTestNegative() {
        int value1 = 0;
        int value2 = 2;
        Cell myCell1 = new Cell(value1);
        Cell myCell2 = new Cell(value2);

        boolean canMerge = myCell1.equals(myCell2);

        assertFalse(canMerge);
    }
}