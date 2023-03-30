import java.util.ArrayList;

public class randomArr {
    public static void PrintArray(ArrayList<Integer> arr) {
        System.out.println();
        for(int element: arr) {
            System.out.printf("%d, ", element);
        } 
        System.out.println("\n");
    }
    public static ArrayList<Integer> FillRandomArray(int n) {  //заполнение списка случайными целыми числами
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }  
}
