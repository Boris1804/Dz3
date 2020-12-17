public class DoublMasMult {
    public static void main(String[] args) {

        int[][] mas1 = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        int[][] mas2 = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

        int[][] mas3 = new int[mas1.length][mas2[0].length];
        for (int i = 0; i < mas3[0].length; i++)
            for (int j = 0; j < mas3.length; j++)
                for (int k = 0; k < mas1[0].length; k++)
                    mas3[i][j] = mas3[i][j] + mas1[i][k] * mas2[k][j];

        for (int i = 0; i < mas3.length; i++) {
            for (int j = 0; j < mas3[0].length; j++) {
                System.out.print(" " + mas3[i][j] + " ");
            }
            System.out.println();
        }
    }
}