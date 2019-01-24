package com.wunaozai.utils;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MD5AutoConfiguration {

    MD5Service md5Service() {
        return new MD5Service();
    }
}
