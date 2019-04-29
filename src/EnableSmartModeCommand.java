public class EnableSmartModeCommand implements ICommand {
    private ControlPanel controlPanel;

    public EnableSmartModeCommand(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    @Override
    public void execute() {
        controlPanel.turnOnSmartMode();
    }
}
