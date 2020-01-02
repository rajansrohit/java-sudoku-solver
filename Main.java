package com.Rohit;

public class Main {

    public static void main(String[] args) {
        SudokuSolver sudoku = new SudokuSolver(GRID);
        System.out.println("Sudoku grid to be solved:");
        sudoku.display();

        if(sudoku.solve()){
            System.out.println("Solved sudoku grid");
            sudoku.display();
        } else{
            System.out.println("Sudoku grid unsolvable");
        }
    }

    public static int[][] GRID= {
            {8,0,0,0,0,0,0,0,0},
            {0,0,3,6,0,0,0,0,0},
            {0,7,0,0,9,0,2,0,0},
            {0,5,0,0,0,7,0,0,0},
            {0,0,0,0,4,5,7,0,0},
            {0,0,0,1,0,0,0,3,0},
            {0,0,1,0,0,0,0,6,8},
            {0,0,8,5,0,0,0,1,0},
            {0,9,0,0,0,0,4,0,0},
    };
}
