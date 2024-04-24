public class HeatingHygrothermalControl implements HygrothermalControl{
    @Override
    public double temperatureControl(double indoorTemperature, double expectTemperature) {
        return Math.max(indoorTemperature, expectTemperature);
    }
}
