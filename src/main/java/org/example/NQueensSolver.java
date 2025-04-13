package org.example;

import java.util.ArrayList;
import java.util.List;

public class NQueensSolver {
    private static final int BOARD_SIZE = 8;

    public List<int[]> solveNQueens() {
        List<int[]> solutions = new ArrayList<>();
        int[] currentSolution = new int[BOARD_SIZE];
        solveNQueensUtil(0, currentSolution, solutions);
        return solutions;
    }

    private void solveNQueensUtil(int row, int[] currentSolution, List<int[]> solutions) {
        if (row == BOARD_SIZE) {
            solutions.add(currentSolution.clone());
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isPositionSafe(row, col, currentSolution)) {
                currentSolution[row] = col;
                solveNQueensUtil(row + 1, currentSolution, solutions);
            }
        }
    }

    private boolean isPositionSafe(int row, int col, int[] currentSolution) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousCol = currentSolution[previousRow];

            if (previousCol == col) {
                return false;
            }

            if (Math.abs(previousRow - row) == Math.abs(previousCol - col)) {
                return false;
            }
        }
        return true;
    }

    public void printSolution(int[] solution) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (solution[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
