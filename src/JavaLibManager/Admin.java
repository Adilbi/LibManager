package JavaLibManager;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Admin extends User{
    private Scanner scanner = new Scanner(System.in);

    public Admin(int id, String name) {
        super(id, name);
    }

    public void addUser(User user, Map<Integer, User> users) {
        users.put(user.getId(), user);
        System.out.println("Пользователь добавлен: " + user.getName());
    }

    public void viewAllBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void viewLog(List<String> log) {
        for (String logi : log) {
            System.out.println(logi);
        }
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- Меню Администратора ---");
        System.out.println("1 - Добавить пользователя");
        System.out.println("2 - Посмотреть список книг");
        System.out.println("3 - Просмотр логов");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num == 1) {
            System.out.println("Выберите тип пользователя:\n1 - Администратор\n2 - Библиотекарь\n3 - Поставщик\n4 - Студент");
            int userType = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите имя пользователя: ");
            String name = scanner.nextLine();

            int newId = LibraryManager.users.isEmpty() ? 1 :
                    LibraryManager.users.keySet().stream().max(Integer::compare).get() + 1;

            User newUser = null;
            switch (userType) {
                case 1: newUser = new Admin(newId, name); break;
                case 2: newUser = new Librarian(newId, name); break;
                case 3: newUser = new Supplier(newId, name); break;
                case 4: newUser = new Student(newId, name); break;
                default: System.out.println("Неверный тип пользователя!"); return;
            }

            LibraryManager.users.put(newId, newUser);
            System.out.println("Пользователь добавлен с ID: " + newId);
        } else if (num == 2) {
            viewAllBooks(LibraryManager.books);
        } else if (num == 3) {
            viewLog(LibraryManager.log);
        }
    }

    @Override
    public String getRole() {
        return "Админ";
    }
}
