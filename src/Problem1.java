public class Problem1 {

    public static void main(String[] args) {
        Phone phone = new VinhPhone();
        phone.setManufacturer("Vinh");
        phone.setModel("Nguyen");

        App app1 = new CanvasApp("Canvas", 72);
        App app2 = new GameApp("Game", 72);
        App app3 = new App("General", 72);

        try {
            phone.installApp(app1);
        } catch (IncompatibleAppException e) {
            e.printStackTrace();
        }

    }
}

