package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chapters {
    private int chapCount, pageCount;
    private int bookId;

    public Chapters() {
        this.bookId = 0;
        this.chapCount = 0;
        this.pageCount = 0;
    }
    
    public Chapters(int bookId, int chapCount, int pageCount){
        this.bookId = bookId;
        this.chapCount = chapCount;
        this.pageCount = pageCount;
    }
    

    public void setChapCount(int chapCount) {
        this.chapCount = chapCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    
    public static void createChapters(Chapters chapters) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Chapters (book_id, chap_count, page_count) VALUES (?, ?, ?)")) {
            stmt.setInt(1, chapters.bookId);
            stmt.setInt(2, chapters.chapCount);
            stmt.setInt(3, chapters.pageCount);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Chapters getChaptersByBookId(int bookId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Chapters WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Chapters(bookId, rs.getInt("chap_count"), rs.getInt("page_count"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateChapters() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Chapters SET chap_count = ?, page_count = ? WHERE book_id = ?")) {
            stmt.setInt(1, this.chapCount);
            stmt.setInt(2, this.pageCount);
            stmt.setInt(3, this.bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteChaptersByBookId(int bookId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Chapters WHERE book_id = ?")) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
