public class DCMainConstructor {

    public static void main(String args[]) {
        DCMainConstructor main = new DCMainConstructor();
        main.testCase();
    }

    public void testCase() {
        Product product = new Product("Harga", "Warna", "Merek");
        Categories make up = new Categories("Make up", "Style. ", Product);
        Categories style = new Categories(Make up);

     style.getAddress().setCity("Tasyikmalaya");
        style.setFirstName("Zaid");
        style.setLastName("Abdullah");

        System.out.println(Make up);
        System.out.println(style);
    }
}