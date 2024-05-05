//Written by Aliilani McGuire

package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Magazine extends Publication {
    private int magazineId;

    public Magazine() {
        super("N/A", "1963");
    }

    public Magazine(String t, String py) {
        super(t, py);
    }

    // Database operations
    public static void createMagazine(Magazine magazine) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Magazine (title, publication_year) VALUES (?, ?)")) {
            stmt.setString(1, magazine.getTitle());
            stmt.setString(2, magazine.getPublicationYear());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Magazine getMagazineById(int magazineId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Magazine WHERE magazine_id = ?")) {
            stmt.setInt(1, magazineId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Magazine(rs.getString("title"), rs.getString("publication_year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateMagazine() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Magazine SET title = ?, publication_year = ? WHERE magazine_id = ?")) {
            stmt.setString(1, this.getTitle());
            stmt.setString(2, this.getPublicationYear());
            stmt.setInt(3, this.magazineId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMagazine(int magazineId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Magazine WHERE magazine_id = ?")) {
            stmt.setInt(1, magazineId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}