package AppleCompany;

public class AppleBrand {
    private String nameBrand;
    private String madeInAmerica;

    public AppleBrand() {
    }

    public AppleBrand(String nameBrand,  String madeInAmerica) {
        this.nameBrand = nameBrand;

        this.madeInAmerica = madeInAmerica;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }


    public String getMadeInAmerica() {
        return madeInAmerica;
    }

    public void setMadeInAmerica(String madeInAmerica) {
        this.madeInAmerica = madeInAmerica;
    }

    @Override
    public String toString() {
        return "Brand name: " + nameBrand  +
                "\nMade in " + madeInAmerica ;
    }
}
