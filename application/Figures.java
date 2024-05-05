package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Figures {
    private int figCount;
    private int figuresId; //pk for non existent figure table... 

    public Figures() {
        figCount = 0;
    }

    public Figures(int num) {
        setFigures(num);
    }

    public void setFigures(int num) {
        if (num >= 0) { 
            figCount = num; 
        }
    }

    public int getFigures() { 
        return figCount; 
    }

    // db ops
    public static void createFigures(Figures figures) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Figures (fig_count) VALUES (?)")) {
            stmt.setInt(1, figures.getFigures());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Figures getFiguresById(int figuresId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Figures WHERE figures_id = ?")) {
            stmt.setInt(1, figuresId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Figures(rs.getInt("fig_count"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateFigures() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Figures SET fig_count = ? WHERE figures_id = ?")) {
            stmt.setInt(1, this.getFigures());
            stmt.setInt(2, this.figuresId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFigures(int figuresId) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Figures WHERE figures_id = ?")) {
            stmt.setInt(1, figuresId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}