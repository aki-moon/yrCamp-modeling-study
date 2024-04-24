public class HeatingHygrothermalControl implements HygrothermalControl{
    @Override
    public Air control(Air indoorAir, Air expectAir) {
        double temperature = Math.max(indoorAir.temperature(), expectAir.temperature());
        return new Air(temperature, indoorAir.humidity(), indoorAir.direction());
    }
}
