package zoo;

import java.util.Objects;

import static zoo.ValidateUtils.validateString;

public class Flightless extends Birds {

    String typeOfMovement;

    public Flightless(String name) {
        this(name, 0, "no information", "no information");
    }

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        this.typeOfMovement = validateString(typeOfMovement);
    }

    public void walk() {
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public void hunt() {
        System.out.println("Hunting to live");
    }

    @Override
    public void eat() {
        System.out.println("I eat what I catch");
    }

    @Override
    public void go() {
        System.out.println("I quickly move my legs");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = validateString(typeOfMovement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Class Flightless; " +
                "typeOfMovement: " + typeOfMovement +
                "; livingEnvironment: " + livingEnvironment +
                "; name: " + name +
                "; age: " + age +
                " years.";
    }
}
