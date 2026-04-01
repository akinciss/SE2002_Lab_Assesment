interface Device {
    void turnOn();
}

interface TemperatureControl {
    void adjustTemperature(int t);
}

class AirConditioner implements Device, TemperatureControl {

    @Override
    public void turnOn() {
        System.out.println("AC ON");
    }

    @Override
    public void adjustTemperature(int t) {
        System.out.println("Temperature set to " + t);
    }
}

class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light ON");
    }
}

class HomeAutomation {

    public void manage(Device device) {
        device.turnOn();

        // Eğer sıcaklık destekliyorsa
        if (device instanceof TemperatureControl temp) {
            temp.adjustTemperature(24);
        }
    }
}