package msk.itstep.org;

public class RichMaterialFactory extends AbstractMaterialFactory {
    @Override
    public AbstractRoofMaterial createRoofMaterial() {
        return new Metal();
    }

    @Override
    public AbstractFloorMaterial createFloorMaterial() {
        return new Stone();
    }

    @Override
    public AbstractWallsMaterial createWallsMaterial() {
        return new Brick();
    }

    @Override
    public String toString() {
        return "Expensive Materials Factory";
    }
}
