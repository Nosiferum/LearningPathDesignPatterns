package Template;

public class HouseBuilder {

    private HouseTemplate houseTemplate;

    public HouseBuilder(HouseTemplate houseTemplate) {
        this.houseTemplate = houseTemplate;
    }

    public void buildHouse() {
        houseTemplate.buildHouse();
    }

    public void changeBuildingMethod(HouseTemplate houseTemplate) {
        this.houseTemplate = houseTemplate;
    }
}
