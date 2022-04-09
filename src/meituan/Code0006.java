package meituan;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        String[] names = new String[n];
        for(int i = 0; i < n; i++)
            heights[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            names[i] = sc.next();

        List<Personz> personzs = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            Personz tmp = new Personz(heights[i],names[i]);
            personzs.add(tmp);
        }
        Collections.sort(personzs, new Comparator<Personz>() {
            @Override
            public int compare(Personz o1, Personz o2) {
                Personz personz1 = (Personz)o1;
                Personz personz2 = (Personz)o2;
                if(personz1.height == personz2.height)
                    return personz1.name.compareTo(personz2.name);
                return personz1.height - personz2.height;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(personzs.get(i).name + " ");
        }
    }
}
class Personz{
    int height;
    String name;

    public Personz(int height, String name) {
        this.height = height;
        this.name = name;
    }
}

//4
//176 170 176 176
//beta tom alpha bamma

//tom alpha bamma beta