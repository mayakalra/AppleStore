public class SmartWatch {

    boolean hasBlueTooth;
    int ModelNumber;
    String color;

    public SmartWatch() {

    }
    public void printInfo(){
        System.out.println("Has bluetooth: " + hasBlueTooth);
        System.out.println("Model number:" + ModelNumber);
        System.out.println("Color of smartwatch:" + color);
    }
}
