public class ShallowMain {
    public static void main(String args[]) {
        ShallowMain main = new ShallowMain();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Product product = new Product("Harga", "Warna", "Merek");
        Categories make up = new Categories("Make Up", "Makanan. ", product);

        Categories makanan = new Categories(
                make up.getFirstName(), make up.getLastName(), make up.getAddress());

        makanan.setFirstName("makanan");
        //address.setCity("Bandung");
        makanani.getAddress().setCity("Purwakarta");
        System.out.println(make up);
        System.out.println(makanan);
    }
}