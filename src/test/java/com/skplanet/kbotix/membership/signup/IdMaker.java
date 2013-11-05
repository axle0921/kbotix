package com.skplanet.kbotix.membership.signup;

import com.skplanet.kbotix.domain.membership.SignupService;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class IdMaker {
    public boolean isValidId(String id) {
        SignupService signupService = new SignupService();

        return signupService.isValidId(id);
    }
}
