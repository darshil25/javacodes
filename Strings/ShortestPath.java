public class ShortestPath {

    public static float FindShortest(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            // North
            if (str.charAt(i) == 'N') {
                y++;
            }
            // South
            else if (str.charAt(i) == 'S') {
                y--;
            }
            // East
            else if (str.charAt(i) == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
        }

        int X_sqr = x * x;
        int Y_sqr = y * y;

        return (float) Math.sqrt(X_sqr + Y_sqr);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println(FindShortest(path));
    }
}
