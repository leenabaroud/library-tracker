import java.util.List;

public class BookManager {
    public static void addBook(String title) throws Exception {
        List<String> books = Storage.load();
        books.add(title);
        Storage.save(books);
        System.out.println("Added: " + title);
    }
}