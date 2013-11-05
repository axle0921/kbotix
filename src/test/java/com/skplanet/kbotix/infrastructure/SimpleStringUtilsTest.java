package com.skplanet.kbotix.infrastructure;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleStringUtilsTest {
    @Test
    public void 영어숫자_포함한_영어숫자혼합_유효성_검증() {
        String someInputString = "abc1d";

        boolean actualResult = SimpleStringUtils.isMixedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(true));
    }

    @Test
    public void 영어만_포함한_영어숫자혼합_유효성_검증() {
        String someInputString = "abcd";

        boolean actualResult = SimpleStringUtils.isMixedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 숫자만_포함한_영어숫자혼합_유효성_검증() {
        String someInputString = "1234";

        boolean actualResult = SimpleStringUtils.isMixedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 특수문자와_한글을_포함한_영어숫자혼합_유효성_검증() {
        String someInputString = "abcd한글EFG김철수ㅋㅋ12$#%";

        boolean actualResult = SimpleStringUtils.isMixedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 특수문자와_한글을_포함한_영어숫자_유효성_검증() {
        String someInputString = "abcd한글EFG김철수ㅋㅋ12$#%";

        boolean actualResult = SimpleStringUtils.isAllowedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 특수문자와_기호를_포함한_영어숫자_유효성_검증() {
        String someInputString = "abcdEFG12$#% ★";

        boolean actualResult = SimpleStringUtils.isAllowedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 영어와_숫자만_포함한_영어숫자_유효성_검증() {
        String someInputString = "abcd12";

        boolean actualResult = SimpleStringUtils.isAllowedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(true));
    }

    @Test
    public void 숫자만_포함한_영어숫자_유효성_검증() {
        String someInputString = "123456";

        boolean actualResult = SimpleStringUtils.isAllowedEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(true));
    }

    @Test
    public void 특수문자와_기호를_포함한_한영숫자_유효성_검증() {
        String someInputString = "abcdEFG한글12$#% ★";

        boolean actualResult = SimpleStringUtils.isAllowedKoreanEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 영어와_숫자만_포함한_한영숫자_유효성_검증() {
        String someInputString = "abcd12";

        boolean actualResult = SimpleStringUtils.isAllowedKoreanEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(true));
    }

    @Test
    public void 영어와_한글_숫자를_포함한_한영숫자_유효성_검증() {
        String someInputString = "abcd한글12";

        boolean actualResult = SimpleStringUtils.isAllowedKoreanEnglishNumberOnly(someInputString);

        assertThat(actualResult, is(true));
    }

    @Test
    public void 첫글자_숫자인경우_첫글자_영어_유효성_검증() {
        String someInputString = "1abcd";

        boolean actualResult = SimpleStringUtils.isEnglishFirstLetter(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 첫글자_한글인경우_첫글자_영어_유효성_검증() {
        String someInputString = "한abcd";

        boolean actualResult = SimpleStringUtils.isEnglishFirstLetter(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 첫글자_특수문자인경우_첫글자_영어_유효성_검증() {
        String someInputString = "★한abcd";

        boolean actualResult = SimpleStringUtils.isEnglishFirstLetter(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 글자수를_반환한다() {
        String someInputString = "abcdEFG한글12$#%★";

        int actualResult = SimpleStringUtils.getLength(someInputString);

        assertThat(actualResult, is(15));
    }

    @Test
    public void 대문자가_포함된경우_소문자_유효성_검증() {
        String someInputString = "abcdEFG1234";

        boolean actualResult = SimpleStringUtils.isLowerCase(someInputString);

        assertThat(actualResult, is(false));
    }

    @Test
    public void 소문자인경우_소문자_유효성_검증() {
        String someInputString = "abcdefg1234";

        boolean actualResult = SimpleStringUtils.isLowerCase(someInputString);

        assertThat(actualResult, is(true));
    }
}
