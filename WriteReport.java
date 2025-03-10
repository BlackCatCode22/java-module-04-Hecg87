package tJavaModule04spr25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteReport {
    public static void writeReport(List<Animal> animals, HashMap<String, Integer> speciesCount) {
        try (PrintWriter out = new PrintWriter(new FileWriter("newAnimals.txt"))) {
            for (Animal animal : animals) {
                out.printf("Species: %s, Name: %s, Age: %d\n", animal.getSpecies(), animal.getName(), animal.getAge());
            }
            out.println("Species counts:");
            speciesCount.forEach((species, count) -> out.println(species + ": " + count));
        } catch (IOException e) {
            System.err.println("Error writing to file.");
            e.printStackTrace();
        }
    }
    {}}

