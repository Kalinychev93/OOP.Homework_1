public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Automobile() {}

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.isBlank()) {     //здесь и далее для проверки пустой строки использую метод isBlank, т.к. он в отличие от метода isEmpty проверяет еще и пробелы,если в строку передали одни пробелы - программа вернет значение true
            this.brand = "deafult";
        } else {
            this.brand = brand;
        }

        if (model.isBlank()) {
            this.model = "deafult";
        } else {
            this.model = model;
        }

        if (productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль:" + brand + " " + model  + ", объем двигателя: " + engineVolume + " л., цвет " + color + " " + ", год выпуска - " + productionYear + ", страна-производитель - " + productionCountry;
    }
}
