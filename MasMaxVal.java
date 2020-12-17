public class MasMaxVal {

    public static void main(String[] args) {
        int num [] = new int [15];
        int max;

        num [0] = 99;
        num [1] = 11;
        num [2] = -17;
        num [3] = 25;
        num [4] = 675;
        num [5] = -124;
        num [6] = 84;
        num [7] = 667;
        num [8] = 23;
        num [9] = 19;
        num [10] = 457;
        num [11] = 957;
        num [12] = 542;
        num [13] = 758;
        num [14] = 654;
        max = num [0];
        for (int i = 1; i < 15; i++) {
            if (num [i] > max) max = num[i];
            }
        System.out.println("Наибольшее значиние: " + max);
        }
    }

