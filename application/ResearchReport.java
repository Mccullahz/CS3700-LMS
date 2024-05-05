//Written by Aliilani McGuire

package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResearchReport extends Publication {
    private int researchReportId; 

    public ResearchReport() {
        super();
    }

    public ResearchReport(String t, String py, int an) {
        super(t, py, new int[]{an}); 
    }

    // db ops
    public static void createResearchReport(ResearchReport report) {
        createPublication(report); 
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO ResearchReport (publication_id) VALUES (?)")) {
            stmt.setInt(1, report.getPublicationId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResearchReport getResearchReportById(int reportId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ResearchReport WHERE research_report_id = ?")) {
            stmt.setInt(1, reportId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Publication pub = getPublicationById(rs.getInt("publication_id"));
                return new ResearchReport(pub.title, pub.publicationYear, pub.authorId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateResearchReport() {
        updatePublication();
    }

    public static void deleteResearchReport(int reportId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM ResearchReport WHERE research_report_id = ?")) {
            stmt.setInt(1, reportId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}