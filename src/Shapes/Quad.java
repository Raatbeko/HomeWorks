package Shapes;

public class Quad extends Shape{
    public Quad(String symbol) {
        super(symbol);
    }
    @Override
    public void draw(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(getSymbol());
                System.out.print("\n");

        }
    }
}
