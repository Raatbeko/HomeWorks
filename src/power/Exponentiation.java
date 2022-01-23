package power;

public class Exponentiation {
    public static void main(String[] args) {
        power(2,3);
    }

   public static void power(double firstNum,int secondNum){
        if (secondNum<2){
            System.out.println(Math.pow(firstNum,2));
        }else{
            System.out.println(Math.pow(firstNum,secondNum));
        }
   }

}
