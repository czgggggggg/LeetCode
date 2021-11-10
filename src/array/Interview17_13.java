//package array;
//
///**
// * @Author czgggggggg
// * @Date 2021/11/9
// * @Description
// */
//public class Interview17_13 {
//    public static void main(String[] args) {
//        //7
////        String[] dictionary = {"looked","just","like","her","brother"};
////        String sentence = "jesslookedjustliketimherbrother";
////        System.out.println(respace(dictionary,sentence));
//        //10
////        String[] dictionary = {"looked","just","like","her","brother"};
////        String sentence = "jessssslookedjustliketimherbrother";
////        System.out.println(respace(dictionary,sentence));
//
//        //10
////        String[] dictionary = {"looked","just","like","her","brother"};
////        String sentence = "jesslookedjustlikliketimherbrother";
////        System.out.println(respace(dictionary,sentence));
//
//        //7
////        String[] dictionary = {"looked","just","like","her","brother"};
////        String sentence = "jesslookedjustlikeliketimherbrother";
////        System.out.println(respace(dictionary,sentence));
//
//        //------------------------------------------------------------------//
//
////        String[] dictionary = {"wccm","wiw","uwwiwcmiiiwmmwicuwu","mw"};
////        String sentence = "iwiwwwmuiccwwwwwmumwwwmcciwwuiwcicwwuwicuiwciwmiwicwuwwmuimccwucuuim";
////        System.out.println(respace(dictionary,sentence));
//
//        //第二次提交失败的原因：当字典中出现f、fgh，且句子为fgh时，要考虑最长的fgh，而不是先截取f。
//        String[] dictionary = {"ouf","uucuocucoouoffcpuuf","pf","o","fofopupoufuofffffocpocfccuofuupupcouocpocoooupcuu","cf","cffooccccuoocpfupuucufoocpocucpuouofffpoupu","opoffuoofpupcpfouoouufpcuocufo","fopuupco","upocfucuucfucofufu","ufoccopopuouccupooc","fffu","uuopuccfocopooupooucfoufop","occ","ppfcuu","o","fpp","o","oououpuccuppuococcpoucccffcpcucoffupcoppoc","ufc","coupo","ufuoufofopcpfoufoouppffofffuupfco","focfcfcfcfpuouoccupfccfpcooup","ffupfffccpffufuuo","cufoupupppocou","upopupopccffuofpcopouofpoffopcfcuooocppofofuuc","oo","pccc","oupupcccppuuucuuouocu","fuop","ppuocfuppff","focofooffpfcpcupupuuooufu","uofupoocpf","opufcuffopcpcfcufpcpufuupffpp","f","opffp","fpccopc"};
//        String sentence = "fofopupoufuofffffocpocfccuofuupupcouocpocoooupcuufffufffufpccopc";
//        //fofopupoufuofffffocpocfccuofuupupcouocpocoooupc uu fffu fffu fpccopc
//        System.out.println("test---" + sentence.length());
//        System.out.println("test---" + dictionary[34]);
//        System.out.println(respace(dictionary,sentence));
//
//    }
//    public static int respace(String[] dictionary, String sentence) {
//        int count = 0;
//        int cur;//当前句子中遍历到的字母的下标
//        for(cur = 0; cur < sentence.length(); cur++){
//            int i = 0;
//            int k = 0;
//            int k_max = 0;
//            boolean flag = false;
//            int tmp_cur = 0;
//            while(i < dictionary.length){//遍历字典中的所有单词，i：当前字典中遍历到的单词的下标
//                k = 0;
//                k_max = k;
//                if(!flag){
//                    tmp_cur = cur;
//                }
//                while(k < dictionary[i].length() && tmp_cur < sentence.length()){//第一次提交少了这个判断条件（导致数组越界）： && tmp_cur < sentence.length()
//                    if(sentence.charAt(tmp_cur) == dictionary[i].charAt(k)){
//                        tmp_cur++;
//                    }
//                    else
//                        break;
//                    k++;
//                }
//                if(k == dictionary[i].length()){
//                    System.out.println("test2---" + k);
//                    flag = true;//成功从字典中找到单词
////                    break;
//                    if(k_max < k)
//                        k_max = k;
//                    k = 0;//重置
//                    tmp_cur = cur;//重置
////                    i++;
////                    continue;
//                }
//                i++;
//            }
//            if(flag){
//                System.out.println(cur +"---" + k + "---" + i);
//                cur = cur + k_max - 1;//这里减一的作用是适配cur++
//            }else{
//                System.out.println(cur +"---" + k);
//                count++;
//            }
//        }
//
//        return count;
//    }
//}
