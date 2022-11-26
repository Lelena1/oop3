package zoo;

import java.util.Objects;

import static zoo.ValidateUtils.validateNum;
import static zoo.ValidateUtils.validateString;

public abstract class Animals {
    String name;
    int age;

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        this.name = validateString(name);
        this.age = validateNum(age);
    }

    public abstract void eat();

    public void sleep() {
    }

    public abstract void go();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = validateString(name);
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
