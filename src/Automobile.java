public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Automobile() {
    }

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
//      для проверки пустой строки использую метод isBlank, т.к. он в отличие от метода isEmpty проверяет еще и пробелы,если в строку передали одни пробелы - программа вернет значение true
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.productionCountry = productionCountry == null || productionCountry.isBlank() ? "default" : productionCountry;
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.productionYear = productionYear <=0 ? 2000 : productionYear;
    }

    @Override
    public String toString() {
        return "Автомобиль:" + brand + " " + model  + ", объем двигателя: " + engineVolume + " л., цвет " + color + " " + ", год выпуска - " + productionYear + ", страна-производитель - " + productionCountry;
    }
}
