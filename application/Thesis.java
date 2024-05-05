package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Thesis extends Publication {
    private int thesisId; 

    public Thesis() {
        super();
    }

    public Thesis(String t, String py, int an) {
        super(t, py, new int[]{an});
    }

    // db ops
    public static void createThesis(Thesis thesis) {
        createPublication(thesis); 
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Thesis (publication_id) VALUES (?)")) {
            stmt.setInt(1, thesis.getPublicationId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Thesis getThesisById(int thesisId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Thesis WHERE thesis_id = ?")) {
            stmt.setInt(1, thesisId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Publication pub = getPublicationById(rs.getInt("publication_id"));
                return new Thesis(pub.title, pub.publicationYear, pub.authorId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateThesis() {
        updatePublication(); 
    }

    public static void deleteThesis(int thesisId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Thesis WHERE thesis_id = ?")) {
            stmt.setInt(1, thesisId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}