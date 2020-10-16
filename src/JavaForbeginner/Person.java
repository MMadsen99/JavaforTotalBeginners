package JavaForbeginner;



//classes starter altid med stort
public class Person {
    // koden skal skrives inde i klassen
    // variabler og metoder skal altid starte med småt

    private String name; // name of the person
    private  int maximumBooks; // most books the person can check out


    //constructor ( bruges til og lave objekter)

    public Person() {
        name = "unknown name";
        maximumBooks = 3;
    }

    //Getter and Setters (metoder)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//Getter and Setters (metoder)


    public int getMaximumBooks() {
        return maximumBooks;
    }

    public void setMaximumBooks(int maximumBooks) {
        this.maximumBooks = maximumBooks;
    }

    public String toString() {
        return this.getName() + " (" + this.getMaximumBooks() + " book)";
    }
}

