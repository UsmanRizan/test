package Models;

public class Bicycle {
    int gear;
    double speed;

    public Bicycle(int gear, double speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(double decrement) {
        this.speed -= decrement;
    }

    public void speedUp(double increment) {
        this.speed += increment;
    }

    @Override
    public String toString() {
        return "Current speed is " + this.speed +
                ", Gear is " + this.gear;
    }
}
