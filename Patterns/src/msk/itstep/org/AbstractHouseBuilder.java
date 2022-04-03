package msk.itstep.org;

public abstract class AbstractHouseBuilder {
    protected House house;
    protected AbstractMaterialFactory materialFactory;

    public AbstractHouseBuilder(AbstractMaterialFactory materialFactory) {
        this.materialFactory = materialFactory;
    }

    public abstract AbstractHouseBuilder buildWalls();

    public abstract AbstractHouseBuilder buildFloor();

    public abstract AbstractHouseBuilder buildRoof();

    public House getHouse() {
        return house;
    }

}
