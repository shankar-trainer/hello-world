package question;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Book  book[]=new Book[5];
        book[0]=new Book(54455454,"java beginner","sunil kumar");
        book[1]=new Book(54455455,"java professional","amit kumar");
        book[2]=new Book(54455456,"java for dummies","kamal kumar");
        book[3]=new Book(54455457,"java beginner","sunil kumar");
        book[4]=new Book(54455458,"java professional","amit kumar");

         for (Book b : book ) {
            library.addBook(b);
        }

        System.out.println(
                "1.Display all book details\n" +
                "2.Search Book by author \n" +
                "3.Count number of books - by book name\n" +
                "Enter your choice:");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1: {
                for (Book book1 : library.getBookList()) {
                    System.out.println("ISBN no: " + book1.getIsbnno());
                    System.out.println("Book name: " + book1.getBookName());
                    System.out.println("Author name: " + book1.getAuthor());
                }

                break;
            }
            case 2: {
                System.out.println("Enter the author name:");
                String authorName = scanner.nextLine();
                List<Book> books = library.viewBooksByAuthor(authorName);

                if (books.isEmpty()) {
                    System.out.println("None of the book published by the author " + authorName);
                } else {
                    for (Book book1 : books) {
                        System.out.println("ISBN no: " + book1.getIsbnno());
                        System.out.println("Book name: " + book1.getBookName());
                        System.out.println("Author name: " + book1.getAuthor());
                    }
                }

                break;
            }
            case 3: {
                System.out.println("Enter the book name:");
                String bookName = scanner.nextLine();
                int count = library.countnoofbook(bookName);
                System.out.println(count);
            }
        }
    }
}
