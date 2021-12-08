import AppleCompany.AppleBrand;
import AppleCompany.AppleProduct.Iphone_1;
import AppleCompany.AppleProduct.Iphone_2;
import Shapes.Quad;
import Shapes.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        apple();
        System.out.println();
        Scanner scanner=  new Scanner(System.in);
        System.out.println("We are have two shape : quad and triangle, if you want to see some shape just input this");
        String whatObject = scanner.nextLine();
        shape(whatObject);

    }
    public static void apple(){
        AppleBrand Apple = new AppleBrand("Apple","America");
        Iphone_1 iphone = new Iphone_1("Apple","America","iphone 2G",8,"Germany","2MP","412Mgc");
        Iphone_2 iphone2 = new Iphone_2("Apple","America","iphone 3G",16,"Germany","2MP","412Mgc","jack 6,3mm","Bluetooth: ","Wi-Fi:");
        System.out.println(Apple + "\n-------------------------"+"\n" + iphone +"\n------------------------------" + "\n" + iphone2);
    }
    public static void shape(String whatObject){
        Scanner scanner=  new Scanner(System.in);

        System.out.println("Input one symbol -> ");
        String symbol = scanner.nextLine();
        Quad quad = new Quad(symbol);

        Triangle triangle = new Triangle(symbol);

        switch (whatObject){
            case "quad": quad.draw(); break;
            case "triangle": triangle.draw();
        }
    }
}
