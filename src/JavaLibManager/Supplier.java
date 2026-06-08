package JavaLibManager;
import java.util.List;
import java.util.Scanner;
public class Supplier extends User {
    private Scanner scanner = new Scanner(System.in);

    public Supplier(int id, String name) {
        super(id, name);
    }

    public void deliverBook(Book book, List<Book> books) {
        books.add(book);
        System.out.println("Поставщик " + this.name + " доставил книгу: " + book.title);
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- Меню поставщика ---");
        System.out.println("1 - Доставить книгу");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num == 1) {
            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();

            System.out.print("Введите автора: ");
            String author = scanner.nextLine();

            System.out.print("Введите год издания: ");
            int year = scanner.nextInt();

            int newId = LibraryManager.books.isEmpty() ? 1 :
                    LibraryManager.books.get(LibraryManager.books.size() - 1).getId() + 1;

            Book newBook = new Book(title, author, year, true, newId);
            deliverBook(newBook, LibraryManager.books);
        }
    }

    @Override
    public String getRole() {
        return "Поставщик";
    }
}
