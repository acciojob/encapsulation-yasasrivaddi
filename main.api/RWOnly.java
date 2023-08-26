// RWOnly.java
public class RWOnly {
    private String name;  // Private member variable
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Constructor (optional)
    public RWOnly(String name) {
        this.name = name;
    }
}
