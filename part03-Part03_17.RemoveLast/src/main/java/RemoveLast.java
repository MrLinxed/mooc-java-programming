
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        int size = strings.size();
        if(size == 0) {
            return;
        }
        int lastIndex = strings.size() - 1;
        strings.remove(lastIndex);
    }
    
    public static void main(String[] args) {
        // Try your method in here
    }

}
