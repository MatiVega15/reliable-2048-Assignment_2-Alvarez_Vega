#!/bin/bash
# generate_evosuite_tests.sh

EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
CELL_CLASS="ar.edu.unrc.game2048.Cell"
BOARD_CLASS="ar.edu.unrc.game2048.Board"
SEARCH_BUDGET=60

# Download EvoSuite if not exists
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn clean compile

CLASS_PATH=$(pwd)/target/classes

# Generate tests for Cell
echo "Generating EvoSuite tests for Cell..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $CELL_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

# Generate tests for Board
echo "Generating EvoSuite tests for Board..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $BOARD_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

# Run tests
mvn test
