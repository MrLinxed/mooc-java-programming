
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    private double avg(ArrayList<Integer> list) {
        int sum = 0;
        for(int i: list){
            sum += i;
        }
        
        if(sum == 0){
            return -1;
        }
        
        return (double)sum / list.size();
    }
    
    public double averageOfPoints() {
        return this.avg(this.points);
    }
    
    public double averageOfGrades() {
        return this.avg(this.grades);
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
