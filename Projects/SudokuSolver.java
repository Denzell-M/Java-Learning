package JavaLearning.Projects;

public class SudokuSolver {
    private static final int GRID_SIZE = 9;

    /**
     * This method checks if number is in any of the rows within the board. If number is on the board
     * it will return true, otherwise false.
     *
     * @param board: A 2D array of numbers, representing a 9x9 Sudoku board.
     * @param number: Number given to be checked against row number.
     * @param row: The rows of the board
     * @return
     */
    private boolean isNumberInRow(int[][] board, int number, int row) {
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
     * @return
     */
    private boolean isNumberInColumn(int[][] board, int number, int column) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInBox(int[][] board, int number, int row, int column) {
        for()
        return false;
    }


    public static void main(String[] args) {
        int [][] board = {
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0}
        };
    }
}