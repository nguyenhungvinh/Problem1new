public class App {
    private String name;
    private Integer versionNumber;

    public App(String name, Integer versionNumber) {
        this.name = name;
        this.versionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.versionNumber;
    }
}
