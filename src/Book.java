public class Book {
    String title;
    String author;
    boolean isAvailable;
    Book (String titleBook, String authorBook, boolean isAvailableBook) {
title = titleBook;
author = authorBook;
isAvailable = isAvailableBook;
    }
void bookIsAvailable () {
    System.out.println("Статус книги (Выдана/Доступна): ");
    if (isAvailable == false) {
        System.out.println( "Книга " + title + " выдана - недоступна");
    } else if (isAvailable == true) {
        System.out.println( "Книга " + title+ " в наличи - доступна");

    } else {
        //
    }

}
void printInfoBook () {
    System.out.println("Название книги: " + title);
    System.out.println("Автор книги: " + author);
    System.out.println("Наличие книги: " + isAvailable );

}
}
