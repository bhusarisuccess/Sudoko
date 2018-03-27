
<h1>Sudoku Solver Demo</h1>

<p>
This post demonstrates solving Sudoku using Backtracking. Algorithm and a working code sample is given.
</p>

<p>
References:

Backtracking: http://en.wikipedia.org/wiki/Backtracking
Sudoku: http://en.wikipedia.org/wiki/Sudoku

</p>

<p>
Pre-condition:

Read input grid (this is in matrix form)
Grid has 9x9 cells. Cell is represented by (x,y)
 Each cell contains a value from 1 to 9.
Empty cells are contain the value '0'
</p>
<p>
Algorithm:

1# solve(cell)
2# If cell not empty, call solve(nextCell)
3# If cell is empty (grid[cell.x][cell.y] == 0)
4# Add value v (v belongs to 1-9)
5# Check if v is valid for cell
6# if not valid, continue to #4
7# If valid, call solve(nextCell)
8# If sudoku solved, return true
9# Else return false


</p>
GIF walkthrough of all required and optional stories (using LiceCap)
Added
</p>

<p>
Demo Link: <a href="https://github.com/bhusarisuccess/Sudoku/blob/master/demo/Sudokodemo.gif"> <br> <br>
<img border="0" alt="W3Schools" src="https://github.com/bhusarisuccess/Sudoku/blob/master/demo/Sudokodemo.gif" width="50%" height="50%"> <br>
</a>
</p>
