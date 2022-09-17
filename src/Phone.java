public abstract class Phone {
    private String manufacturer;
    private String model;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract String getAppHub();

    public abstract String getOS();

    public abstract void installApp (App app) throws IncompatibleAppException;

}
