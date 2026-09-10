# Assignment 1 (Software Testing Exercise)

Este documento resume el **proceso de testing, detección y corrección de bugs y refactorización** realizado sobre la implementación del juego 2048.

El trabajo se desarrolló siguiendo las **cuatro fases** propuestas en la consigna:

1. Implementación de tests unitarios.
2. Detección y documentación de bugs.
3. Corrección de bugs y pruebas de regresión.
4. Identificación y refactorización de problemas de diseño.

## Fase 1: Implementación de tests unitarios

Se comenzó implementando **tests unitarios** para las clases principales del juego.

Los tests pueden revisarse en:

- [Tests para la clase `Cell`.](src/test/java/ar/edu/unrc/game2048/CellTest.java)
- [Tests para la clase `Board`.](src/test/java/ar/edu/unrc/game2048/BoardTest.java)

Se procuró **cubrir todos los métodos públicos** de las clases testeadas, incluyendo diferentes casos normales, casos límite y situaciones que pudieran revelar comportamientos incorrectos.

Para evaluar la calidad de las pruebas **se utilizó JaCoCo**, buscando alcanzar una **cobertura completa de sentencias y ramas**, con el fin de **aumentar las posibilidades de detectar errores** existentes en la implementación.

## Fase 2: Detección y documentación de bugs

Los comportamientos incorrectos detectados mediante la ejecución de los tests fueron documentados individualmente mediante **Issues de GitHub**, utilizando la etiqueta `bug`.

Cada Issue inicialmente contiene:

- Una descripción del comportamiento incorrecto.
- La forma en que se detectó el problema.
- La causa probable del error.

Las Issues de bugs pueden consultarse en la sección correspondiente de [Issues cerradas.](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-alvarez-vega/issues?q=is%3Aissue+is%3Aclosed+label%3Abug)

## Fase 3: Corrección de bugs y pruebas de regresión

Luego de identificar los errores, se realizaron las **correcciones correspondientes en el código fuente**.

Para cada bug, se realizó el siguiente **procedimiento**:

1. Se identificó la ubicación del error en el código.
2. Se realizó la modificación necesaria para corregirlo.
3. Se ejecutó nuevamente el test que había detectado el problema.
4. Se ejecutó la suite completa de tests para realizar pruebas de regresión.
5. Se creó un commit descriptivo asociado a la Issue correspondiente.
6. La Issue fue cerrada mediante el mensaje del commit, vinculándola con la corrección realizada. 

Luego de eso, **se actualizó la Issue** para dejar documentado:

- La corrección aplicada.
- La verificación realizada.

De esta manera, cada bug corregido queda documentado y vinculado con su Issue actualizada y con el commit que implementa su solución.

## Fase 4: Identificación y refactorización de problemas de diseño

Luego de completar la corrección de los bugs, se realizó un **análisis del código** para identificar posibles problemas de diseño.

Los problemas encontrados fueron documentados mediante **Issues de GitHub** utilizando la etiqueta `refactor`.

Cada Issue inicialmente contiene:

- Una descripción del problema detectado.
- Su impacto en el diseño.
- Una posible estrategia de refactorización.
- Los criterios de aceptación a cumplir por la refactorización.

Para las refactorizaciones seleccionadas para su implementación, se realizó un proceso incremental, ejecutando la suite completa de tests durante y después de los cambios. Todos los tests continuaron pasando correctamente.

Una vez finalizada cada refactorización, se creó un **commit asociado a su Issue correspondiente**, utilizando el mensaje del commit para cerrar la Issue.

Posteriormente, la Issue fue actualizada agregando:

- Refactorización realizada.
- Verificación.
- Alternativa considerada (opcional).
- Criterios de aceptación cumplidos.

Las refactorizaciones identificadas que no fueron seleccionadas para implementar permanecen **abiertas** ([Issues abiertas](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-alvarez-vega/issues?q=is%3Aissue+is%3Aopen+label%3Arefactor)), mientras que las que fueron implementadas se encuentran documentadas y **cerradas** ([Issues cerradas](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-alvarez-vega/issues?q=is%3Aissue+is%3Aclosed+label%3Arefactor)).

---

# Assignment 2 (Advanced Testing - Coverage, Mutation and Test Generation)

Este apartado detalla la segunda etapa del proyecto, enfocada en la **medición exhaustiva, el análisis de mutaciones y la automatización de pruebas** para robustecer la confiabilidad del juego.

El trabajo se desarrolló siguiendo las **tres fases** propuestas en la consigna:

1. Revisión inicial de métricas de cobertura y mutación.
2. Mejora de la calidad de los tests.
3. Generación automática de pruebas mediante Randoop e implementación de invariantes de representación (`repOK ()`).

## Fase 1: Revisión inicial de métricas de cobertura

Partiendo del Assignment 1, se estableció una línea base ejecutando la suite de pruebas existente. La herramienta **JaCoCo** arrojó un **100% de cobertura de sentencias y ramas** para las clases principales del dominio (`Board` y `Cell`):

