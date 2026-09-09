package ar.edu.unrc.game2048;

import java.util.Set;

/**
 * Implementación determinista diseñada específicamente para la suite de testing.
 * Elimina la aleatoriedad para garantizar la reproducibilidad de las pruebas unitarias.
 */
public class DeterministicTileStrategy implements TileStrategy {
    /**
     * Selecciona siempre la primera posición vacía disponible, ordenando las coordenadas
     * estrictamente de izquierda a derecha y de arriba hacia abajo.
     *
     * @param posicionesVacias Conjunto de posiciones disponibles en el tablero.
     * @return La posición vacía con el menor índice de fila y columna.
     */
    @Override
    public Board.Position determinarPosicion (Set <Board.Position> posicionesVacias) {
        Board.Position mejorPosicion = null;

        for (Board.Position actual : posicionesVacias) {
            // Asigna la primera posición como base para comparar.
            if (mejorPosicion == null) {
                mejorPosicion = actual;
                continue;
            }

            // Si la celda actual está en una fila superior, es la nueva mejor candidata.
            if (actual.row < mejorPosicion.row) {
                mejorPosicion = actual;
            }

            // Si están en la misma fila, gana la que esté más a la izquierda.
            else if (actual.row == mejorPosicion.row && actual.col < mejorPosicion.col) {
                mejorPosicion = actual;
            }
        }

        return mejorPosicion;
    }

    /**
     * Asigna un valor constante para anular la variación aleatoria.
     *
     * @return Siempre devuelve el valor 2.
     */
    @Override
    public int determinarValor () {
        return 2;
    }
}