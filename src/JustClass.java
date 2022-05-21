public class JustClass<F, S> {
    private F object1;
    private S object2;

    public JustClass() {
    }

    public JustClass(F object1, S object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public String getObject1() {
        return "Class name: " + object1.getClass().getName() + " hashCode: " + object1.hashCode();
    }

    public String getObject2() {
        return "Class name: " + object2.getClass().getName() + " hashCode: " + object2.hashCode();
    }

    public String getValueObject1(){
        return object1.toString();
    }

    public String getValueObject2(){
        return object2.toString();
    }

    public boolean check(){
        return object1.hashCode() == object2.hashCode();
    }

}
