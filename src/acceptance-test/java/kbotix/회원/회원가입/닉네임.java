package kbotix.회원.회원가입;

import com.skplanet.kbotix.domain.membership.SignupService;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class 닉네임 {
    public boolean isValidNickname(String nickname) {
        SignupService signupService = new SignupService();

        return signupService.isValidNickname(nickname);
    }
}
