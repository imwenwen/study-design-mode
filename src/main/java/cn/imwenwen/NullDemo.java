package cn.imwenwen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class NullDemo {

    public static void main(String[] args) {

        String s1 ="";
        String s2 ="123*";
        if (s1 == null ? s2 == null : s1.equals(s2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }

}
