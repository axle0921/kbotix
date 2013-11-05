package com.skplanet.kbotix.infrastructure;

import org.apache.commons.lang.StringUtils;


public class SimpleStringUtils {
    public static boolean isMixedEnglishNumberOnly(String inputString) {
        if (StringUtils.isBlank(inputString)) {
            return false;
        }

        //char[] inputCharArray = inputString.replaceAll("\\p{Space}", "").toCharArray();
        char[] inputCharArray = inputString.toCharArray();

        int alphaCount = 0;
        int numericCount = 0;

        for (int j = 0; j < inputCharArray.length; j++) {
            if (inputCharArray[j] >= 'A' && inputCharArray[j] <= 'z') {
                alphaCount++;
            }

            if (inputCharArray[j] >= '0' && inputCharArray[j] <= '9') {
                numericCount++;
            }
        }

        if (!(alphaCount > 0 && numericCount > 0 && StringUtils.isAlphanumeric(inputString))) {
            return false;
        }

        return true;
    }

    public static boolean isAllowedEnglishNumberOnly(String inputString) {
        return StringUtils.isAlphanumeric(inputString);
    }

    public static boolean isAllowedKoreanEnglishNumberOnly(String inputString) {
        if (StringUtils.isBlank(inputString)) {
            return false;
        }

        char[] inputCharArray = inputString.toCharArray();

        for (int j = 0; j < inputCharArray.length; j++) {
            if (!(inputCharArray[j] >= '가' && inputCharArray[j] <= '힣' || inputCharArray[j] >= 'A' && inputCharArray[j] <= 'z' || inputCharArray[j] >= '0' && inputCharArray[j] <= '9')) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEnglishFirstLetter(String inputString) {
        if (StringUtils.isBlank(inputString)) {
            return false;
        }

        char[] inputCharArray = inputString.toCharArray();

        if (!(inputCharArray[0] >= 'A' && inputCharArray[0] <= 'z')) {
            return false;
        }

        return true;
    }

    public static int getLength(String inputString) {
        return StringUtils.length(inputString);
    }

    public static boolean isLowerCase(String inputString) {
        if (StringUtils.isBlank(inputString)) {
            return false;
        }

        char[] inputCharArray = inputString.toCharArray();

        for (int j = 0; j < inputCharArray.length; j++) {
            if (inputCharArray[j] >= 'A' && inputCharArray[j] <= 'Z') {
                return false;
            }
        }

        return true;
    }
}
