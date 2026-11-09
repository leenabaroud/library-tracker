
import java.util.List;

public class BookSearch {


        public static void search(String keyword) throws Exception {
            for (String b : Storage.load()) {
                if (b.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Found: " + b);
                }
            }
        }


    public static void remove(String title) throws Exception {
        List<String> books = Storage.load();
        books.remove(title);
        Storage.save(books);
        System.out.println("Removed: " + title);
    }




}
