public class DrawXYZ {
    private static void drawXYZ(int height) {
        int count = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (count % 3 == 0) {
                    System.out.print("X ");
                } else if (count % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawXYZ(4);
        System.out.println();
        drawXYZ(5);
        System.out.println();
        drawXYZ(1);
    }
}
