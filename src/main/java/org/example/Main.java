package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NQueensSolver solver = new NQueensSolver();
        List<int[]> solutions = solver.solveNQueens();

        System.out.println("Encontradas " + solutions.size() + " soluções para o problema das 8 rainhas.");
        System.out.println("\nPrimeira solução encontrada:");
        for(int[] solution: solutions){
            solver.printSolution(solution);
        }

        System.out.println("\nÚltima solução encontrada:");
        solver.printSolution(solutions.get(solutions.size() - 1));
    }
}