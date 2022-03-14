//package microsoft;
//
//import java.util.*;
//
///**
// * @Author czgggggggg
// * @Date 2022/3/14
// * @Description
// */
//public class Test {
//    public static void main(String[] args) {
//        int n, m;
//        Scanner sc = new Scanner(System.in);
//        String nm = sc.nextLine();
//        String[] split1 = nm.split(" ");
//        n = Integer.valueOf(split1[0]);
//        m = Integer.valueOf(split1[1]);
//        HashSet<String> set1 = new HashSet<>();
//        HashSet<String> set2 = new HashSet<>();
//
//        String[][] arr = new String[n][2];
//        for(int i = 0; i < n; i++){
//            String str = sc.nextLine();
//            String[] split = str.split(" ");
//            arr[i][0] = split[0];
//            arr[i][1] = split[1];
//            set1.add(split[0]);
//            set2.add(split[1]);
//        }
//
//        //找到根节点
//        String root;
//        Iterator<String> iterator = set2.iterator();
//        while(iterator.hasNext()){
//            String str = iterator.next();
//            if(!set1.contains(str)){
//                root = str;
//            }
//        }
//
//        //构建员工的关系
////        HashSet<String> set3 = new HashSet<>();//已经遍历过的员工
//        HashMap<String, Employee> employees = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            Employee e1, e2;
//            if(!employees.keySet().contains(arr[i][0])){
//                e1 = new Employee(arr[i][0],new HashSet<>());
//                employees.put(arr[i][0], e1);
//            }else{
//                e1 = employees.get(arr[i][0]);
//            }
//            if(!employees.keySet().contains(arr[i][1])){
//                e2 = new Employee(arr[i][1],new HashSet<>());
//                employees.put(arr[i][1], e2);
//            }else{
//                e2 = employees.get(arr[i][1]);
//            }
//            e2.employees.add(e1);
//        }
//
//        //要查找的员工关系
//        String[][] arr2 = new String[m][2];
//        for(int i = 0; i < m; i++){
//            String str = sc.nextLine();
//            String[] split = str.split(" ");
//            arr2[i][0] = split[0];
//            arr2[i][1] = split[1];
//        }
//
//
//    }
//    //找到从root到员工emp的路径
//    public static ArrayList<String> findPath(String root, String emp, ArrayList<String> path, HashMap<String, Employee> employees){
//        HashSet<Employee> set = employees.get(root).employees;
//        if(root == )
//
//
//        Iterator<Employee> iterator = set.iterator();
//        while(iterator.hasNext()){
//            Employee next = iterator.next();
//
//        }
//    }
//
//}
