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