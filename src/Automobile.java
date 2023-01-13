public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

 //   public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
   //     this.brand = brand;
    //  this.model = model;
      //  this.engineVolume = engineVolume;
      //  this.color = color;
      //  this.productionYear = productionYear;
      //  this.productionCountry = productionCountry;
    //}

    @Override
    public String toString() {
        return "Автомобиль:" + brand + " " + model  + ", объем двигателя: " + engineVolume + " л., цвет " + color + " " + ", год выпуска - " + productionYear + ", страна-производитель - " + productionCountry;
    }
}
