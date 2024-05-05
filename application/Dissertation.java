package application;

//Patrick Siegler

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dissertation extends Publication {
    
    private Department department;
    private CommitteeMember[] committeeMembers;
    private Chapters chapters;
    private Figures figures;
    private int dissertationId;

    public Dissertation(String title, String publicationYear, int dissertationId, Department department, CommitteeMember[] committeeMembers, Chapters chapters, Figures figures) {
        super(title, publicationYear);
        this.dissertationId = dissertationId;
        this.department = department;
        this.committeeMembers = committeeMembers;
        this.chapters = chapters;
        this.figures = figures;
    }

    // Getter methods for all fields
    public Department getDepartment() {
        return department;
    }

    public CommitteeMember[] getCommitteeMembers() {
        return committeeMembers;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public Figures getFigures() {
        return figures;
    }

    public int getDissertationId() {
        return dissertationId;
    }
    // Database operations
    public static void createDissertation(Dissertation dissertation) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Dissertation (title, publication_year, department_id) VALUES (?, ?, ?)")) {
            stmt.setString(1, dissertation.getTitle());
            stmt.setString(2, dissertation.getPublicationYear());
            stmt.setInt(3, dissertation.getDepartment().getDepartmentId()); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Dissertation getDissertationById(int dissertationId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Dissertation WHERE dissertation_id = ?")) {
            stmt.setInt(1, dissertationId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Dissertation(rs.getString("title"), rs.getString("publication_year"), rs.getInt("dissertation_id"), new Department(), new CommitteeMember[0], new Chapters(), new Figures());            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateDissertation() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Dissertation SET title = ?, publication_year = ?, department_id = ? WHERE dissertation_id = ?")) {
            stmt.setString(1, this.getTitle());
            stmt.setString(2, this.getPublicationYear());
            stmt.setInt(3, this.getDepartment().getDepartmentId());
            stmt.setInt(4, this.getDissertationId()); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDissertation(int dissertationId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Dissertation WHERE dissertation_id = ?")) {
            stmt.setInt(1, dissertationId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}