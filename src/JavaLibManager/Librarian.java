package JavaLibManager;
import java.util.Scanner;
public class Librarian extends User{
    private Scanner scanner = new Scanner(System.in);

    public Librarian(int id, String name) {
        super(id, name);
    }

    public void giveBook(Student student, Book book) {
        if (book.isAvailable) {
            student.borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println("Книга " + book.title + " выдана студенту " + student.getName());
        } else {
            System.out.println("Книга недоступна");
        }
    }

    public void receiveBook(Student student, Book book) {
        if (student.borrowedBooks.contains(book)) {
            student.borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println("Студент " + student.getName() + " вернул книгу: " + book.title);
        } else {
            System.out.println("У студента нет такой книги");
        }
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- Меню библиотекаря ---");
        System.out.println("1 - Выдать книгу студенту");
        System.out.println("2 - Принять книгу от студента");
        int choice = scanner.nextInt();

        System.out.print("Введите ID студента: ");
        int studentId = scanner.nextInt();
        System.out.print("Введите ID книги: ");
        int bookId = scanner.nextInt();

        User user = LibraryManager.users.get(studentId);
        Book targetBook = null;

        for (Book b : LibraryManager.books) {
            if (b.getId() == bookId) {
                targetBook = b;
                break;
            }
        }

        if (user instanceof Student && targetBook != null) {
            if (choice == 1) {
                giveBook((Student) user, targetBook);
            } else if (choice == 2) {
                receiveBook((Student) user, targetBook);
            }
        } else {
            System.out.println("Студент или книга не найдены");
        }
    }

    @Override
    public String getRole() {
        return "Библиотекарь";
    }
}
