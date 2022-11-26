package zoo;

import java.util.Objects;

import static zoo.ValidateUtils.validateString;

public class Herbivores extends Mammals {

    String typeOfFood;

    public Herbivores(String name) {
        this(name, 0, "no information", 0.0, "no information");
    }

    public Herbivores(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);

        this.typeOfFood = validateString(typeOfFood);
    }

    public void graze() {
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validateString(typeOfFood);
    }

    @Override
    public void walk() {
        System.out.println("I like to run fast");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    @Override
    public void go() {
        System.out.println("I move quickly to any place I want");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Class Herbivores; " +
                "typeOfFood: " + typeOfFood +
                "; livingEnvironment: " + livingEnvironment +
                "; movementSpeed: " + movementSpeed +
                " km/h; name: " + name +
                "; age: " + age + " years.";
    }
}
