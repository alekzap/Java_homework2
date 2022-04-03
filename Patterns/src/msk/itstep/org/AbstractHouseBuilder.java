package msk.itstep.org;

public abstract class AbstractHouseBuilder {
    protected House house;
    protected AbstractMaterialFactory materialFactory;

    public AbstractHouseBuilder(AbstractMaterialFactory materialFactory) {
        this.materialFactory = materialFactory;
    }

    public abstract void buildWalls();

    public abstract void buildFloor();

    public abstract void buildRoof();

    public House getHouse() {
        return house;
    }

}
