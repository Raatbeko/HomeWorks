import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerNumber, sizeArray, evenNumber = 0, oddNumber = 0;
        System.out.print("How number you will be input? -> ");
        sizeArray = scanner.nextInt();
        int[] arr = new int[sizeArray];
        System.out.print("input your nums ->");
        for (int i = 0; i < sizeArray; i++) {
            integerNumber = scanner.nextInt();
            arr[i] = integerNumber;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                evenNumber++;
                System.out.print(j + " ");
                System.out.println();
            } else if (arr[j] % 2 != 0){
                oddNumber++;
                System.out.print(j + " ");
                System.out.println();
            }
        }
        if (evenNumber > oddNumber) {
            System.out.println("Yes");
        } else if (evenNumber < oddNumber) {
            System.out.println("No");
        }
    }
}
