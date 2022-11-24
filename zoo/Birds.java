package zoo;

import java.util.Objects;

public abstract class Birds extends Animals {

    String livingEnvironment;

    public Birds(String name) {
        this(name, 0, "no information");
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public abstract void hunt();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "no information";
        }
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
