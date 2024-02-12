import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        Assert.assertEquals(0, this.management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        this.management.add("Write a test");
        Assert.assertEquals(1, this.management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        this.management.add("Write a test");
        Assert.assertTrue(this.management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        Assert.assertTrue(this.management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifMarkedCompletedIsNotCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        Assert.assertFalse(this.management.isCompleted("Some exercise"));
    }
}
