package msk.itstep.org;

public class Main {
    public static void main(String[] args) {
        House house = new Director("Ivanov", new SmallHouseBuilder(new RichMaterialFactory())).operate();

        System.out.println("----------------------------------------");

        house = new Director("Petrov", new BigHouseBuilder(new ModestMaterialFactory())).operate();

        System.out.println("----------------------------------------");

        house = new Director("Sidorov", new BigHouseBuilder(new RichMaterialFactory())).operate();

        System.out.println("----------------------------------------");
    }
}
