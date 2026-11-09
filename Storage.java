import java.nio.file.*;
import java.util.*;

public class Storage {
    private static final Path FILE = Paths.get("books.json");

    public static List<String> load() throws Exception {
        List<String> books = new ArrayList<>();
        if (!Files.exists(FILE)) return books;
        String text = Files.readString(FILE).trim();
        if (text.length() <= 2) return books;
        for (String item : text.substring(1, text.length() - 1).split(",")) {
            books.add(item.trim().replace("\"", ""));
        }
        return books;
    }

    public static void save(List<String> books) throws Exception {
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < books.size(); i++) {
            if (i > 0) json.append(",");
            json.append("\"").append(books.get(i)).append("\"");
        }
        json.append("]");
        Files.writeString(FILE, json.toString());
    }
}