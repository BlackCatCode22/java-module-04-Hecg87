package tJavaModule04spr25;

public class Animal {

    // // Attributes to hold the details of an individual animal.
    private String animalName;
    private String species;
    private int age;

    /// Static attribute to keep track of the number of Animal objects created.
    public static int numOfAnimals = 0;

    // Animal Class constructors.
    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new Animal object was created.\n");

        // Create initial values for the class attributes.
        animalName = name;
        species = aSpecies;
        age = anAge;
        numOfAnimals++;
    }

    public Animal() {
        System.out.println("\n A new Animal object was created.\n");
        numOfAnimals++;
    }

    // Getters and Setters for each attribute (optional, but recommended for good practice)
    public String getName() {
        return animalName;
    }

    public void setName(String name) {
        this.animalName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


}

