package zoo;

import java.util.Objects;

import static zoo.ValidateUtils.validateString;

public class Amphibians extends Animals {

    String livingEnvironment;

    public Amphibians(String name) {
        this(name, 0, "no information");
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);

        this.livingEnvironment = validateString(livingEnvironment);
    }

    public void hunt() {
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateString(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("I eat insects");
    }

    @Override
    public void go() {
        System.out.println("Sometimes I like to swim");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Class Amphibians; " +
                "livingEnvironment: " + livingEnvironment +
                "; name: " + name +
                "; age: " + age + " years.";
    }
}
