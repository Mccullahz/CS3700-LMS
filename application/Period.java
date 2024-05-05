/*
 * @author Zylar :)
 */
package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Period {
    private int periodId; // Unique identifier for each period
    public String beginDate;
    public String endDate;

    public Period(String beginDate, String endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    // db ops
    public static void createPeriod(Period period) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Period (begin_date, end_date) VALUES (?, ?)")) {
            stmt.setString(1, period.beginDate);
            stmt.setString(2, period.endDate);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Period getPeriodById(int periodId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Period WHERE period_id = ?")) {
            stmt.setInt(1, periodId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Period(rs.getString("begin_date"), rs.getString("end_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePeriod() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Period SET begin_date = ?, end_date = ? WHERE period_id = ?")) {
            stmt.setString(1, this.beginDate);
            stmt.setString(2, this.endDate);
            stmt.setInt(3, this.periodId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePeriod(int periodId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Period WHERE period_id = ?")) {
            stmt.setInt(1, periodId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}