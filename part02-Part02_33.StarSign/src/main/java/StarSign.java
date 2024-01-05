
public class StarSign {
    public static void printStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int number) {
        for(int i = 0; i < number; i++) {
            printStars(number);
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for(int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            printStars(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printTriangle(5);
        printRectangle(3, 4);
        printRectangle(9, 5);
        printRectangle(17, 3);
    }
}
