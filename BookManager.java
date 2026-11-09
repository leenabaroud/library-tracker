import java.util.List;

public class BookManager {
    public static void addBook(String title) throws Exception {
        List<String> books = Storage.load();
        books.add(title);
        Storage.save(books);
        System.out.println("Added: " + title);
    }

    public static void listBooks() throws Exception {
        List<String> books = Storage.load();
        if (books.isEmpty()) {
            System.out.println("No books yet.");
            return;
        }
        for (String b : books) {
            System.out.println("- " + b);
        }
    }
}