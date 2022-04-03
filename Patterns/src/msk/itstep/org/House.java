package msk.itstep.org;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class House {
    private ArrayList<AbstractFloorMaterial> floor = new ArrayList<>();
    private ArrayList<AbstractWallsMaterial> walls = new ArrayList<>();
    private ArrayList<AbstractRoofMaterial> roof = new ArrayList<>();

    public void addFloorMaterial(AbstractFloorMaterial material)
    {
        floor.add(material);
    }

    public void addWallsMaterial(AbstractWallsMaterial material)
    {
        walls.add(material);
    }

    public void addRoofMaterial(AbstractRoofMaterial material)
    {
        roof.add(material);
    }

    public String toString() {
        return "House has floor of size " + floor.size() + "; walls of size " + walls.size() + "; roof of size " + roof.size();
    }
}
