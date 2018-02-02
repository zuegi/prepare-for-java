package ch.wesr.prepareforjava.buildingBlocks;

public class AnimalStarter {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Prinzli");

        System.out.println("Das ist der Tiername: " +animal.getName());

        Animal2 animal2 = new Animal2();
        animal2.pfoten = 4;

        System.out.println("Das 2. Tier hat " +animal2.pfoten +" Pfoten");
    }
}
