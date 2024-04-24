public class CoolingHygrothermalControl implements HygrothermalControl{

    @Override
    public double temperatureControl(double indoorTemperature, double expectTemperature) {
        return Math.min(indoorTemperature, expectTemperature);
    }
}
