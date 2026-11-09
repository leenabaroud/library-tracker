public class BookCount {
    public static int count() throws Exception {
        return Storage.load().size();
    }
}
