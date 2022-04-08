package seventh_package;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        /*
       Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */
        String str="cncjnlscjc";
        List<String> str_list=new ArrayList<>();
       //str_list.add(str.split(str));

        for (int i = 0; i <str_list.size(); i++) {
            for (int j = 1; j <str_list.size() ; j++) {
                if (str_list.get(i).equals(str_list.get(j))){
                System.out.println(str_list.get(j));
            }

            }


        }
    }
}
