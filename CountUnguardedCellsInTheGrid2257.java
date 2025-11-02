class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        Set<String> guardWall = new HashSet<>();
        Set<String> guardedCells = new HashSet<>();
        int[][] guardedGrid = new int[m][n];
        int totalGuardedCells = guards.length + walls.length;
        for (int[] arr : guards) {
            guardedGrid[arr[0]][arr[1]] = 2;
        }
        for (int[] arr : walls) {
            guardedGrid[arr[0]][arr[1]] = 2;
        }

        for (int[] arr : guards) {
            int posi = arr[0];
            int posj = arr[1];
            //left
            for (int pos = posj - 1; pos >= 0; pos--) {
                if (guardedGrid[posi][pos] == 2) {
                    break;
                }
                if (guardedGrid[posi][pos]!=1) {
                    totalGuardedCells++;
                    guardedGrid[posi][pos]=1;

                }

            }
            //right
            for (int pos = posj + 1; pos < n; pos++) {
                 if (guardedGrid[posi][pos] == 2) {
                    break;
                }
                if (guardedGrid[posi][pos]!=1) {
                    totalGuardedCells++;
                    guardedGrid[posi][pos]=1;

                }

            }

            //top
            for (int pos = posi - 1; pos >= 0; pos--) {
                 if (guardedGrid[pos][posj] == 2) {
                    break;
                }
                if (guardedGrid[pos][posj]!=1) {
                    totalGuardedCells++;
                    guardedGrid[pos][posj]=1;

                }
            }

            //bottom
            for (int pos = posi + 1; pos < m; pos++) {
                 if (guardedGrid[pos][posj] == 2) {
                    break;
                }
                if (guardedGrid[pos][posj]!=1) {
                    totalGuardedCells++;
                    guardedGrid[pos][posj]=1;

                }

            }

        }

        return (m * n) - totalGuardedCells;

    }
}
