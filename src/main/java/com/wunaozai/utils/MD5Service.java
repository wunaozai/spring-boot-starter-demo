package com.wunaozai.utils;

public class MD5Service {

    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
