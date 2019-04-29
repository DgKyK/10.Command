public class EnableDefaultModeCommand implements ICommand {
    private ControlPanel controlPanel;

    public EnableDefaultModeCommand(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    @Override
    public void execute() {
        controlPanel.turnOnDefaultMode();
    }
}
