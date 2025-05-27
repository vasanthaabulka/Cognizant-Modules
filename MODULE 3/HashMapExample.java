import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID and name (type 'done' to finish):");
        while (true) {
            System.out.print("ID: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            int id = Integer.parseInt(input);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }
        System.out.print("Enter ID to find name: ");
        int searchId = scanner.nextInt();
        System.out.println("Name: " + students.getOrDefault(searchId, "Not found"));
        scanner.close();
    }
}