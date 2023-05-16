//this is part of an example off MOOC
import java.util.HashMap;
import java.util.ArrayList;
public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPublished() {
        return this.published;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }

    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);
        long start = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));

        System.out.println();

        System.out.println(directory.get("Persuasion"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");

        //////////////////////////Below section does not use hashmap, but ArrayList instead
//        ArrayList<Book> books = new ArrayList<>();
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
//        books.add(senseAndSensibility);
//        books.add(prideAndPrejudice);
//
//        System.out.println(get(books, "Sense and Sensibility"));
//
//        System.out.println();
//
//        System.out.println(get(books, "Persuasion"));
//
//        //System.nanoTime():
//        long start = System.nanoTime();
//        System.out.println(get(books, "Sense and Sensibility"));
//
//        System.out.println();
/////////////////////////////////////////////////////////////
        ////below comment does not use hash map
//        System.out.println(get(books, "Persuasion"));
//        long end = System.nanoTime();
//        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
//
//        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");

///////////////////////////////////////////// This one uses hash map
//        HashMap<String, Book> directory = new HashMap<>();
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
//
//        directory.put(senseAndSensibility.getName(), senseAndSensibility);
//        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
//
//        Book book = directory.get("Persuasion");
//        System.out.println(book);
//        System.out.println();
//        book = directory.get("Pride and Prejudice");
//        System.out.println(book);

    }

    public static Book get(ArrayList<Book> books, String name) {

        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }
}