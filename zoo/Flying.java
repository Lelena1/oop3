package zoo;

import java.util.Objects;

public class Flying extends Birds {

    String typeOfMovement;

    public Flying(String name) {
        this(name, 0, "no information", "no information");
    }

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        setTypeOfMovement(typeOfMovement);
    }

    public void fly() {
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "no information";
        }
    }

    @Override
    public void hunt() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void go() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Class Flying; " +
                "typeOfMovement: " + typeOfMovement +
                "; livingEnvironment: " + livingEnvironment +
                "; name: " + name +
                "; age: " + age +
                " years";
    }
}
