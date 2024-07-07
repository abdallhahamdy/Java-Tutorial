package SingleResponsibiltyPrinciple.Example_2;

public class LoanService {
    public void loanBook(Member member, Book book) {
        // Code to loan book to member
        System.out.println("Book '" + book.getTitle() + "' loaned to member " + book.getAuthor() + ".");
    }
}
