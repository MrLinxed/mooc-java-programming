
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public boolean equals(Object value) {
        if(value == this) {
            return true;
        }
        
        if(value instanceof String) {
            return this.name.equals(value);
        }
        
        if(Integer.class.isInstance(value)) {
            return this.cookingTime == (Integer) value;
        }
        
        if(!(value instanceof Recipe)) {
            return false;
        }
        
        Recipe recipe = (Recipe) value;
        return this.name.equals(recipe.name) && this.cookingTime == recipe.cookingTime;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
    public static Recipe RecipeFromString(String recipe) {
        ArrayList<String> parts = new ArrayList<>();
        
        for(String part : recipe.split(",")) {
            parts.add(part);
        }
        
        return new Recipe(
            parts.remove(0), // name
            Integer.parseInt(parts.remove(0)), // cooking time
            parts
        );
    }
    
    public static ArrayList<Recipe> RecipeLoader(String fileName) {
        ArrayList<String> recipesInfo = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            String recipeInfo = "";
            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.isBlank() || line.isEmpty()) {
                    
                    if(!recipeInfo.isEmpty()) {
                        recipesInfo.add(recipeInfo);
                    }
                    
                    recipeInfo = "";
                    continue;
                }
                
                recipeInfo += (!recipeInfo.isEmpty() ? "," : "") + line;
            }
            
            if(!recipeInfo.isEmpty()) {
                recipesInfo.add(recipeInfo);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        for(String info : recipesInfo){
            recipes.add(RecipeFromString(info));
        }
        
        return recipes;
    }
}
