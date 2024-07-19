package JavaLearning.Projects;

public class SudokuSolver {
    /**
     * This constant represents the board size.
     * GRID_SIZE x GRID_SIZE;
     */
    private static final int GRID_SIZE = 9;

    /**
     * This method checks if number is in any of the rows within the board. If number is on the board
     * it will return true, otherwise false.
     *
     * @param board: A 2D array of numbers, representing a 9x9 Sudoku board.
     * @param number: Number given to be checked against row number.
     * @param row: The rows of the board
     * @return Boolean
     */
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method checks if number is in any of the columns within the board. If number is on the board
     * it will return true, otherwise false.
     *
     * @param board: A 2D array of numbers, representing a 9x9 Sudoku board.
     * @param number: Number given to be checked against column number.
     * @param column: The column of the board
     * @return Boolean
     */
    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is searching 'board' to find 'number' in either 'row' position or 'column' position.
     * When this method finds the 'number' it returns true, otherwise false.
     *
     * @param board: A 2D array of numbers, representing a 9x9 Sudoku board.
     * @param number: Number given to be checked against column number.
     * @param row: The rows of the board
     * @param column: The column of the board
     * @return Boolean
     */
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if(board[row][column] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method checks if there is already a number placed at the location.
     *
     * @return
     */
    private static boolean isValidPlacement(){
        return true;
    }


    public static boolean solvePuzzle(){
        return true;
    }

    /**
     * Prints out the 2D array.
     *
     * @param board: A 2D array of numbers, representing a 9x9 Sudoku board.
     */
    private static void printBoard(int[][] board){
        System.out.println();
    }

    public static void main(String[] args) {
        int [][] board = {
                {4, 0, 0, 2, 0, 0, 3, 1, 8},
                {0, 0, 0, 9, 0, 1, 2, 0, 0},
                {6, 2, 1, 0, 3, 0, 5, 4, 9},
                {0, 0, 0, 8, 6, 2, 0, 0, 0},
                {2, 6, 9, 1, 0, 5, 0, 0, 0},
                {0, 0, 8, 0, 0, 4, 0, 0, 0},
                {0, 4, 0, 0, 0, 9, 0, 0, 5},
                {0, 0, 2, 0, 0, 0, 4, 0, 6},
                {9, 5, 0, 0, 8, 7, 1, 0, 0}
        };

        System.out.println(isNumberInBox(board, 8, 5, 2));
    }
}