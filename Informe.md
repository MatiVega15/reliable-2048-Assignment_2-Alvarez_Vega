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
3. Generación automática de pruebas mediante Randoop e implementación de invariantes de representación (`repOk ()`).

## Fase 1: Revisión inicial de métricas de cobertura

Partiendo del Assignment 1, se estableció una línea base ejecutando la suite de pruebas existente. La herramienta **JaCoCo** arrojó un **100% de cobertura de sentencias y ramas** para las clases principales del dominio (`Board` y `Cell`):

| GROUP | PACKAGE | CLASS | INSTRUCTION MISSED | INSTRUCTION COVERED | BRANCH MISSED | BRANCH COVERED | LINE MISSED | LINE COVERED | COMPLEXITY MISSED | COMPLEXITY COVERED | METHOD MISSED | METHOD COVERED |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 2048-game | ar.edu.unrc.game2048 | Cell | 0 | 132 | 0 | 28 | 0 | 23 | 0 | 24 | 0 | 10 |
| 2048-game | ar.edu.unrc.game2048 | Board.Direction | 0 | 27 | 0 | 0 | 0 | 2 | 0 | 1 | 0 | 1 |
| 2048-game | ar.edu.unrc.game2048 | Board | 0 | 906 | 0 | 116 | 0 | 152 | 0 | 82 | 0 | 24 |
| 2048-game | ar.edu.unrc.game2048 | Board.Position | 0 | 62 | 0 | 10 | 0 | 10 | 0 | 9 | 0 | 4 |

