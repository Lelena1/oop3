package zoo;

import java.util.Objects;

public abstract class Mammals extends Animals {

    String livingEnvironment;
    double movementSpeed;


    public Mammals(String name) {
        this(name, 0, "no information", 0.0);
    }

    public Mammals(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public abstract void walk();

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

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {

        if (movementSpeed > 0) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = 0.0;
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
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.movementSpeed, movementSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }
}
