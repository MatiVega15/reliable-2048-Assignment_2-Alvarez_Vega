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
        int valor = 3;
        Cell celda = new Cell (valor);

        // Act
        boolean empty = celda.isEmpty();

        // Assert.
        assertFalse(empty);
    }
    
}