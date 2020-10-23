.class Product {

    private String street;
    private String city;
    private String country;

    // standard constructors, getters and setters

    public Product(Product alamat) {
        this(alamat.getStreet(), alamat.getCity(), alamat.getCountry());
    }

    public Product(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Object clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getStreet(), this.getCity(), this.getCountry());
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Product{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}