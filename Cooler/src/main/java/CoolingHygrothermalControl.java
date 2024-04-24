public class CoolingHygrothermalControl implements HygrothermalControl{

    @Override
    public Air control(Air indoorAir, Air expectAir) {
        double temperature = Math.min(indoorAir.temperature(), expectAir.temperature());
        return new Air(temperature, indoorAir.humidity(), indoorAir.direction());
    }
}
