package exceptons;

public class FieldEmptyException extends NullPointerException{
    public FieldEmptyException(String s) {
        super(s);
    }
}
