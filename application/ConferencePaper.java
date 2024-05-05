/*
* @author: Zylar :)
*/
package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConferencePaper {
    private int conferencePaperId;
    private String conferenceName;
    private String location;
    private String period;
    private int itemId;


    // CRUD operations
    // add conf paper
    public void addConferencePaper() {
        String sql = "INSERT INTO ConferencePaper (conference_paper_id, conference_name, location, period, item_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, this.conferencePaperId);
            stmt.setString(2, this.conferenceName);
            stmt.setString(3, this.location);
            stmt.setString(4, this.period);
            stmt.setInt(5, this.itemId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // get conf paper
    public ConferencePaper getConferencePaper(int id) {
        String sql = "SELECT * FROM ConferencePaper WHERE conference_paper_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.conferencePaperId = rs.getInt("conference_paper_id");
                this.conferenceName = rs.getString("conference_name");
                this.location = rs.getString("location");
                this.period = rs.getString("period");
                this.itemId = rs.getInt("item_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    // update conf paper
    public void updateConferencePaper() {
        String sql = "UPDATE ConferencePaper SET conference_name = ?, location = ?, period = ?, item_id = ? WHERE conference_paper_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, this.conferenceName);
            stmt.setString(2, this.location);
            stmt.setString(3, this.period);
            stmt.setInt(4, this.itemId);
            stmt.setInt(5, this.conferencePaperId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // delete conf paper
    public void deleteConferencePaper(int id) {
        String sql = "DELETE FROM ConferencePaper WHERE conference_paper_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}