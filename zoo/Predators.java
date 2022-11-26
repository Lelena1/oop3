package zoo;

import java.util.Objects;

import static zoo.ValidateUtils.validateString;

public class Predators extends Mammals {

    String typeOfFood;

    public Predators(String name) {
        this(name, 0, "no information", 0.0, "no information");
    }

    public Predators(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);

        this.typeOfFood = validateString(typeOfFood);
    }

    public void hunt() {
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
        System.out.println("Walking in search of food");
    }

    @Override
    public void eat() {
        System.out.println("I eat everything I catch");
    }

    @Override
    public void go() {
        System.out.println("I'm moving to where there's more food");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Class Predators; " +
                "typeOfFood: " + typeOfFood +
                "; livingEnvironment: " + livingEnvironment +
                "; movementSpeed: " + movementSpeed +
                " km/h; name: " + name +
                "; age: " + age +
                " years.";
    }
}
