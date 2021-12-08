package AppleCompany.AppleProduct;

import AppleCompany.AppleBrand;

public class Iphone_1 extends AppleBrand {
   private String name;
   private int memorySize;
   private String whereIsCollected;
   private String cameraHowManyMP;
   private String cpu;

    public Iphone_1() {

    }

    public Iphone_1(String nameBrand, String madeInAmerica, String name, int memorySize, String whereIsCollected, String cameraHowManyMP, String cpu) {
        super(nameBrand, madeInAmerica);
        this.name = name;
        this.memorySize = memorySize;
        this.whereIsCollected = whereIsCollected;
        this.cameraHowManyMP = cameraHowManyMP;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getWhereIsCollected() {
        return whereIsCollected;
    }

    public void setWhereIsCollected(String whereIsCollected) {
        this.whereIsCollected = whereIsCollected;
    }

    public String getCameraHowManyMP() {
        return cameraHowManyMP;
    }

    public void setCameraHowManyMP(String cameraHowManyMP) {
        this.cameraHowManyMP = cameraHowManyMP;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return  "Brand name: " + getNameBrand()  +
                "\nMade in " + getMadeInAmerica() +"\nname: "+name + "\nMemory size: "+memorySize +" Where is collected: " + whereIsCollected + "Camera MP" + cameraHowManyMP + "\nCPU: " + cpu;
    }
}
