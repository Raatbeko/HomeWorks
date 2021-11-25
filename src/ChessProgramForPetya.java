import sun.java2d.opengl.OGLSurfaceData;

import java.util.Scanner;

public class ChessProgramForPetya {
    public static void main(String[] args) {
        char[] letterInChess = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int[] numberInChess = {1, 2, 3, 4, 5, 6, 7, 8};
        moveDataReceiver(numberInChess,letterInChess);
    }
    static void moveDataReceiver(int[] numberInChess,char[] letterInChess){
        Scanner scanner = new Scanner(System.in);
        String moveInChess = scanner.nextLine();
        String plusChessLetter ="" +  letterInChess[2] + numberInChess[6] + "-" + letterInChess[3] + numberInChess[4];
//        System.out.println(plusChessLetter);
        else if (moveInChess.equals(plusChessLetter)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
