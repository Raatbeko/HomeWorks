package Shapes;

public class Triangle extends Shape{
    public Triangle(String symbol) {
        super(symbol);
    }
    @Override
    public void draw(){
        for(int i=0;i<=10;i++)
        {
            for(int j=1;j<=10-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print(getSymbol());
            System.out.print("\n");
        }
    }
}
