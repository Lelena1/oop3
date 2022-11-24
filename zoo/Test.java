package zoo;

public class Test {
    public static void main(String[] args) {

        Amphibians frog = new Amphibians("Frog1", 1, "swamp");
        Amphibians snakeFreshwater = new Amphibians("Snake1", 5, "river");
        frog.printInfo();
        snakeFreshwater.printInfo();
        System.out.println(frog.equals(snakeFreshwater));

        Herbivores gazelle = new Herbivores("Gazelle1", 10, "savannah", 50,
                "leaves and stems");
        Herbivores giraffe = new Herbivores("Giraffe1", 6, "savannah", 55,
                "leaves and fruits");
        Herbivores horse = new Herbivores("Horse1", 12, "plain", 60,
                "grass and hay");
        giraffe.printInfo();
        giraffe.printInfo();
        horse.printInfo();
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(horse.equals(giraffe));

        Predators hyena = new Predators("Hyena1", 3, "savannah", 65,
                "antelopes and zebras");
        Predators tiger = new Predators("Tiger1", 8, "there are no specific preferences",
                55, "hoofed animals");
        Predators bear = new Predators("Bear1", 18, "forest", 45,
                "any food");
        hyena.printInfo();
        tiger.printInfo();
        bear.printInfo();
        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.equals(bear));
        System.out.println(bear.equals(tiger));

        Flightless peacock = new Flightless("Peacock1", 4, "forest", "walk");
        Flightless penguin = new Flightless("Penguin1", 11, "Antarctica",
                "walk and swim");
        Flightless dodoBird = new Flightless("Dodo1", 2, "extinct", "walk");
        peacock.printInfo();
        penguin.printInfo();
        dodoBird.printInfo();
        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodoBird));
        System.out.println(dodoBird.equals(penguin));

        Flying seagull = new Flying("Seagull1", 1, "sea", "fly");
        Flying albatross = new Flying("Albatross1", 2, "sea", "fly");
        Flying falcon = new Flying("Falcon1", 3, "plain", "fly");
        seagull.printInfo();
        albatross.printInfo();
        falcon.printInfo();
        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(falcon.equals(albatross));
    }
}
