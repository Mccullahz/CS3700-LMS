//Written by Aliilani McGuire

package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JournalPaper extends Publication {
    private int journalPaperId; 
    public String journal_title;

    public JournalPaper() {
        super();
        journal_title = "N/A";
    }

    public JournalPaper(String t, String py, int an, String jt) {
        super(t, py, new int[]{an});
        journal_title = jt;
    }

    // db ops
    public static void createJournalPaper(JournalPaper journalPaper) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO JournalPaper (title, publication_year, author_id, journal_title) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, journalPaper.getTitle());
            stmt.setString(2, journalPaper.getPublicationYear());
            stmt.setInt(3, journalPaper.getAuthorId());
            stmt.setString(4, journalPaper.journal_title);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static JournalPaper getJournalPaperById(int journalPaperId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM JournalPaper WHERE journal_paper_id = ?")) {
            stmt.setInt(1, journalPaperId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new JournalPaper(rs.getString("title"), rs.getString("publication_year"), rs.getInt("author_id"), rs.getString("journal_title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateJournalPaper() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE JournalPaper SET title = ?, publication_year = ?, author_id = ?, journal_title = ? WHERE journal_paper_id = ?")) {
            stmt.setString(1, this.getTitle());
            stmt.setString(2, this.getPublicationYear());
            stmt.setInt(3, this.getAuthorId());
            stmt.setString(4, this.journal_title);
            stmt.setInt(5, this.journalPaperId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteJournalPaper(int journalPaperId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM JournalPaper WHERE journal_paper_id = ?")) {
            stmt.setInt(1, journalPaperId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}