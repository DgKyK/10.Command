public class Driver {
    private ICommand smartMode;
    private ICommand defaultMode;
    private ICommand sportMode;

    public Driver(ICommand smartMode, ICommand sportMode, ICommand defaultMode) {
        this.defaultMode = defaultMode;
        this.smartMode = smartMode;
        this.sportMode = sportMode;
    }

    public void turnOnSport() {
        sportMode.execute();
    }

    public void turnOnSmart() {
        smartMode.execute();
    }

    public void turnOnDefault() {
        defaultMode.execute();
    }
}
