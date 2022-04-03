package msk.itstep.org;

public class SmallHouseBuilder extends AbstractHouseBuilder {

    final int WALL_SIZE = 50, FLOOR_SIZE = 50, ROOF_SIZE = 50;

    public SmallHouseBuilder(AbstractMaterialFactory materialFactory)
    {
        super(materialFactory);
        house = new House();
        System.out.println(this.toString() + " will use " + materialFactory.toString());
    }

    @Override
    public AbstractHouseBuilder buildWalls() {
        System.out.println(this.toString() + " uses not many " + materialFactory.createWallsMaterial().toString()
            + " to build walls");

        for (int i = 0; i < WALL_SIZE; i++)
            house.addWallsMaterial(materialFactory.createWallsMaterial());

        System.out.println(house);
        return this;
    }

    @Override
    public AbstractHouseBuilder buildFloor() {
        System.out.println(this.toString() + " uses not many " + materialFactory.createFloorMaterial().toString()
                + " to build floor");

        for (int i = 0; i < FLOOR_SIZE; i++)
            house.addFloorMaterial(materialFactory.createFloorMaterial());

        System.out.println(house);
        return this;
    }

    @Override
    public AbstractHouseBuilder buildRoof() {
        System.out.println(this.toString() + " uses not much " + materialFactory.createRoofMaterial().toString()
                + " to build roof");

        for (int i = 0; i < ROOF_SIZE; i++)
            house.addRoofMaterial(materialFactory.createRoofMaterial());

        System.out.println(house);
        return this;
    }

    @Override
    public String toString() {
        return "Small house builder";
    }
}
