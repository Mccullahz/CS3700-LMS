package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Publisher {
    private int publisherId; 
    public String fName, lName;

    public Publisher() {
        fName = "N/A";
        lName = "N/A";
    }

    public Publisher(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    // db ops
    public static void createPublisher(Publisher publisher) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Publisher (first_name, last_name) VALUES (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, publisher.fName);
            stmt.setString(2, publisher.lName);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                publisher.publisherId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Publisher getPublisherById(int publisherId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Publisher WHERE publisher_id = ?")) {
            stmt.setInt(1, publisherId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Publisher(rs.getString("first_name"), rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePublisher() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Publisher SET first_name = ?, last_name = ? WHERE publisher_id = ?")) {
            stmt.setString(1, this.fName);
            stmt.setString(2, this.lName);
            stmt.setInt(3, this.publisherId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePublisher(int publisherId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Publisher WHERE publisher_id = ?")) {
            stmt.setInt(1, publisherId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}