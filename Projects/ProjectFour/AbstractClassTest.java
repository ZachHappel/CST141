// Kingdom specifies animals
public abstract class Animalia {
    public abstract void breathe();
    public abstract void move();
}

// Class Mammalia specifies animals with mammary glands
public abstract class Mammalia extends Animalia {
    public void breathe() {
        System.out.println("Breathe through lungs");
    }
    public abstract void feedYoung();
}

// Order Carnivora specifies animals who eat meat
public abstract class Carnivora extends Mammalia {
    public void feedYoung() {
        System.out.println("Feeding young with meat");
    }
    public abstract void hunt();
}

// Genus Canis
public abstract class Canis extends Carnivora {
    public void move() {
        System.out.println("Walks or runs on four legs");
    }
    public abstract void vocalize();
}

// Species lupus familiaris is the domestic dog
public class LupusFamiliaris extends Canis {
    public void hunt() {
        System.out.println("Hunts in packs or trained by humans");
    }
    public void vocalize() {
        System.out.println("Barks or howls");
    }
}

// Main class to test the hierarchy
public class Main {
    public static void main(String[] args) {
        LupusFamiliaris dog = new LupusFamiliaris();
        
        dog.breathe(); // Output: Breathe through lungs
        dog.move(); // Output: Walks or runs on four legs
        dog.feedYoung(); // Output: Feeding young with meat
        dog.hunt(); // Output: Hunts in packs or trained by humans
        dog.vocalize(); // Output: Barks or howls
    }
}