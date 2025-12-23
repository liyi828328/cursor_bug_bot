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
    }
}