package com.skplanet.kbotix.domain.membership;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SignupServiceTest {
    private SignupService sut;

    @Test
    public void 영문숫자_소문자_회원아이디_유효성_검증한다() {
        // given
        String someId = "abcdefg1";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidId(someId);

        // then
        assertThat(actualResult, is(true));
    }

    @Test
    public void 영문숫자_대문자_회원아이디_유효성_검증한다() {
        // given
        String someId = "abcdeFG1";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidId(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 숫자영문_소문자_회원아이디_유효성_검증한다() {
        // given
        String someId = "1abcdefg";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidId(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 영문숫자_6자미만_회원아이디_유효성_검증한다() {
        // given
        String someId = "abcd1";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidId(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 영문숫자_대소문자_회원비밀번호_유효성_검증한다() {
        // given
        String someId = "abcdeFG1";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidPassword(someId);

        // then
        assertThat(actualResult, is(true));
    }

    @Test
    public void 영문_대소문자_회원비밀번호_유효성_검증한다() {
        // given
        String someId = "abcdeFGHI";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidPassword(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 숫자_대소문자_회원비밀번호_유효성_검증한다() {
        // given
        String someId = "12345678";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidPassword(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 영문숫자_대소문자_8자미만_회원비밀번호_유효성_검증한다() {
        // given
        String someId = "bcdeFG1";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidPassword(someId);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 영문숫자한글_닉네임_유효성_검증한다() {
        // given
        String someNickname = "abcdeFG1한글";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidNickname(someNickname);

        // then
        assertThat(actualResult, is(true));
    }

    @Test
    public void 영문숫자한글기호_닉네임_유효성_검증한다() {
        // given
        String someNickname = "abcdeFG1#한글";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidNickname(someNickname);

        // then
        assertThat(actualResult, is(false));
    }

    @Test
    public void 영문숫자한글특수문자_닉네임_유효성_검증한다() {
        // given
        String someNickname = "abcd한글EFG1★";
        sut = new SignupService();

        // when
        boolean actualResult = sut.isValidNickname(someNickname);

        // then
        assertThat(actualResult, is(false));
    }
}
