```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {
                debitStmt.setDouble(1, 100.0);
                debitStmt.setInt(2, 1);
                creditStmt.setDouble(1, 100.0);
                creditStmt.setInt(2, 2);

                debitStmt.executeUpdate();
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transfer failed, rolled back: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
```