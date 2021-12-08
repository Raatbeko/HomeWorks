package AppleCompany.AppleProduct;

public class Iphone_2 extends Iphone_1{
    private String headPhoneOpening;
    String bluetooth;
    String wiFi;

    public Iphone_2() {
    }

    public Iphone_2(String nameBrand, String madeInAmerica, String name, int memorySize, String whereIsCollected, String cameraHowManyMP, String cpu, String headPhoneOpening,String bluetooth,String wiFi) {

        super(nameBrand, madeInAmerica, name, memorySize, whereIsCollected, cameraHowManyMP, cpu);
        this.headPhoneOpening = headPhoneOpening;
        this.bluetooth = bluetooth;
        this.wiFi = wiFi;
    }

    public String getHeadPhoneOpening() {
        return headPhoneOpening;
    }

    public void setHeadPhoneOpening(String headPhoneOpening) {
        this.headPhoneOpening = headPhoneOpening;
    }

    @Override
    public String toString() {
        return "Brand name :" + getNameBrand()  +
                "\nMade in " + getMadeInAmerica() + "\nname: "+getName() + "\nMemory size: "+getMemorySize() +" Where is collected: " + getWhereIsCollected() + "Camera MP" + getCameraHowManyMP() + "\nCPU: " + getCpu() + "\nNews :" + bluetooth + "2.0+DER," + wiFi + "802.11b/g";
    }
}
