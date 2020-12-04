public class Part {

    private String identifier;
    private String manufacturer;
    private String description;

    public Part(String identifier, String manufacturer, String description) {
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    // Accessor
    public String getIdentifier() {return this.identifier;}
    public String getManufacturer() {return this.manufacturer;}
    public String getDescription() {return this.description;}


    
}
