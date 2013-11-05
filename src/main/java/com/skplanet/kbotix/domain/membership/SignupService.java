package com.skplanet.kbotix.domain.membership;

import com.skplanet.kbotix.infrastructure.SimpleStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    public boolean isValidId(String inputId) {
        boolean isNotAllowedEnglishNumberOnly = !SimpleStringUtils.isAllowedEnglishNumberOnly(inputId);
        boolean isLessLengthId = SimpleStringUtils.getLength(inputId) < 6;
        boolean isNotEnglishFirstLetter = !SimpleStringUtils.isEnglishFirstLetter(inputId);
        boolean isNotLowerCase = !SimpleStringUtils.isLowerCase(inputId);

        return (isNotAllowedEnglishNumberOnly || isLessLengthId || isNotEnglishFirstLetter || isNotLowerCase) ? false : true;
    }

    public boolean isValidPassword(String inputPassword) {
        boolean isNotMixedEnglishNumberOnly = !SimpleStringUtils.isMixedEnglishNumberOnly(inputPassword);
        boolean isLessLengthPassword = SimpleStringUtils.getLength(inputPassword) < 8;
        boolean isNotEnglishFirstLetter = !SimpleStringUtils.isEnglishFirstLetter(inputPassword);

        return (isNotMixedEnglishNumberOnly || isLessLengthPassword || isNotEnglishFirstLetter) ? false : true;
    }

    public boolean isValidNickname(String inputNickname) {
        boolean isNotAllowedKoreanEnglishNumberOnly = !SimpleStringUtils.isAllowedKoreanEnglishNumberOnly(inputNickname);
        boolean isLessLengthNickname = SimpleStringUtils.getLength(inputNickname) < 2;


        return (isNotAllowedKoreanEnglishNumberOnly || isLessLengthNickname) ? false : true;
    }
}