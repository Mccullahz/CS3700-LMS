//Written by Aliilani McGuire
package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {
    private String roomNum, building, departmentName;
    private int departmentId;

    public Department(){

    }
    public Department(String roomNum, String building, String departmentName) {
        this.roomNum = roomNum;
        this.building = building;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    // db ops
    public static void createDepartment(Department department) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Department (room_num, building, department_name) VALUES (?, ?, ?)")) {
            stmt.setString(1, department.roomNum);
            stmt.setString(2, department.building);
            stmt.setString(3, department.departmentName);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Department getDepartmentByName(String departmentName) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Department WHERE department_name = ?")) {
            stmt.setString(1, departmentName);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Department(rs.getString("room_num"), rs.getString("building"), departmentName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateDepartment() {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Department SET room_num = ?, building = ? WHERE department_name = ?")) {
            stmt.setString(1, this.roomNum);
            stmt.setString(2, this.building);
            stmt.setString(3, this.departmentName);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDepartment(String departmentName) {
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Department WHERE department_name = ?")) {
            stmt.setString(1, departmentName);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}