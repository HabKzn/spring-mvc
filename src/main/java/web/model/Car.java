package web.model;

public class Car {
   private String model;
   private int horsePower;
   private boolean is4WD;

    public Car(String model, int horsePower, boolean is4WD) {
        this.model = model;
        this.horsePower = horsePower;
        this.is4WD = is4WD;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isIs4WD() {
        return is4WD;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", is4WD=" + is4WD +
                '}';
    }
}
