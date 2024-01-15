
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number) {
        this.sum += number;        
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if(this.count <= 0){
            return 0.0;
        }
        
        return (double)this.sum / this.count;
    }
}
