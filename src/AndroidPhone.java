public class AndroidPhone extends Phone {

    @Override
    public String getAppHub() {
        return "Play Store";
    }

    @Override
    public String getOS() {
        return "Android";
    }

    @Override
    public void installApp(App app) throws IncompatibleAppException {
        if (app instanceof AndroidCompatible) {
            System.out.println("Visit " + getAppHub() + " to get more apps");
            ((AndroidCompatible) app).saveTime();
        } else {
            IncompatibleAppException e = new IncompatibleAppException("App is not compatible with phone");
            throw e;
        }
    }

}