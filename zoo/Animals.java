package zoo;

import java.util.Objects;

public abstract class Animals {
    String name;
    int age;

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        setName(name);

        if (age >= 0) {
            this.age = age;
        }
    }

    public abstract void eat();

    public void sleep() {
    }

    public abstract void go();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "no information";
        }
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
