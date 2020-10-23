class Categories {

    private String firstName;
    private String lastName;
    private Address address;

    // standard constructors, getters and setters

    public Categories(Categories categories) {
        this(categories.getFirstName(), categories.getLastName(), new Address(categories.getAddress()));
    }

    public Categories(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Object clone() {
        Categories categories = null;
        try {
            user = (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            categories = new Categories(
                    this.getFirstName(), this.getLastName(), this.getAddress());
        }
        categories.address = (Address) this.address.clone();
        return categories;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ctategories{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}