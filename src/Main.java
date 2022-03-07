import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Collections.addAll(numbers, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> numbersTmp = new ArrayList();
        for (int i:
             numbers) {
            if (i > 0){
                if (i % 2 == 0){
                    numbersTmp.add(i);
                }
            }
        }
        Collections.sort(numbersTmp);
        System.out.println(numbersTmp);
    }
}
