package kbotix.회원.회원가입;

import com.skplanet.kbotix.domain.membership.SignupService;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class 아이디 {
    public boolean isValidId(String id) {
        SignupService signupService = new SignupService();

        return signupService.isValidId(id);
    }
}

