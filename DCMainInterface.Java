public class DCMainInterface {
    public static void main(String args[]) {
        DCMainInterface main = new DCMainInterface();
        main.testCase();
    }

    public void testCase() {
        Pproduct product = new Product("Harga", "Warna", "Merek");
        Categories make up = new Categories("Make up", "Style. ", Product);
        Categories Style = (Categories) make up.clone();

        Style.getProduct().setStreet("Jalan Cisarua");
        Style.setFirstName("Zaid");
        Style.setLastName("Abdullah");

        System.out.println(make up);
        System.out.println(style);
    }
}.