Posteriormente, se ejecutó un análisis de mutación utilizando **PITest** para evaluar la fortaleza de los oráculos. La métrica base reveló una **cobertura del 100% en `Cell`**, pero identificó **15 mutantes sobrevivientes en la clase `Board`**, estableciendo un **90% de cobertura inicial**:

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
java -cp "lib/randoop-all-4.3.4.jar;target/classes" randoop.main.Main gentests --testclass=ar.edu.unrc.game2048.Cell --testclass=ar.edu.unrc.game2048.Board --testclass=ar.edu.unrc.game2048.DeterministicTileStrategy --omit-methods="ar.edu.unrc.game2048.Board\(\)" --omit-methods="ar.edu.unrc.game2048.Board\(int\)" --time-limit=30 --junit-output-dir=src/test/java --junit-package-name=randoopTestsSinRepOk
```

Como resultado, durante un **tiempo límite de 30 segundos**, Randoop generó exitosamente una suite de regresión, [`RegressionTest0.java`](src/test/java/randoopTestsSinRepOk/RegressionTest0.java), compuesta por **45 casos de prueba** completamente reproducibles.

Para evaluar la efectividad de la generación automática de pruebas de manera aislada, **se ejecutó exclusivamente la suite generada por Randoop mediante Maven**. Se obtuvieron los siguientes resultados de cobertura estructural y de mutación.

### Cobertura exclusiva de Randoop (JaCoCo)

```bash
mvn clean test jacoco:report "-Dtest=randoopTestsSinRepOk.RegressionTest0"
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
mvn pitest:mutationCoverage "-DtargetTests=randoopTestsSinRepOk.RegressionTest0"
```

| Name | Line Coverage | Mutation Coverage | Test Strength |
|---|---:|---:|---:|
| Board.java | 90% (156/173) | 63% (92/145) | 74% (92/124) |
| Cell.java | 83% (19/23) | 64% (18/28) | 75% (18/24) |
| DeterministicTileStrategy.java | 92% (12/13) | 38% (3/8) | 38% (3/8) |

### Análisis de resultados

Al analizar las métricas obtenidas exclusivamente a partir de las pruebas generadas por Randoop, se observa un **contraste importante con respecto a la suite manual** desarrollada en la fase 2. Si bien la generación automática **logró una cobertura de líneas y ramas considerable**, la **cobertura de mutación fue significativamente menor**.

Esto evidencia una de las **principales limitaciones de la generación aleatoria de pruebas**: las secuencias generadas pueden alcanzar y ejecutar una parte considerable del código y de sus caminos lógicos, pero **no necesariamente producen aserciones suficientemente precisas** para detectar comportamientos incorrectos. En otras palabras, una prueba puede ejecutar una determinada funcionalidad sin verificar de manera efectiva que el resultado obtenido sea el esperado.

## Fase 3.2: Implementación de invariantes de representación

Como parte de la etapa de generación automática de pruebas, **se incorporó un método `repOk ()`** en las clases [`Cell`](src/main/java/ar/edu/unrc/game2048/Cell.java) y [`Board`](src/main/java/ar/edu/unrc/game2048/Board.java). Este método permite **verificar que los objetos se encuentren en un estado consistente con sus invariantes de representación**.

En la clase `Cell`, se verifica que **el valor de la celda sea no negativo** y que, cuando sea distinto de cero, corresponda a una **potencia de dos**.

En la clase `Board` se verifican los siguientes invariantes:

- `size` debe ser mayor que cero.
- `grid` no debe ser `null`.
- La matriz `grid` debe tener tamaño `size x size`.
- `score` debe ser mayor o igual que cero.
- Ninguna fila de `grid` debe ser `null` y todas deben tener el tamaño correspondiente.
- Ninguna celda debe ser `null`.
- Cada celda debe cumplir su propio `repOk ()`.
- `TileStrategy` debe estar definida.

Además de verificar los estados válidos durante las pruebas existentes, **se agregaron casos específicos para comprobar que `repOk ()` detecta correctamente distintas violaciones de estos invariantes**.

Para alcanzar estas situaciones inválidas **se utilizó reflexión**, ya que algunas de ellas no pueden producirse mediante la interfaz pública de `Board`: el constructor impide crear tableros con tamaños no positivos y garantiza inicialmente la correcta inicialización de la matriz. La reflexión permitió **modificar deliberadamente la representación interna y comprobar el comportamiento defensivo** de `repOk ()`.

### Regeneración de pruebas con Randoop

Una vez incorporados los métodos `repOk ()`, se volvió a **ejecutar Randoop** para analizar cómo la disponibilidad de estos métodos afectaba la exploración automática del dominio.

Se mantuvieron las **mismas restricciones utilizadas en la primera ejecución**: no se incluyeron los constructores `Board ()` y `Board (int)`, debido a que utilizan internamente `RandomTileStrategy`. En su lugar, Randoop utilizó el constructor `Board (int, TileStrategy)`, permitiendo trabajar con `DeterministicTileStrategy` y mantener la reproducibilidad de las pruebas.

El comando utilizado fue:

```bash
java -cp "lib/randoop-all-4.3.4.jar;target/classes" randoop.main.Main gentests --testclass=ar.edu.unrc.game2048.Cell --testclass=ar.edu.unrc.game2048.Board --testclass=ar.edu.unrc.game2048.DeterministicTileStrategy --omit-methods="ar.edu.unrc.game2048.Board\(\)" --omit-methods="ar.edu.unrc.game2048.Board\(int\)" --time-limit=30 --junit-output-dir=src/test/java --junit-package-name=randoopTestsConRepOk
```

La ejecución finalizó correctamente luego de un **tiempo límite de 30 segundos**. Randoop exploró las tres clases indicadas y generó **523 casos de prueba de regresión**, distribuidos entre [`RegressionTest0.java`](src/test/java/randoopTestsConRepOk/RegressionTest0.java) y [`RegressionTest1.java`](src/test/java/randoopTestsConRepOk/RegressionTest1.java).

### Cobertura estructural de la nueva suite de Randoop

Para evaluar exclusivamente la nueva suite generada por Randoop, se ejecutaron `RegressionTest0.java` y `RegressionTest1.java` mediante Maven:

```bash
mvn clean test jacoco:report "-Dtest=randoopTestsConRepOk.RegressionTest0,randoopTestsConRepOk.RegressionTest1"
```

Los **resultados obtenidos mediante JaCoCo** fueron:

| GROUP | PACKAGE | CLASS | INSTRUCTION MISSED | INSTRUCTION COVERED | BRANCH MISSED | BRANCH COVERED | LINE MISSED | LINE COVERED | COMPLEXITY MISSED | COMPLEXITY COVERED | METHOD MISSED | METHOD COVERED |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 2048-game | ar.edu.unrc.game2048 | Cell | 13 | 133 | 3 | 31 | 1 | 23 | 4 | 24 | 1 | 10 |
| 2048-game | ar.edu.unrc.game2048 | Board.Direction | 0 | 27 | 0 | 0 | 0 | 2 | 0 | 1 | 0 | 1 |
| 2048-game | ar.edu.unrc.game2048 | Board | 234 | 750 | 37 | 99 | 39 | 142 | 30 | 64 | 4 | 22 |
| 2048-game | ar.edu.unrc.game2048 | Board.Position | 2 | 60 | 3 | 7 | 0 | 10 | 3 | 6 | 0 | 4 |
| 2048-game | ar.edu.unrc.game2048 | DeterministicTileStrategy | 2 | 43 | 1 | 9 | 1 | 12 | 1 | 7 | 0 | 3 |

### Cobertura de mutación de la nueva suite de Randoop

Finalmente, se utilizó **PITest** para evaluar la capacidad de la nueva suite automática para detectar modificaciones artificiales en el código:

```bash
mvn pitest:mutationCoverage "-DtargetTests=randoopTestsConRepOk.RegressionTest0,randoopTestsConRepOk.RegressionTest1"
```

Los resultados obtenidos fueron:

| Name | Line Coverage | Mutation Coverage | Test Strength |
|---|---:|---:|---:|
| Board.java | 80% (152/191) | 69% (116/168) | 89% (116/130) |
| Cell.java | 96% (23/24) | 91% (30/33) | 97% (30/31) |
| DeterministicTileStrategy.java | 92% (12/13) | 88% (7/8) | 88% (7/8) |

### Análisis de resultados

Al comparar los resultados obtenidos con la suite inicial de Randoop y la nueva suite generada luego de incorporar los métodos `repOk ()`, se observa una **mejora general en la efectividad de las pruebas, especialmente en términos de cobertura de mutación**.

En primer lugar, la cantidad de pruebas generadas aumentó considerablemente: **la primera ejecución produjo 45 casos de prueba, mientras que la nueva ejecución generó 523 casos de prueba**. Esto representa una exploración mucho más amplia de las combinaciones de operaciones y estados posibles de las clases analizadas.

En cuanto a la cobertura estructural medida con JaCoCo, se observa una mejora en algunas clases. En `Cell`, por ejemplo, la **cobertura de instrucciones** pasó de aproximadamente **74% a 91%**, mientras que la **cobertura de ramas** pasó de aproximadamente **68% a 91%**. En `Board.Position` la **cobertura de instrucciones** pasó de aproximadamente **71% a 97%**, y la **cobertura de ramas** pasó de **40% a 70%**. Por su parte, `DeterministicTileStrategy` mantuvo una cobertura elevada, con más del **95% de instrucciones cubiertas** y un **90% de ramas cubiertas**.

En `Board` se observa una situación diferente: **aunque la cantidad absoluta de ramas cubiertas aumentó, el porcentaje de cobertura disminuyó**. Esto se debe principalmente a que la incorporación de `repOk ()` y del código asociado a la verificación de invariantes **incrementó la cantidad total de código** que puede ser cubierto. Por ejemplo, la cantidad de ramas cubiertas pasó de 90 a 99. Por lo tanto, **el porcentaje de cobertura no debe interpretarse de manera aislada como un empeoramiento de las pruebas**. Además, la nueva suite contiene 523 pruebas frente a las 45 anteriores, por lo que representa una exploración considerablemente mayor del comportamiento del sistema.

La mejora más significativa se observa en la cobertura de mutación obtenida con **PITest**. En `Board`, la **cobertura de mutación** aumentó de **63% a 69%**, mientras que en `Cell` pasó de **64% a 91%**. La mejora más importante se produjo en `DeterministicTileStrategy`, donde aumentó de **38% a 88%**. También mejoró considerablemente el **Test Strength**, pasando de **74% a 89%** en `Board`, de **75% a 97%** en `Cell` y de **38% a 88%** en `DeterministicTileStrategy`.

El aumento de la cobertura de mutación indica que la nueva suite no solo explora más código, sino que también posee una **mayor capacidad para detectar comportamientos incorrectos**.

En conclusión, **la nueva ejecución de Randoop produjo una mejora sustancial en la calidad y capacidad de detección de las pruebas**, aún cuando no todas las métricas porcentuales de cobertura estructural aumentaron. La diferencia entre ambas ejecuciones también muestra que **un mayor número de pruebas no implica necesariamente un aumento proporcional de la cobertura de código**: al incorporar nuevos comportamientos e invariantes, también aumenta el código que debe ser cubierto. Por ese motivo, en este caso resulta especialmente importante **analizar conjuntamente la cobertura estructural, la cobertura de mutación y el Test Strength**.