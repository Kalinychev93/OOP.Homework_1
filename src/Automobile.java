public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Automobile() {}

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (this.brand == null || this.model == null || this.productionCountry == null){
            this.brand = "default";
            this.model = "default";
            this.productionCountry = "default";
        } else {
            this.brand = brand;
            this.model = model;
            this.productionCountry = productionCountry;
        }
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.color = color;
        this.productionYear = productionYear;

    }

    @Override
    public String toString() {
        return "Автомобиль:" + brand + " " + model  + ", объем двигателя: " + engineVolume + " л., цвет " + color + " " + ", год выпуска - " + productionYear + ", страна-производитель - " + productionCountry;
    }
}
