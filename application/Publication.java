package application;
//Kala :D

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Publication {
    private int publicationId; 
    public String title, publicationYear;
    public Integer authorId; 

    public Publication() {
        title = "N/A";
        publicationYear = "1969";
        authorId = 0;
    }

    public Publication(String title, String publicationYear, int[] authorIds) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorId = authorId != null ? authorId : 0;
    }
    public Publication(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public Integer getAuthorId() {
        return authorId;
    }
    
    public int getPublicationId() {
        return publicationId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublicationYear() {
        return this.publicationYear;
    }

    // db ops
    public static void createPublication(Publication publication) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Publication (title, publication_year) VALUES (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, publication.title);
            stmt.setString(2, publication.publicationYear);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                publication.publicationId = rs.getInt(1);
            }
            if (publication.authorId != null) {
                PreparedStatement stmtAuthor = conn.prepareStatement("INSERT INTO PublicationAuthor (publication_id, author_id) VALUES (?, ?)");
                stmtAuthor.setInt(1, publication.publicationId);
                stmtAuthor.setInt(2, publication.authorId);
                stmtAuthor.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Publication getPublicationById(int publicationId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Publication WHERE publication_id = ?")) {
            stmt.setInt(1, publicationId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Publication(rs.getString("title"), rs.getString("publication_year"), null); // Author IDs need to be fetched separately
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePublication() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Publication SET title = ?, publication_year = ? WHERE publication_id = ?")) {
            stmt.setString(1, this.title);
            stmt.setString(2, this.publicationYear);
            stmt.setInt(3, this.publicationId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePublication(int publicationId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Publication WHERE publication_id = ?")) {
            stmt.setInt(1, publicationId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}