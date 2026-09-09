package ar.edu.unrc.game2048;

import java.util.Set;

/**
 * Define la estrategia para la generación de nuevas fichas en el tablero de 2048.
 * Implementa el patrón Strategy para aislar la lógica de aparición, permitiendo
 * inyectar comportamientos aleatorios para el juego real o deterministas para pruebas.
 */
public interface TileStrategy {
    /**
     * Selecciona una coordenada específica dentro del conjunto de celdas disponibles.
     *
     * @param posicionesVacias Un conjunto con todas las posiciones desocupadas del tablero.
     * @return La posición elegida para colocar la nueva ficha.
     */
    Board.Position determinarPosicion (Set <Board.Position> posicionesVacias);

    /**
     * Define el valor numérico que tendrá la nueva ficha generada.
     *
     * @return El valor de la ficha (típicamente 2 o 4).
     */
    int determinarValor ();
}