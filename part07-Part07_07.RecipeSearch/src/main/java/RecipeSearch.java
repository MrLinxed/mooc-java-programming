import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();
        ArrayList<Recipe> recipes = Recipe.RecipeLoader(fileToRead);
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking name");
        System.out.println("find ingredient - searches recipes by ingredient");
        while(true) {
            System.out.println("");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            else if(command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipe recipe: recipes){
                    System.out.println(recipe);
                }
            }
            
            else if(command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                
                System.out.println("Recipes:");
                for(Recipe recipe: recipes) {
                    if(recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            else if(command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                
                System.out.println("Recipes:");
                for(Recipe recipe: recipes) {
                    if(recipe.getCookingTime() <= maxCookingTime) {
                        System.out.println(recipe);
                    }
                }
            }
            
            else if(command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchIngredient = scanner.nextLine();
                
                System.out.println("Recipes:");
                for(Recipe recipe: recipes) {
                    ArrayList<String> ingredients = recipe.getIngredients();
                    
                    for(String ingredient: ingredients) {
                        if(ingredient.equals(searchIngredient)) {
                            System.out.println(recipe);
                            break;
                        }
                    }
                }
            }
        }
    }
}
