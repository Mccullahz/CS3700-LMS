package application;
// Kala
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book extends Publication {
    private int bookId;
    public String title, pubYear;
    public int authNum;
    public Publisher publisher;
    public Chapters chap;
    public Figures fig;
    private int edNum;

    public Book() {
        super();
        publisher = new Publisher();
        chap = new Chapters();
        fig = new Figures();
        setEdNum(1);
    }

    public Book(String title, String pubYear, int authNum, String fName, String lName, int chapCount, int pageCount, int numFigs, int edNum) {
        super(title, pubYear, new int[]{authNum});        
        publisher = new Publisher(fName, lName);
        chap = new Chapters(bookId, chapCount, pageCount);
        fig = new Figures(numFigs);
        setEdNum(edNum);
    }

    public void setEdNum(int num) { if (num >= 1) { edNum = num; } }
    public int getEdNum() { return edNum; }

    public int getBookId() {
        return bookId;
    }

    // db ops
    public static void createBook(Book book) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Book (title, pubYear, authNum, edNum) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, book.title);
            stmt.setString(2, book.pubYear);
            stmt.setInt(3, book.authNum);
            stmt.setInt(4, book.edNum);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Book getBookById(int bookId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Book WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Book(rs.getString("title"), rs.getString("pubYear"), rs.getInt("authNum"), "", "", 0, 0, 0, rs.getInt("edNum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateBook() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Book SET title = ?, pubYear = ?, authNum = ?, edNum = ? WHERE book_id = ?")) {
            stmt.setString(1, this.title);
            stmt.setString(2, this.pubYear);
            stmt.setInt(3, this.authNum);
            stmt.setInt(4, this.edNum);
            stmt.setInt(5, this.getBookId()); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBook(int bookId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Book WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}