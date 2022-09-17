public class VinhPhone extends Phone{

    @Override
    public String getAppHub() {
        return "Vinh Store";
    }

    @Override
    public String getOS() {
        return "Vinh";
    }

    @Override
    public void installApp(App app) throws IncompatibleAppException {

        System.out.println("Visit " + this.getAppHub()+ " to get more apps");
        if (app instanceof AndroidCompatible) {
            ((AndroidCompatible) app).saveTime();
        }
        if (app instanceof AppleCompatible) {
            ((AppleCompatible) app).saveMoney();
        }
    }


}