| GROUP | PACKAGE | CLASS | INSTRUCTION MISSED | INSTRUCTION COVERED | BRANCH MISSED | BRANCH COVERED | LINE MISSED | LINE COVERED | COMPLEXITY MISSED | COMPLEXITY COVERED | METHOD MISSED | METHOD COVERED |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 2048-game | ar.edu.unrc.game2048 | Cell | 0 | 132 | 0 | 28 | 0 | 23 | 0 | 24 | 0 | 10 |
| 2048-game | ar.edu.unrc.game2048 | Board.Direction | 0 | 27 | 0 | 0 | 0 | 2 | 0 | 1 | 0 | 1 |
| 2048-game | ar.edu.unrc.game2048 | Board | 0 | 906 | 0 | 116 | 0 | 152 | 0 | 82 | 0 | 24 |
| 2048-game | ar.edu.unrc.game2048 | Board.Position | 0 | 62 | 0 | 10 | 0 | 10 | 0 | 9 | 0 | 4 |

Posteriormente, se ejecutó un análisis de mutación utilizando **PITest** para evaluar la fortaleza de los oráculos. La métrica base reveló una **cobertura del 100% en `Cell`**, pero indentificó **15 mutantes sobrevivientes en la clase `Board`**, estableciendo un **90% de cobertura inicial**:

| Name         | Line Coverage | Mutation Coverage | Test Strength |
|--------------|---:|---:|---:|
| Board.java   | 100% (162/162) | 90% (140/155) | 90% (140/155) |
| Cell.java    | 100% (23/23) | 100% (28/28) | 100% (28/28) |

*(Nota: La clase `MainCLI` fue excluida del reporte al no formar parte de los objetivos de testing de dominio).*

## Fase 2: Mejora de la calidad de los tests

Para alcanzar el 100% de cobertura de mutación y eliminar los mutantes sobrevivientes de la clase `Board`, se analizó el reporte de PITest y se procedió a **fortalecer la suite de pruebas y refactorizar el código fuente** mediante las siguientes estrategias.

- Se agregaron casos de prueba en la clase [`BoardTest`](src/test/java/ar/edu/unrc/game2048/BoardTest.java) para cubrir los escenarios faltantes. Principalmente, se incorporaron validaciones que verificaran explícitamente los **índices perimetrales** (por ejemplo, la coordenada '0'), en donde se encontraban la mayoría de los mutantes que lograban sobrevivir.
- Se **refactorizaron** sectores específicos de la implementación de la clase [`Board`](src/main/java/ar/edu/unrc/game2048/Board.java) para limpiar código inalcanzable y corregir lógicas propensas a generar fallos silenciosos.
- Se **delegó la responsabilidad de generación de fichas** a una interfaz [`TileStrategy`](src/main/java/ar/edu/unrc/game2048/TileStrategy.java). Se implementaron las clases [`RandomTileStrategy`](src/main/java/ar/edu/unrc/game2048/RandomTileStrategy.java) (para preservar la jugabilidad en producción con aleatoriedad) y [`DeterministicTileStrategy`](src/main/java/ar/edu/unrc/game2048/DeterministicTileStrategy.java) (para eliminar la aleatoriedad en testing). Este cambio permitió inyectar comportamientos controlados y testear probabilidades matemáticas de forma exacta.

Como resultado de este proceso, se logró alcanzar un **100% de cobertura de mutación, sentencias y ramas** en todas las clases evaluadas: 

### Métricas de Cobertura de Código (JaCoCo)

| GROUP | PACKAGE | CLASS | INSTRUCTION MISSED | INSTRUCTION COVERED | BRANCH MISSED | BRANCH COVERED | LINE MISSED | LINE COVERED | COMPLEXITY MISSED | COMPLEXITY COVERED | METHOD MISSED | METHOD COVERED |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 2048-game | ar.edu.unrc.game2048 | Cell | 0 | 132 | 0 | 28 | 0 | 23 | 0 | 24 | 0 | 10 |
| 2048-game | ar.edu.unrc.game2048 | Board.Direction | 0 | 27 | 0 | 0 | 0 | 2 | 0 | 1 | 0 | 1 |
| 2048-game | ar.edu.unrc.game2048 | RandomTileStrategy | 0 | 37 | 0 | 2 | 0 | 8 | 0 | 5 | 0 | 4 |
| 2048-game | ar.edu.unrc.game2048 | Board | 0 | 909 | 0 | 114 | 0 | 163 | 0 | 82 | 0 | 25 |
| 2048-game | ar.edu.unrc.game2048 | Board.Position | 0 | 62 | 0 | 10 | 0 | 10 | 0 | 9 | 0 | 4 |
| 2048-game | ar.edu.unrc.game2048 | DeterministicTileStrategy | 0 | 45 | 0 | 10 | 0 | 13 | 0 | 8 | 0 | 3 |

### Métricas de Cobertura de Mutación (PITest)

| Name | Line Coverage | Mutation Coverage | Test Strength |
|---|---:|---:|---:|
| Board.java | 100% (173/173) | 100% (145/145) | 100% (145/145) |
| Cell.java | 100% (23/23) | 100% (28/28) | 100% (28/28) |
| DeterministicTileStrategy.java | 100% (13/13) | 100% (8/8) | 100% (8/8) |
| RandomTileStrategy.java | 100% (8/8) | 100% (4/4) | 100% (4/4) |

