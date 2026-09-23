public class Librarian {
    String name = "Галя";
    Book[] catalog = new Book[5];

    void catalogBook() {
        System.out.println("Каталог книг:");
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null) {
                System.out.println((i + 1) + ". ");
                catalog[i].printInfoBook();
            }
        }
    }

    public void deleteBookCatalog (String bookTitle) {
        System.out.println("Удаление книги из каталога: ");
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null && catalog[i].title.equals(bookTitle)) {
                catalog[i] = null;

                System.out.println("Книга " + bookTitle + " удалена из каталога");

            }


        }

    }
    public void addBook (Book book) {
        for (int i =0; i < catalog.length; i++) {
            if (catalog [i] == null) {
                catalog [i] = book;
                System.out.println("Книга " + book.title + " добавлена в каталог");
                break;
            }
        }

    }

    public void distributionBook (String bookTitle, Student student) {
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null && catalog[i].title.equals(bookTitle) && catalog[i].isAvailable == true) {
                catalog [i].isAvailable =false;
               // student.borrowedBooks(catalog[i]);
                System.out.println("Книга " + bookTitle + " выдана студенту " + student.name);
            }

        }
    }
    public void returnBook (String bookTitle, Student student) {
        //Book returnedBook = student.returnBook(bookTitle);
    }
}
