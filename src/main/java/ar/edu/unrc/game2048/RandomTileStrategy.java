package ar.edu.unrc.game2048;

import java.util.Random;
import java.util.Set;

/**
 * Implementación estándar para el entorno de producción del juego 2048.
 * Utiliza un generador pseudoaleatorio para simular la aparición impredecible
 * de las fichas, cumpliendo con las reglas clásicas del juego.
 */
public class RandomTileStrategy implements TileStrategy {
    private final Random random;

    public RandomTileStrategy () {
        this (new Random ());
    }

    public RandomTileStrategy (Random random) {
        this.random = random;
    }

    /**
     * Elige una posición al azar con un generador pseudoaleatorio sobre los espacios vacíos del tablero.
     *
     * @param posicionesVacias Conjunto de posiciones disponibles para ubicar la ficha.
     * @return Una posición aleatoria extraída del conjunto.
     */
    @Override
    public Board.Position determinarPosicion (Set <Board.Position> posicionesVacias) {
        int randomIndex = random.nextInt (posicionesVacias.size ());
        return posicionesVacias.stream ().skip (randomIndex).findFirst ().get ();
    }

    /**
     * Calcula el valor de la nueva ficha respetando las probabilidades del 2048:
     * 90% de probabilidad para el valor 2 y 10% de probabilidad para el valor 4.
     *
     * @return 2 o 4, según la probabilidad calculada.
     */
    @Override
    public int determinarValor () {
        return random.nextDouble () < 0.9 ? 2 : 4;
    }
}