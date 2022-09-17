public class CanvasApp extends  App implements AppleCompatible{

    public CanvasApp(String name, Integer versionNumber) {
        super(name, versionNumber);
    }

    @Override
    public String saveMoney() {
        return "Save enough money to install " + this.toString();
    }
}
