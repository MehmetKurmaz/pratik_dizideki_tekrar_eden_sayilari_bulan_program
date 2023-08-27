import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Dizinin Boyutunu Giriniz :");
        Scanner scanner=new Scanner(System.in);
        int boyut=scanner.nextInt();
        System.out.print("Dizi Elemanlarini Giriniz :");
        int[]dizi=new int[boyut];
        for (int i=0;i<dizi.length;i++){
            dizi[i]=scanner.nextInt();

        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : dizi) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Tekrar Eden Elemanlar :");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (Tekrar Sayisi: " + entry.getValue() + ")");
            }
        }
    }
}