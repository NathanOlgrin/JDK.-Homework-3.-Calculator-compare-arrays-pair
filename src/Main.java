import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public <T> boolean compareArrays(T[] array1, T[] array2){
        if(array1 == null || array2 == null || array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++){
            if(!Objects.equals(array1[i], array2[i])){
                return false;
            }
        }
        return true;
    }
}