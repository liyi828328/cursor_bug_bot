package org.example;

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
        if (tel.equals("13800138000")) {
            int a = 100/0;
            System.out.println(a);
        } else {
            System.out.println("tel is not 13800138000");
        }
    }
}