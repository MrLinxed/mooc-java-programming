
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        MainProgram.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        
    }
    
    public static int smallest(int[] array) {
        int index = MainProgram.indexOfSmallest(array);
        
        if(index > -1) {
            return array[index];
        }
        
        return index;
    }
    
    public static int indexOfSmallest(int[] array) {
        return MainProgram.indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if(array.length <= 0) {
            return -1;
        }
        
        int smallest = startIndex;
        
        for(int i = startIndex + 1; i < array.length; i++) {
            if(array[i] < array[smallest]) {
                smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int smallestAfterIndex = MainProgram.indexOfSmallestFrom(array, i + 1);
            int value1 = array[i];
            
            if(value1 < array[smallestAfterIndex]) {
                continue;
            }
            
            MainProgram.swap(array, i, smallestAfterIndex);
        }
    }

}
