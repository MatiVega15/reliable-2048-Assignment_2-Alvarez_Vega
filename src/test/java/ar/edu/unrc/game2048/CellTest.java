package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}