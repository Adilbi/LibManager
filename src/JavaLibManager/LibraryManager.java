package JavaLibManager;
import java.util.*;

public class LibraryManager {
    static List<Book> books = new ArrayList<>();
    static Map<Integer, User> users = new HashMap<>();
    static List<String> log = new ArrayList<>();

    public void run() {
        initData();
        while (true) {
            auth();
        }
    }

    public void auth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Доступные пользователи ---");
        for (User user : users.values()) {
            System.out.println("ID: " + user.getId() + ", Имя: " + user.getName() + ", Роль: " + user.getRole());
        }

        System.out.print("Введите ID пользователя: ");
        int inputId = scanner.nextInt();
        User selectedUser = users.get(inputId);

        if (selectedUser != null) {
            System.out.println("Вы вошли как " + selectedUser.getRole() + " - " + selectedUser.getName());
            selectedUser.showMenu(); // Полиморфизм: әр қолданушының өз мәзірі ашылады
        } else {
            System.out.println("Пользователь не найден.");
        }
    }

    public void initData() {
        books.add(new Book("Абай жолы", "Мухтар Ауезов", 1950, true, 1));
        books.add(new Book("Сатпаев", "Медеу Сарсеке", 1980, true, 2));

        users.put(4, new Student(4, "Адильби"));
        users.put(3, new Librarian(3, "Светлана"));
        users.put(2, new Supplier(2, "Atamura"));
        users.put(1, new Admin(1, "Админ"));
    }

    public void getBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getLog() {
        for (String s : log) {
            System.out.println(s);
        }
    }

    public void getUsers() {
        for (User user : users.values()) {
            System.out.println(user.getId() + " - " + user.getName());
        }
    }
}
