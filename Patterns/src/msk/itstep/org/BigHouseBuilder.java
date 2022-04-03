package msk.itstep.org;

public class BigHouseBuilder extends AbstractHouseBuilder {
    final int WALL_SIZE = 100, FLOOR_SIZE = 100, ROOF_SIZE = 100;

    public BigHouseBuilder(AbstractMaterialFactory materialFactory) {
        super(materialFactory);
        house = new House();
        System.out.println(this.toString() + " will use " + materialFactory.toString());
    }

    @Override
    public void buildWalls() {
        System.out.println(this.toString() + " uses many " + materialFactory.createWallsMaterial().toString()
                + " to build walls");

        for (int i = 0; i < WALL_SIZE; i++)
            house.addWallsMaterial(materialFactory.createWallsMaterial());

        System.out.println(house);
    }

    @Override
    public void buildFloor() {
        System.out.println(this.toString() + " uses many " + materialFactory.createFloorMaterial().toString()
                + " to build floor");

        for (int i = 0; i < FLOOR_SIZE; i++)
            house.addFloorMaterial(materialFactory.createFloorMaterial());

        System.out.println(house);
    }

    @Override
    public void buildRoof() {
        System.out.println(this.toString() + " uses a lot of " + materialFactory.createRoofMaterial().toString()
                + " to build roof");

        for (int i = 0; i < ROOF_SIZE; i++)
            house.addRoofMaterial(materialFactory.createRoofMaterial());

        System.out.println(house);
    }

    @Override
    public String toString() {
        return "Big House Builder";
    }
}
