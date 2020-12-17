public class MasMeanVal {

    public static void main(String[] args) {

        int num [] = {105, 84, 93, 48, 99, 32, 47, 134, 55, 81};

        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/num.length);
    }
}
