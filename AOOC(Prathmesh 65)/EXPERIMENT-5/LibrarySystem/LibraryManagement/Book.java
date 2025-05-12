package LibraryManagement;

public class Book{
    String title;
    String author;
    String isbn;

    public Book(String t, String a, String ino){
            this.title = t;
            this.author = a;
            this.isbn = ino;
    }

    public void show_book_info(){
        System.out.println("------Book Details---------");
        System.out.println("Book Title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("ISBN: " + isbn);
    }

}

