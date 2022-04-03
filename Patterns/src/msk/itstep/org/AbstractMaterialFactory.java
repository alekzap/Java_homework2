package msk.itstep.org;

public abstract class AbstractMaterialFactory {
    public abstract AbstractRoofMaterial createRoofMaterial();
    public abstract AbstractFloorMaterial createFloorMaterial();
    public abstract AbstractWallsMaterial createWallsMaterial();
}
