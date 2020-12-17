public class CopyValMasToMas {

    public static void main(String[] args) {
        int num[] = {10, 21, 13, 24, 56, 32, 75, 48, 3, 8};
        int sun[] = new int[10] ;

        System.arraycopy(num, 0, sun, 0, 10);
        for (int i = 0; i < sun.length; i++) {
            System.out.print(sun[i] + " ");
        }
    }
}