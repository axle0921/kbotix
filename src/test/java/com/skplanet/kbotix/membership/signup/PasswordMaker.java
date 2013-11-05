package com.skplanet.kbotix.membership.signup;

import com.skplanet.kbotix.domain.membership.SignupService;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class PasswordMaker {
    public boolean isValidPassword(String password) {
        SignupService signupService = new SignupService();

        return signupService.isValidPassword(password);
    }
}
