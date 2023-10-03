public class TrappedWtaer_Problem {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // Left max Boundry
        int leftM[] = new int[n];

        leftM[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftM[i] = Math.max(leftM[i - 1], height[i]);
        }

        // Right max Boundry
        int rightM[] = new int[n];

        rightM[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightM[i] = Math.max(rightM[i + 1], height[i]);
        }

        // Waterlevel
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftM[i], rightM[i]);

            // trapped water
            trappedWater = trappedWater + (waterLevel - height[i]);
        }
        System.out.println(trappedWater);
        return trappedWater;

    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedWater(height);
    }
}
