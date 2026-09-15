package randoopTestsSinRepOk;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board2.getCell(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        java.lang.Class<?> wildcardClass3 = deterministicTileStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy0 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        int int1 = deterministicTileStrategy0.determinarValor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        boolean boolean3 = board2.moveDown();
        boolean boolean4 = board2.moveUp();
        boolean boolean5 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        boolean boolean5 = board3.isLosingBoard();
        boolean boolean6 = board3.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        boolean boolean3 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        boolean boolean7 = cell4.canMergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        boolean boolean11 = cell8.canMergeWith(cell9);
        boolean boolean12 = cell4.canMergeWith(cell9);
        boolean boolean14 = cell4.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell0.mergeWith(cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        boolean boolean3 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        boolean boolean7 = cell4.canMergeWith(cell5);
        boolean boolean8 = cell0.canMergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        boolean boolean12 = cell9.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        boolean boolean16 = cell13.canMergeWith(cell14);
        boolean boolean17 = cell9.canMergeWith(cell14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = cell5.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.isFull();
        boolean boolean5 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy0 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        java.lang.Class<?> wildcardClass1 = deterministicTileStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        boolean boolean3 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        boolean boolean7 = cell4.canMergeWith(cell5);
        boolean boolean8 = cell0.canMergeWith(cell5);
        boolean boolean10 = cell0.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass11 = cell0.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveUp();
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.isFull();
        int int5 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board.Position[] positionArray2 = new ar.edu.unrc.game2048.Board.Position[] {};
        java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position> positionSet3 = new java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<ar.edu.unrc.game2048.Board.Position>) positionSet3, positionArray2);
        ar.edu.unrc.game2048.Board.Position position5 = deterministicTileStrategy1.determinarPosicion((java.util.Set<ar.edu.unrc.game2048.Board.Position>) positionSet3);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionArray2);
        org.junit.Assert.assertArrayEquals(positionArray2, new ar.edu.unrc.game2048.Board.Position[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(position5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board3.equals((java.lang.Object) (short) -1);
        boolean boolean6 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: El valor de la celda debe ser una potencia de dos: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        boolean boolean4 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        boolean boolean8 = cell5.canMergeWith(cell6);
        boolean boolean9 = cell1.canMergeWith(cell6);
        boolean boolean10 = cell0.canMergeWith(cell1);
        boolean boolean12 = cell1.equals((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy0 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board.Position[] positionArray1 = new ar.edu.unrc.game2048.Board.Position[] {};
        java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position> positionSet2 = new java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<ar.edu.unrc.game2048.Board.Position>) positionSet2, positionArray1);
        ar.edu.unrc.game2048.Board.Position position4 = deterministicTileStrategy0.determinarPosicion((java.util.Set<ar.edu.unrc.game2048.Board.Position>) positionSet2);
        ar.edu.unrc.game2048.Board.Position[] positionArray5 = new ar.edu.unrc.game2048.Board.Position[] {};
        java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position> positionSet6 = new java.util.LinkedHashSet<ar.edu.unrc.game2048.Board.Position>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<ar.edu.unrc.game2048.Board.Position>) positionSet6, positionArray5);
        ar.edu.unrc.game2048.Board.Position position8 = deterministicTileStrategy0.determinarPosicion((java.util.Set<ar.edu.unrc.game2048.Board.Position>) positionSet6);
        org.junit.Assert.assertNotNull(positionArray1);
        org.junit.Assert.assertArrayEquals(positionArray1, new ar.edu.unrc.game2048.Board.Position[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(position4);
        org.junit.Assert.assertNotNull(positionArray5);
        org.junit.Assert.assertArrayEquals(positionArray5, new ar.edu.unrc.game2048.Board.Position[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(position8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        boolean boolean4 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        boolean boolean8 = cell5.canMergeWith(cell6);
        boolean boolean9 = cell1.canMergeWith(cell6);
        boolean boolean10 = cell0.canMergeWith(cell1);
        java.lang.String str11 = cell0.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveRight();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        boolean boolean10 = cell7.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        boolean boolean14 = cell11.canMergeWith(cell12);
        boolean boolean15 = cell7.canMergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        boolean boolean20 = cell17.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean24 = cell21.canMergeWith(cell22);
        boolean boolean25 = cell17.canMergeWith(cell22);
        boolean boolean26 = cell16.canMergeWith(cell17);
        boolean boolean27 = cell12.canMergeWith(cell16);
        boolean boolean28 = board3.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        java.lang.String str5 = board3.toString();
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        boolean boolean5 = cell2.canMergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        boolean boolean9 = cell6.canMergeWith(cell7);
        boolean boolean10 = cell2.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        boolean boolean15 = cell12.canMergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        boolean boolean19 = cell16.canMergeWith(cell17);
        boolean boolean20 = cell12.canMergeWith(cell17);
        boolean boolean21 = cell11.canMergeWith(cell12);
        boolean boolean22 = cell7.canMergeWith(cell11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell0.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        boolean boolean3 = board2.hasEmptyCells();
        boolean boolean4 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        boolean boolean3 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        boolean boolean7 = cell4.canMergeWith(cell5);
        boolean boolean8 = cell0.canMergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        boolean boolean13 = cell10.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        boolean boolean17 = cell14.canMergeWith(cell15);
        boolean boolean18 = cell10.canMergeWith(cell15);
        boolean boolean19 = cell9.canMergeWith(cell10);
        boolean boolean20 = cell5.canMergeWith(cell9);
        java.lang.Class<?> wildcardClass21 = cell9.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        boolean boolean3 = board2.moveDown();
        boolean boolean4 = board2.moveUp();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean6 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: El valor de la celda debe ser una potencia de dos: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean2 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        boolean boolean4 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        boolean boolean8 = cell5.canMergeWith(cell6);
        boolean boolean9 = cell1.canMergeWith(cell6);
        boolean boolean10 = cell0.canMergeWith(cell1);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        boolean boolean14 = cell11.canMergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        boolean boolean18 = cell15.canMergeWith(cell16);
        boolean boolean19 = cell11.canMergeWith(cell16);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        boolean boolean24 = cell21.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int27 = cell26.getValue();
        boolean boolean28 = cell25.canMergeWith(cell26);
        boolean boolean29 = cell21.canMergeWith(cell26);
        boolean boolean30 = cell20.canMergeWith(cell21);
        boolean boolean31 = cell16.canMergeWith(cell20);
        boolean boolean32 = cell1.canMergeWith(cell20);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        boolean boolean4 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        boolean boolean8 = cell5.canMergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        boolean boolean12 = cell9.canMergeWith(cell10);
        boolean boolean13 = cell5.canMergeWith(cell10);
        boolean boolean14 = cell2.canMergeWith(cell5);
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy16 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy16);
        boolean boolean18 = cell5.equals((java.lang.Object) deterministicTileStrategy16);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(0, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy2 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy2);
        boolean boolean5 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        boolean boolean3 = board2.moveDown();
        int int4 = board2.getSize();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        boolean boolean3 = board2.moveDown();
        boolean boolean4 = board2.moveUp();
        java.lang.String str5 = board2.toString();
        boolean boolean6 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        int int4 = board3.getScore();
        boolean boolean5 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy2 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy2);
        int int5 = deterministicTileStrategy2.determinarValor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy1 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        int int4 = board3.getScore();
        boolean boolean5 = board3.moveUp();
        boolean boolean6 = board3.moveLeft();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        ar.edu.unrc.game2048.DeterministicTileStrategy deterministicTileStrategy3 = new ar.edu.unrc.game2048.DeterministicTileStrategy();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy3);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(2, (ar.edu.unrc.game2048.TileStrategy) deterministicTileStrategy3);
    }
}

