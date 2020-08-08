package code.design_pattern.dao;

public class DaoPatternMain {

    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}
