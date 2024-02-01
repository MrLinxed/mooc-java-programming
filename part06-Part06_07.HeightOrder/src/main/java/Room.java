
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
public class Room {
    private ArrayList<Person> people = new ArrayList<>();
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public void remove(Person person) {
        this.people.remove(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if(this.isEmpty()){
            return null;
        }
        
        Person shortest = people.get(0);
        for(int i = 1; i < people.size(); i++) {
            Person person = this.people.get(i);
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        
        if(shortest == null){
            return null;
        }
        
        this.remove(shortest);
        
        return shortest;
    }
}
