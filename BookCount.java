public class BookCount {
    public static int count() throws Exception {
        return Storage.load().size();

    }

    public static void printCount() throws Exception {
        System.out.println("Total books: " + count());
    }

}
