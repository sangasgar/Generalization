import java.util.*;

public class Main {
    public static void main(String[] args) {
         //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        List<?> array = new ArrayList<>(Arrays.asList(10,"20",30,"java"));
        swap(array,1,2);
        for (int k = 0; k < array.size(); k++) {
            System.out.print(array.get(k) + " ");
        }

        //2. Написать метод, который преобразует массив в ArrayList;
        System.out.println();
        int[] num = {20,1,2,3,5,20};

        for (int k = 0; k < array.size(); k++) {
            System.out.print(arrayConvertArrayList(num).get(k) + " ");
        }
        System.out.println();
        //3.Задание

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        ArrayList<Fruit> boxA = new ArrayList<>(Arrays.asList(a1,a2,a3));
        ArrayList<Fruit> boxO = new ArrayList<>(Arrays.asList(o1,o2,o3));
        Float fa = 0f;
        for (int i = 0; i < boxA.size(); i++) {
            fa += boxA.get(i).getSIZE();
        }
        System.out.println(fa);
        Float fo = 0f;
        for (int i = 0; i < boxO.size(); i++) {
            fo += boxO.get(i).getSIZE();
        }
        System.out.println(fo);

    }
    public static ArrayList arrayConvertArrayList (int[] num) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < num.length; i++) {
           Integer k = num [i];
           list.add(k);
        }
        return list;
    }
    public static List swap (List array, int i, int j) {
        Collections.swap(array,i,j);
        return array;
    }

}
