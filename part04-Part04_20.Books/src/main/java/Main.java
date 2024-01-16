import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Publication Year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("");
        System.out.println("What information will be printed?");
        String command = scanner.nextLine();
        
        if(command.isEmpty()){
            return;
        }
        
        for(Book book: books) {
            switch(command){
                case "everything":
                    System.out.println(book);
                    break;
                case "name":
                    System.out.println(book.getTitle());
                    break;
            }
        }

    }
}
