package org.example;

import java.util.Arrays;
import java.util.List;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * ---------------------------------------------------------------
 *
 * @author: LiYi
 * Email: yi.li@yulore.com
 * Create: 2025/12/23 17:31
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 2025/12/23 17:31 : Create by LiYi
 * ---------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String tel = "13800138000";
        System.out.println(DigestUtil.md5Hex(tel));

        List<String> list = Arrays.asList("13800138000", "13800138001", "13800138002");
        for (String s : list) {
            System.out.println(DigestUtil.md5Hex(s));
            if (s.equals("13800138000")) {
                int a = 100/0;
                System.out.println(a);
            }
        }
        System.out.println("end");
    }
}