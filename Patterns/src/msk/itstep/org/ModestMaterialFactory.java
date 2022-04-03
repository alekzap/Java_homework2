package msk.itstep.org;

public class ModestMaterialFactory extends AbstractMaterialFactory{
    @Override
    public AbstractRoofMaterial createRoofMaterial() {
        return new Slate();
    }

    @Override
    public AbstractFloorMaterial createFloorMaterial() {
        return new WoodBoard();
    }

    @Override
    public AbstractWallsMaterial createWallsMaterial() {
        return new WoodLog();
    }

    @Override
    public String toString() {
        return "Modest Materials Factory";
    }
}
