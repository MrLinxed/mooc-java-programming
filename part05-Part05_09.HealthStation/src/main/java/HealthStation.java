
public class HealthStation {

    private int weighings = 0;
    
    public int weigh(Person person) {
        this.weighings += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighings;
    }

}
