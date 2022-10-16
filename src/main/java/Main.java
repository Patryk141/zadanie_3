import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tolkien","The lord of the rings");
        Gson gson = new Gson();
        Book book1 = new Book("J.K. Rowling","Harry Potter");
        String bookGson = gson.toJson(book);
        String book1Gson = gson.toJson(book1);
        System.out.println(bookGson);
        System.out.println(book1Gson);
    }
}
