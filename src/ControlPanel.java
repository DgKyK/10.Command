public class ControlPanel {
    private Car car;

    public ControlPanel(Car car) {
        this.car = car;
    }

    public void turnOnSportMode() {
        car.setSportMode(true);
        System.out.println("Sport mode is ON");
    }

    public void turnOnSmartMode() {
        car.setSmartMode(true);
        System.out.println("Smart mode is ON");
    }

    public void turnOnDefaultMode() {
        car.setDefaultMode(true);
        System.out.println("Default mode is ON");
    }
}
