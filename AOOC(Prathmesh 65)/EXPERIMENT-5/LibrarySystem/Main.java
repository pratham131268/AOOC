import LibraryManagement.Book;
import LibraryManagement.Member;

public class Main{
    public static void main(String[] args){

        Book book = new Book("The Design of Unix OS", "Maurice j Bach", "4235163246");
        Member member = new Member("xyz", 3423);

        book.show_book_info();
        member.show_member_info();

    }
}
