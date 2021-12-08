package Shapes;

public abstract class  Shape {
    private String symbol;

    public Shape() {
    }

    public Shape(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void draw(){
        //empty here
    }
}
