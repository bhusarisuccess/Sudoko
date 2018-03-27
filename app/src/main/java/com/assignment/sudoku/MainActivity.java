package com.assignment.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private GridView gridView;
    private ArrayList<String> itemsList;
    private SudokuSolver solver;
    private Button btnReset, btnSolve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnSolve.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    private void init() {
        btnReset = findViewById(R.id.btnReset);
        btnSolve = findViewById(R.id.btnSolve);
        gridView = (GridView) findViewById(R.id.gridView1);
        solver = new SudokuSolver();
        itemsList = new ArrayList<String>();
        gridView.setAdapter(new GridAdapter(this, printGrid(solver.grid)));

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSolve) {
            boolean solved = solver.solve(new SudokuSolver.Cell(0, 0));
            if (!solved) {
                Toast.makeText(this, "SUDOKU cannot be solved", Toast.LENGTH_SHORT).show();
                return;
            }
            gridView.setAdapter(new GridAdapter(this, printGrid(solver.grid)));
        }
        if (v.getId() == R.id.btnReset) {
            //reload into grid View the unsolved sudoko
            solver = new SudokuSolver();
            gridView.setAdapter(new GridAdapter(this, printGrid(solver.grid)));
        }
    }

    // load data of 2d Array grid into the list
    ArrayList<String> printGrid(int grid[][]) {
        itemsList = new ArrayList<String>();
        for (int row = 0; row < solver.N; row++) {
            for (int col = 0; col < solver.N; col++)
                itemsList.add("" + (grid[row][col]));

        }
        return itemsList;
    }


}
