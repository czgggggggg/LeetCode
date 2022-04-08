package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/8
 * @Description
 */
public class Code0207 {
    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1,0}};
        System.out.println(canFinish(numCourses1, prerequisites1));//true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1,0},{0,1}};
        System.out.println(canFinish(numCourses2, prerequisites2));//false

        int numCourses3 = 6;
        int[][] prerequisites3 = {{1,0},{2,1},{3,2},{5,4}};
        System.out.println(canFinish(numCourses3, prerequisites3));//true

        int numCourses4 = 6;
        int[][] prerequisites4 = {{1,0},{2,1},{3,2},{0,3}};//0 -> 3 -> 2 -> 1 -> 0
        System.out.println(canFinish(numCourses4, prerequisites4));//false
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        HashSet<Integer> set1 = new HashSet<>();//依赖集合
        HashSet<Integer> set2 = new HashSet<>();//被依赖集合
        HashSet<Integer> set3 = new HashSet<>();//可学习课程
        HashSet<Integer> set4 = new HashSet<>();//记录递归链中的课程，如果重复则说明出现循环，不可能学习完所有的课程。
        HashMap<Integer, List<Integer>> map = new HashMap<>();//依赖课程a -> 被a依赖的所有课程
        int n = prerequisites.length;
        for(int i = 0; i < n; i++){
            set1.add(prerequisites[i][0]);
            set2.add(prerequisites[i][1]);
            if(!map.containsKey(prerequisites[i][0])){
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], list);
            }else{
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
        }
        for(int i = 0; i < numCourses; i++){
            //如果课程i不依赖其他课程，即不在集合set1中，那么i是可学习的课程，放入set3中
            if(!set1.contains(i)){
                set3.add(i);
            }
        }
        //如果所有的课程都要依赖于其他的课程，则不可能学习完所有的课程。
        if(set3.size() == 0)
            return false;

        Iterator<Integer> iterator = set1.iterator();
        while(iterator.hasNext()){
            Integer a = iterator.next();
            if(!set3.contains(a)){
                set4.add(a);
                boolean res = dfs(a, set1, set2, set3, set4, map);
                if(!res)
                    return false;
                set4.remove(a);
                set3.add(a);
            }
        }

        //如果可学习课程的数量等于所有课程的数量，则可以学习完所有的课程。
        return numCourses == set3.size();
    }

    public static boolean dfs(Integer a, HashSet<Integer> set1, HashSet<Integer> set2, HashSet<Integer> set3, HashSet<Integer> set4, HashMap<Integer, List<Integer>> map){
        List<Integer> list = map.get(a);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer b = iterator.next();
            if(!set3.contains(b)){
                if(set4.contains(b)){//递归链中出现重复元素，即循环，则不可能学习完所有的课程。
                    return false;
                }else{
                    set4.add(b);
                    boolean res = dfs(b, set1, set2, set3, set4, map);
                    if(!res)
                        return false;
                    set4.remove(b);
                    set3.add(b);
                }
            }
        }

        return true;
    }
}
