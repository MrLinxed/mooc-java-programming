
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            printStars(i * 2 - 1);
            spaces--;
        }
        
        for (int j = 2; j > 0; j--) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
