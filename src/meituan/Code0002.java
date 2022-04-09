package meituan;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Person[] persons = new Person[n];

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] split1 = str1.split(" ");
        String[] split2 = str2.split(" ");

        int height;
        String name;
        for(int i = 0; i < n; i++){
            height = Integer.valueOf(split1[i]);
            name = split2[i];
            persons[i] = new Person(height,name);
        }


//        int[] heights = new int[n];
//        String[] names = new String[n];
//        for(int i = 0; i < n; i++)
//            heights[i] = sc.nextInt();
//        for(int i = 0; i < n; i++)
//            names[i] = sc.next();
//        Person[] persons = new Person[n];
//        for(int i = 0; i < n; i++){
//            persons[i] = new Person(heights[i], names[i]);
//        }

        Person tmp;
        for(int i = n - 1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                if(persons[j - 1].height > persons[j].height){
                    tmp = persons[j - 1];
                    persons[j - 1] = persons[j];
                    persons[j] = tmp;
                }else if(persons[j - 1].height == persons[j].height){
                    if(persons[j - 1].name.compareTo(persons[j].name) > 0){
                        tmp = persons[j - 1];
                        persons[j - 1] = persons[j];
                        persons[j] = tmp;
                    }
                }
            }
        }

        for(int i = 0; i < n - 1; i++)
            System.out.print(persons[i].name + " ");
        System.out.println(persons[n - 1].name);
    }
}
class Person{
    public int height;
    public String name;

    public Person(int height, String name) {
        this.height = height;
        this.name = name;
    }
}
//4
//176 170 176 176
//beta tom alpha bamma

//tom alpha bamma beta

//3
//179 170 170
//a b aaa