package com.spring.social.util;

public class JwtProperties {
    public static final String SECRET = "Chungbi";
    public static final int EXPIRATION_TIME = 864_000_000; // 10 ngày
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}