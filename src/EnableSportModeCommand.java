public class EnableSportModeCommand implements ICommand {
    private ControlPanel controlPanel;

    public EnableSportModeCommand(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    @Override
    public void execute() {
        controlPanel.turnOnSportMode();
    }
}