## Fase 3.1: Generación Automática de Pruebas (Randoop)

En esta etapa se empleó la **herramienta Randoop** para la exploración del dominio y la generación automatizada de casos de prueba sobre las clases `Board`, `Cell` y `DeterministicTileStrategy`. La clase `RandomTileStrategy` no fue considerada, debido a que su comportamiento depende de la generación de valores aleatorios y podría introducir **flakiness (comportamiento inestable)** en las pruebas generadas.

Durante las ejecuciones iniciales se observó que los constructores por defecto de la clase `Board` (`Board ()` y `Board (int)`) instancian internamente una `RandomTileStrategy`. En consecuencia, los objetos `Board` creados mediante estos constructores pueden presentar **estados iniciales diferentes entre ejecuciones**, dificultando la reproducibilidad en las pruebas generadas.

Para garantizar la total confiabilidad y reproducibilidad de la suite, se aplicó una **restricción durante la generación**: se indicó a Randoop que **no utilizara los constructores `Board ()` y `Board (int)`**, especificando sus firmas mediante el argumento `--omit-methods`. De esta forma, Randoop pudo utilizar el constructor `Board (int, TileStrategy)` **e instanciar los tableros inyectando explícitamente la `DeterministicTileStrategy`** desarrollada en la fase 2.

El comando utilizado fue:

```bash
java -cp "lib/randoop-all-4.3.4.jar;target/classes" randoop.main.Main gentests --testclass=ar.edu.unrc.game2048.Cell --testclass=ar.edu.unrc.game2048.Board --testclass=ar.edu.unrc.game2048.DeterministicTileStrategy --omit-methods="ar.edu.unrc.game2048.Board\(\)" --omit-methods="ar.edu.unrc.game2048.Board\(int\)" --time-limit=30 --junit-output-dir=src/test/java --junit-package-name=randoopTests
```

Como resultado, durante un **tiempo límite de 30 segundos**, Randoop generó exitosamente una suite de regresión, [`RegressionTest0.java`](src/test/java/randoopTests/RegressionTest0.java), compuesta por **45 casos de prueba** completamente reproducibles.

Para evaluar la efectividad de la generación automática de pruebas de manera aislada, **se ejecutó exclusivamente la suite generada por Randoop mediante Maven**. Se obtuvieron los siguientes resultados de cobertura estructural y de mutación.

### Cobertura exclusiva de Randoop (JaCoCo)

```bash
mvn clean test jacoco:report "-Dtest=randoopTests.RegressionTest0"
```

| GROUP | PACKAGE | CLASS | INSTRUCTION MISSED | INSTRUCTION COVERED | BRANCH MISSED | BRANCH COVERED | LINE MISSED | LINE COVERED | COMPLEXITY MISSED | COMPLEXITY COVERED | METHOD MISSED | METHOD COVERED |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 2048-game | ar.edu.unrc.game2048 | Cell | 34 | 98 | 9 | 19 | 4 | 19 | 9 | 15 | 1 | 9 |
| 2048-game | ar.edu.unrc.game2048 | Board.Direction | 0 | 27 | 0 | 0 | 0 | 2 | 0 | 1 | 0 | 1 |
| 2048-game | ar.edu.unrc.game2048 | Board | 111 | 798 | 24 | 90 | 17 | 146 | 24 | 58 | 5 | 20 |
| 2048-game | ar.edu.unrc.game2048 | Board.Position | 17 | 45 | 6 | 4 | 1 | 9 | 6 | 3 | 1 | 3 |
| 2048-game | ar.edu.unrc.game2048 | DeterministicTileStrategy | 2 | 43 | 1 | 9 | 1 | 12 | 1 | 7 | 0 | 3 |

### Cobertura exclusiva de Randoop (PITest)

```bash
mvn pitest:mutationCoverage "-DtargetTests=randoopTests.RegressionTest*"
```

| Name | Line Coverage | Mutation Coverage | Test Strength |
|---|---:|---:|---:|
| Board.java | 90% (156/173) | 63% (92/145) | 74% (92/124) |
| Cell.java | 83% (19/23) | 64% (18/28) | 75% (18/24) |
| DeterministicTileStrategy.java | 92% (12/13) | 38% (3/8) | 38% (3/8) |

### Análisis de resultados

Al analizar las métricas obtenidas exclusivamente a partir de las pruebas generadas por Randoop, se observa un **contraste importante con respecto a la suite manual** desarrollada en la fase 2. Si bien la generación automática **logró una cobertura de líneas y ramas considerable**, la **cobertura de mutación fue significativamente menor**.

Esto evidencia una de las **principales limitaciones de la generación aleatoria de pruebas**: las secuencias generadas pueden alcanzar y ejecutar una parte considerable del código y de sus caminos lógicos, pero **no necesariamente producen aserciones suficientemente precisas** para detectar comportamientos incorrectos. En otras palabras, una prueba puede ejecutar una determinada funcionalidad sin verificar de manera efectiva que el resultado obtenido sea el esperado.