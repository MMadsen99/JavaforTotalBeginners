package JavaForbeginner;

public class Main {
    public static void main(String[] args) {
        // hvis du dedugger main classen kan du se at personen p får navnet Niels og får 3 bøger.
        Person p = new Person();
        p.setMaximumBooks(3);
        p.setName("Niels");
        p.getName();
        p.getMaximumBooks();
    }
}
