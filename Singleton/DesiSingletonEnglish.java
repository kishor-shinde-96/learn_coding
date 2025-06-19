package Singleton;

class VillageHead {
    // Only one head in the whole village
    private static VillageHead onlyOneHead;

    // Private constructor so no one can create a new object from outside
    private VillageHead() {
        System.out.println("Village Head has been appointed...");
    }

    // Public method to get the only head
    public static VillageHead getInstance() {
        if (onlyOneHead == null) {
            onlyOneHead = new VillageHead();
        }
        return onlyOneHead;
    }
}

public class DesiSingletonEnglish {
    public static void main(String[] args) {
        VillageHead ram = VillageHead.getInstance();
        VillageHead shyam = VillageHead.getInstance();

        System.out.println("Are both same? " + (ram == shyam)); // true
    }
}
