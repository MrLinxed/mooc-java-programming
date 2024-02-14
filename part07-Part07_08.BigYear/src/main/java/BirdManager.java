
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class BirdManager {
    private ArrayList<Bird> birds;

    public BirdManager() {
        birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addBird(String name, String latinName) {
        this.addBird(new Bird(name, latinName));
    }
    
    public void observe(Bird bird) {
        bird.observe();
    }
    
    public void observe(String name) {
        this.observe(this.getBird(name));
    }
    
    public Bird getBird(String name) {
        for(Bird bird: this.birds) {
            if(bird.getName().equals(name) || bird.getLatinName().contains(name)) {
                return bird;
            }
        }
        
        return null;
    }
    
    public String toString() {
        String out = "";
        
        for(Bird bird: this.birds) {
            if(!out.isEmpty()){
                out += "\n";
            }
            out += bird;
        }
        
        return out;
    }
    
}
