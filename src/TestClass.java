public class TestClass {
    public static void main(String[] args) {
        Car car = new Car();
        ControlPanel controlPanel = new ControlPanel(car);
        Driver Alex = new Driver(new EnableSmartModeCommand(controlPanel), new EnableDefaultModeCommand(controlPanel),
                                new EnableSportModeCommand(controlPanel));
        Alex.turnOnDefault();
        Alex.turnOnSmart();
        Alex.turnOnSport();
    }
}
