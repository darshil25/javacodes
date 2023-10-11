/*You are given a starting position for a rat which is stuck in a maze at an initial point (0,0) (the maze can be thought of as a 2-dimensional plane). The maze is given in the form of a square matrix of order N*N where the cells with value 0 represent the maze's blocked locations, while value 1 is the open/available path that the rat can take to reach its destination. The rat's destination is at (N - 1, N - 1).

Your task is to find all the possible paths that the rat can take to reach from the source to the destination in the maze. The possible directions that it can take to move in the maze are 'U' (up) i.e. (x, y - 1), 'D' (down) i.e. (x, y + 1), 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y). (This problem is similar to Grid ways.)

Please provide an algorithm or code to find all the possible paths for the rat. */

public class M23Q1 {
    public static int gridways(int i, int j, int n, int m){

        //base case
        if(i==n-1 && j==m-1){ //for cells above and left to the target cell
            return 1;
        }
        else if(i==n || j==m){ //for target cell
            return 0;
        }
        //right turn
        int w1 = gridways(i, j+1, n, m);
        
        //left turn
        int w2 = gridways(i, j-1, n, m);

        //up turn
        int w3 = gridways(i-1, j, n, m);

        //down turn
        int w4 = gridways(i+1, j, n, m);

        return w1+w2+w3+w4;
    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(gridways(0, 0, n, m));
    }
}
