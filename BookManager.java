import java.util.List;

public class BookManager {
    public static void addBook(String title) throws Exception {
        if (title == null || title.isBlank()) {
            System.out.println("Title cannot be empty.");
            return;
        }
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
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
}