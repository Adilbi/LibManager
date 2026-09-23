public class LibraryManager {
    public static void main(String[] args) {
        Book book1 = new Book("Путь Абая", "Мухтар Ауезов", true);
        Book book2 = new Book("Унесенные ветром", " Маргарет Митчелл", true);
        Book book3 = new Book("48 Законов Власти", "Роберт Грин", true);
        Librarian librarian = new Librarian();
        Supplier supplier = new Supplier();
        Student student1 = new Student("Василий", 2);
        Student student2 = new Student("Алибек", 3);

        librarian.catalog [0] = book1;
        librarian.catalog [1] = book2;
        librarian.catalog [2] = book3;

        librarian.distributionBook("Путь Абая", student1);







    }
}


