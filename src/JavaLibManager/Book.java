package JavaLibManager;
import java.util.Objects;
public class Book {
    protected static int counter = 1;
    protected int id;
    protected String title;
    protected String author;
    protected int year;
    boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable, int id) {
        // Ескерту: Сырттан келген id қолданылмай, counter арқылы автоматты беріліп тұр
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable; // Жөнделді (true-ның орнына өзгермелі мән)
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && isAvailable == book.isAvailable && id == book.id &&
                Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}
