import java.util.*;

public class ListMetod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите минимум: ");
        int min = input.nextInt();
        System.out.println("Введите максимум: ");
        int max = input.nextInt();
        System.out.println("Введите размер массива: ");
        int s = input.nextInt();
        input.close();

        LinkedList<Integer> arr = getRandomLinkedList(s, min, max);
        System.out.println(arr);
        reverseLinkedList(arr);
        System.out.println(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) { 
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }
    
    static LinkedList<Integer> getRandomLinkedList(int size, int minimum, int maximum) { 
        LinkedList<Integer> array = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static List<Integer> reverseLinkedList(LinkedList<Integer> array) { 
        List<Integer> temp = new LinkedList<Integer>(array);
        int j = 0;
        for (int i = temp.size()-1; i >= 0; i--) {
            array.set(j, temp.get(i));
            j++;
        }
        return array;
    }

    static List<Integer> reverseLinkedList2(LinkedList<Integer> array) { 
        Collections.reverse(array);
        return array;
    }
}