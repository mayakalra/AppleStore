public class AppleStore {

    String location;
    int sqft;
    boolean isOpen;


    public static void main(String[] args) {
        AppleStore myStore; // declare
        myStore = new AppleStore(); // construct
        myStore.location = "Milton";
        myStore.sqft = 800;
        myStore.isOpen = true;

        System.out.print(" My " + myStore.sqft + " sqft Apple store is in " + myStore.location);
    }

    public AppleStore() {

        Phones phone1;
        phone1 = new Phones();
        phone1.isNewModel = true;
        phone1.price = 1000;
        phone1.color = "pink";
        phone1.printInfo();

        SmartWatch smartwatch1;
        smartwatch1 = new SmartWatch();
        smartwatch1.hasBlueTooth = true;
        smartwatch1.ModelNumber = 2;
        smartwatch1.color = "black";
        smartwatch1.printInfo();
    }
}



