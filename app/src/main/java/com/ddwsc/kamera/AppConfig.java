package com.ddwsc.kamera;

public class AppConfig {

    public static final String API_URL = "https://apis.argear.io";
    public static final String API_KEY = "95bf966ca9377d2ee525ecc6";
    public static final String SECRET_KEY = "422df8b144d1b1c6d79e78872dd286e205dec2cd0a84b9b5e2fb4e1b70ad4284";
    public static final String AUTH_KEY = "U2FsdGVkX1+q3rD9NQrvMIpNMUSS7D/43tifEOaz+NdGuRFCpvVch4t1WEphwUr+kqVser3uWY5JkpdIbbAvew==";

    // preference
    public static final String USER_PREF_NAME = BuildConfig.APPLICATION_ID + ".Preference";
    public static final String USER_PREF_NAME_FILTER = BuildConfig.APPLICATION_ID + ".ARGearFilter.Preference";
    public static final String USER_PREF_NAME_STICKER = BuildConfig.APPLICATION_ID + ".ARGearItem.Preference";

    // camera
    // 1: CAMERA_API_1, 2: CAMERA_API_2
    public static final int USE_CAMERA_API = 1;

    // region - beauty sample
    public static final float[] BEAUTY_TYPE_INIT_VALUE = {
            0,     //VLINE
            0,     //ACE_SLIM
            0,     //JAW
            0,    //CHIN
            0,      //EYE
            0,    //EYE_GAP
            0,      //NOSE_LINE
            0,     //NOSE_SIDE
            0,     //NOSE_LENGTH
            0,    //MOUTH_SIZE
            0,      //EYE_BACK
            0,      //EYE_CORNER
            0,      //LIP_SIZE
            0,     //SKIN
            0,      //DARK_CIRCLE
            0,      //MOUTH_WRINKLE
    };

    public static final float[] BASIC_BEAUTY_1 = {
            20, 10, 45, 45, 5, -10, 40, 20, 15, 0, 0, 0, 0, 50, 0, 0
    };

    public static final float[] BASIC_BEAUTY_2 = {
            10, 90, 55, -50, 5, -10, 0, 35, 30, -35, 0, 0, 0, 50, 0, 0
    };

    public static final float[] BASIC_BEAUTY_3 = {
            25, 20, 50, -25, 25, -10, 30, 40, 90, 0, 0, 0, 0, 50, 0, 0
    };
    // endregion
}
