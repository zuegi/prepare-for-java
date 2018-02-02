package ch.wesr.prepareforjava.buildingBlocks.klassen;

public class AnimalStarter {

//    public static void  main(String[] args) {
//    public static void  main(String args[]) {
    public static void  main(String...args) {
        Animal animal = new Animal();
        animal.setName("Prinzli");

        System.out.println("Das ist der Tiername: " +animal.getName());

        Animal2 animal2 = new Animal2();
        animal2.pfoten = 4;

        System.out.println("Das 2. Tier hat " +animal2.pfoten +" Pfoten");

        System.out.println("### Animal 3 ####");

        Animal3 animal3 = new Animal3();
        animal3.setArt("Katze");
        animal3.setPfoten(4);
        animal3.setName("Silvestre");

        System.out.println("Name: " +animal3.getName());
        System.out.println("Pfoten: " +animal3.getPfoten());
        System.out.println("Typ: " +animal3.getArt());

    }
}
