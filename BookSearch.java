
import java.util.List;

public class BookSearch {


        public static void search(String keyword) throws Exception {
            for (String b : Storage.load()) {
                if (b.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Found: " + b);
                }
            }
        }



}
