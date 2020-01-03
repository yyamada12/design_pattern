import java.util.*;

public class SampleClass {
    public static void main(String args[]) {
        HotPot hotPot = new HotPot(new Pot());
        // hotPot.addSoup(new ChickenBonesSoup());
        // hotPot.addMain(new Chicken());

        // List<Vegetable> vegetables = new ArrayList<>();
        // vegetables.add(new ChineseCabbage());
        // vegetables.add(new Leek());
        // vegetables.add(new Chrysanthemum());
        // hotPot.addVegetables(vegetables);
        // List<Ingredient> otherIngredients = new ArrayList<>();
        // otherIngredients.add(new Tofu());
        // hotPot.addOtherIngredients(otherIngredients);

        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherIngredients(factory.getOtherIngredients());
    }
}