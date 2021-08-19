package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array119 {
    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.print(next + " ");
        }
    }
    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        int[] array = new int[rowIndex];
        List<Integer> list = new ArrayList<>();
        if(rowIndex == 0){

        }else if(rowIndex == 1){
            list.add(1);
        }else if(rowIndex == 2){
            list.add(1);
            list.add(1);
        }else{
            array[0] = 1;
            array[1] = 1;
            int count = 3;
            int tmp1 = 1;
            int tmp2 = 1;
            while(count <= rowIndex){//rowIndex = 5  //count=3  //count=4
                for(int i = 1; i < count - 1; i++){  //i=1      //i=1   i=2
                    tmp1 = tmp2;
                    tmp2 = array[i];
                    array[i] = tmp2 + tmp1;
                    //tmp2 = array[i - 1];
                }
                array[count - 1] = 1;
                count++;
            }
            for(int i = 0; i < rowIndex; i++){
                list.add(array[i]);
            }
        }
        return list;
    }
}

//[1]
//[1,1]
//[1,2,1]
//[1,3,3,1]
//[1,4,6,4,1]
