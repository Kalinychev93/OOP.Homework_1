public class Main {
    public static void main(String[] args) {
        System.out.println("OOP.Homework 1");

        System.out.println("Exercise 1");
        Automobile automobile1 = new Automobile();
        automobile1.brand = "Lada";
        automobile1.model = "Granta";
        automobile1.productionCountry = "Россия";
        automobile1.color = "желтый";
        automobile1.productionYear = 2015;
        automobile1.engineVolume = 1.7;

        Automobile automobile2 = new Automobile();
        automobile2.brand = "Audi";
        automobile2.model = "A8 50 L TDI quattro";
        automobile2.productionCountry = "Германия";
        automobile2.color = "черный";
        automobile2.productionYear = 2020;
        automobile2.engineVolume = 3.0;

        Automobile automobile3 = new Automobile();
        automobile3.brand = "BMW";
        automobile3.model = "Z8";
        automobile3.productionCountry = "Германия";
        automobile3.color = "черный";
        automobile3.productionYear = 2021;
        automobile3.engineVolume = 3.0;

        Automobile automobile4 = new Automobile();
        automobile4.brand = "Kia";
        automobile4.model = "Sportage";
        automobile4.productionCountry = "Южная Корея";
        automobile4.color = "красный";
        automobile4.productionYear = 2018;
        automobile4.engineVolume = 2.4;

        Automobile automobile5 = new Automobile();
        automobile5.brand = "Hyundai";
        automobile5.model = "Avante";
        automobile5.productionCountry = "Южная Корея";
        automobile5.color = "коранжевый";
        automobile5.productionYear = 2016;
        automobile5.engineVolume = 1.7;

        System.out.println(automobile1);
        System.out.println(automobile2);
        System.out.println(automobile3);
        System.out.println(automobile4);
        System.out.println(automobile5);

        System.out.println("");
        System.out.println("Exercise 2");

       // Automobile auto1 = new Automobile("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
       // System.out.println(auto1);

    }
}