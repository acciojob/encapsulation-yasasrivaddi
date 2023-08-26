// Main.java
public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("Initial Name");
        
        // Set a new value using setter
        obj.setName("New Name");
        
        // Access the value using getter and print
        System.out.println(obj.getName());  // Output: New Name
    }
}
