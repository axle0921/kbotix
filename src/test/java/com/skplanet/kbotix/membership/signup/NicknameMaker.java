package com.skplanet.kbotix.membership.signup;

import com.skplanet.kbotix.domain.membership.SignupService;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class NicknameMaker {
    public boolean isValidNickname(String nickname) {
        SignupService signupService = new SignupService();

        return signupService.isValidNickname(nickname);
    }
}