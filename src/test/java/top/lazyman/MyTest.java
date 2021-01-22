package top.lazyman;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lazyBoy
 * @Date: 2020/12/30 15:49
 */
public class MyTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Collections.reverse(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
