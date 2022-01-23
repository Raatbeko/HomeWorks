package power;

public class Power {
    public static void main(String[] args) {
        power(5, (short) 1);
        power(5,5);
        power(5,(long)345677888);
        power(5,5.5f);
    }
    public static void power(double numFirst,short numSecond){
        if (numFirst<2){
            System.out.println(Math.pow(numFirst,2));
        }else{
            System.out.println(Math.pow(numFirst,numSecond));
        }
    }
    public static void power(double numFirst,int numSecond){
        if (numFirst<2){
            System.out.println(Math.pow(numFirst,2));
        }else{
            System.out.println(Math.pow(numFirst,numSecond));
        }
    }
    public static void power(double numFirst,long numSecond){
        if (numFirst<2){
            System.out.println(Math.pow(numFirst,2));
        }else{
            System.out.println(Math.pow(numFirst,numSecond));
        }
    }
    public static void power(double numFirst,float numSecond){
        if (numFirst<2){
            System.out.println(Math.pow(numFirst,2));
        }else{
            System.out.println(Math.pow(numFirst,numSecond));
        }
    }
}
