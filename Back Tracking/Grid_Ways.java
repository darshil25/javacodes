public class Grid_Ways { //O(2^(n+m)) --> bad time complexity

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
        
        //down turn
        int w2 = gridways(i+1, j, n, m);

        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(gridways(0, 0, n, m));
    }
}
