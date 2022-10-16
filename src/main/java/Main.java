import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tolkien","The lord of the rings");
        Gson gson = new Gson();
        String bookGson = gson.toJson(book);
        System.out.println(bookGson);
    }
}
