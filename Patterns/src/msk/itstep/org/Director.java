package msk.itstep.org;

public class Director {
    private String name;
    private AbstractHouseBuilder builder;

    public Director(String name, AbstractHouseBuilder builder) {
        this.name = name;
        this.builder = builder;
        System.out.println(this.toString() + " hires " + builder.toString());
    }

    @Override
    public String toString() {
        return "Director " + name;
    }

    public House operate()
    {
        builder.buildFloor();
        builder.buildWalls();
        builder.buildRoof();
        return builder.getHouse();
    }
}
