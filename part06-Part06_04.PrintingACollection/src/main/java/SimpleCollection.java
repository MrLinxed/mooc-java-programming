
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String returnValue = "The collection " + name;
        
        if (this.elements.isEmpty()) {
            return returnValue + " is empty.";
        }
        
        returnValue += " has " + this.elements.size() + " element" + (this.elements.size() > 1 ? "s" : "") + ":";
        for(String element: this.elements) {
            returnValue += "\n" + element;
        }
        
        return returnValue;
    }
}
