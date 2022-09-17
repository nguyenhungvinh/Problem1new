public class ApplePhone extends Phone{

    @Override
    public String getAppHub() {
        return "App Store";
    }

    @Override
    public String getOS() {
        return "Apple";
    }

    @Override
    public void installApp(App app) throws IncompatibleAppException {
        if (app instanceof AppleCompatible) {
            System.out.println("Visit " + getAppHub() +" to get more apps");

        }
        else {
            IncompatibleAppException e = new IncompatibleAppException("App is not compatible with phone");
            throw e;
        }
    }
}
