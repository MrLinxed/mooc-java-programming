
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
public class Scores {
    private ArrayList<Integer> scores;

    public Scores() {
        scores = new ArrayList<>();
    }
    
    public void add(int score) {
        if(score < 0 || score > 100) {
            return;
        }
        
        scores.add(score);
    }
    
    public ArrayList<Integer> scoresAbove(int above) {
        ArrayList<Integer> aboveScores = new ArrayList<>();
        
        for(int i : scores) {
            if(i < above) {
                continue;
            }
            
            aboveScores.add(i);
        }
        
        return aboveScores;
    }
    
    public ArrayList<Integer> scores() {
        return this.scores;
    }
    
    public int sum(int above) {
        int sum = 0;
        
        for(int i : this.scoresAbove(above)) {
            sum += i;
        }
        
        return sum;
    }
    
    public int sum() {
        return this.sum(0);
    }
    
    public double average(int above) {
        int sum = this.sum(above);
        int size = this.scoresAbove(above).size();
        
        if(sum == 0 || size == 0) {
            return 0;
        }
                
        return sum / (double) size;
    }
    
    public double average() {
        return this.average(0);
    }
    
    public int[] bracketCounts() {
        int[] bracketCounts = {0, 0, 0, 0, 0, 0};
        
        for(int i : this.scores) {
            if(i < 50) {
                bracketCounts[5] += 1;
            } else if(i < 60) {
                bracketCounts[4] += 1;
            } else if(i < 70) {
                bracketCounts[3] += 1;
            } else if(i < 80) {
                bracketCounts[2] += 1;
            } else if(i < 90) {
                bracketCounts[1] += 1;
            } else {
                bracketCounts[0] += 1;
            }
        }
    
        return bracketCounts;
    }
}
