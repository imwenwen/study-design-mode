package cn.imwenwen;

/**
 * @author: Imwenwen
 * @description: TODO
 * @date: 2022/11/26 14:44
 * @version: 1.0
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        //StringBuffer sb = new StringBuffer("hello\nworld");
        StringBuffer sb = new StringBuffer();
        sb.append("eeeeeee").append("3333");
        sb.append("hello\n");
        sb.append("world");

// String another = "world";

        System.out.println(sb.toString());

// System.out.println(another);

    }
}
