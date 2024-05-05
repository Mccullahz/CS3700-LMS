//Written by Aliilani McGuire
package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommitteeMember extends Author {
    public String education_background;

    public CommitteeMember(int authorId, String firstName, String lastName, String education_background) {
        super(authorId, firstName, lastName);
        this.education_background = education_background;
    }

    // db ops
    public static void createCommitteeMember(CommitteeMember member) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO CommitteeMember (author_id, first_name, last_name, education_background) VALUES (?, ?, ?, ?)")) {
            stmt.setInt(1, member.getAuthorId());
            stmt.setString(2, member.getFirstName());
            stmt.setString(3, member.getLastName());
            stmt.setString(4, member.education_background);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static CommitteeMember getCommitteeMemberById(int authorId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CommitteeMember WHERE author_id = ?")) {
            stmt.setInt(1, authorId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new CommitteeMember(rs.getInt("author_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("education_background"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateCommitteeMember() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE CommitteeMember SET first_name = ?, last_name = ?, education_background = ? WHERE author_id = ?")) {
            stmt.setString(1, this.getFirstName());
            stmt.setString(2, this.getLastName());
            stmt.setString(3, this.education_background);
            stmt.setInt(4, this.getAuthorId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCommitteeMember(int authorId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM CommitteeMember WHERE author_id = ?")) {
            stmt.setInt(1, authorId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}