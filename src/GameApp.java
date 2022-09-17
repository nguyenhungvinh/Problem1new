public class GameApp extends App implements AndroidCompatible{

    public GameApp(String name, Integer versionNumber) {
        super(name, versionNumber);
    }

    @Override
    public String saveTime() {
        return "Save enough time to install " + this.toString();
    }
}
