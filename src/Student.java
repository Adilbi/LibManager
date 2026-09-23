public class Student {
    String name;
    Book[] borrowedBooks;
    Student (String names, int maxBooks) {
        name = names;
        borrowedBooks = new Book[maxBooks];

    }

}
