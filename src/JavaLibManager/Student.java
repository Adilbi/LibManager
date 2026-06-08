package JavaLibManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student extends User{
    List<Book> borrowedBooks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- Меню Студента ---");
        System.out.println("1 - Мои книги");
        System.out.println("2 - Взять книгу");
        System.out.println("3 - Вернуть книгу");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Ваши книги:");
            if (borrowedBooks.isEmpty()) {
                System.out.println("У вас нет взятых книг.");
            } else {
                for (Book book : borrowedBooks) {
                    System.out.println(book);
                }
            }
        } else if (choice == 2) {
            System.out.println("Обратитесь к библиотекарю для получения книги");
        } else if (choice == 3) {
            System.out.println("Обратитесь к библиотекарю для возврата книги");
        }
    }

    @Override
    public String getRole() {
        return "Студент";
    }
}
