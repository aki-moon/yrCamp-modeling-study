public class DehumidificationHygrothermalControl implements HygrothermalControl{

    @Override
    public Air control(Air indoorAir, Air expectAir) {
        double humidity = Math.min(indoorAir.humidity(), expectAir.humidity());
        return new Air(indoorAir.temperature(), humidity, indoorAir.direction());
    }
}
