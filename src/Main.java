import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        String[] arr = new String[num];
        int sum = 0;

        for (int i = 0; i < num ; i++) {
            i = num % 10;
            num /= 10;

            sum += i;

            sum -= i + 1;

        System.out.println(sum);
        }
//        while (num > 0) {
//
//            int num2 = num % 10;
//            num /= 10;
//            if (num2 % 2 == 0){
//                sum+=num2;
//            }else {
//                sum-=num2;
//            }
//        }
    }
//    static int[] ara(int[] arr){
//        return arr;
//    }

}
