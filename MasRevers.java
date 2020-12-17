public class MasRevers {
    public static void main(String[] args) {

        int num [] = {12, 19, 45 ,87, 36, 21, 54, 82, 98, 41};

        for (int sum = num.length - 1;sum >= 0; sum-- ) {
            System.out.print(num[sum] + " ");
        }
    }
}
