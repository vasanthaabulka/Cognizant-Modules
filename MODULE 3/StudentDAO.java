```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
    private String url = "jdbc:mysql://localhost:3306/school";
    private String user = "root";
    private String password = "your_password";

    public void insertStudent(int id, String name) {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Student inserted: " + name);
        } catch (Exception e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    public void updateStudent(int id, String name) {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Student updated: " + name);
        } catch (Exception e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(3, "Charlie");
        dao.updateStudent(3, "Charles");
    }
}
```