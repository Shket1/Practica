package practic.collections.Map.autoShop;

import java.util.Objects;

public class Car {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return model != null ? model.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", priceInRubles=" + priceInRubles +
                '}';
    }
}
