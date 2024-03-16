package fr.swynn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.swynn.model.User;

@Controller
public class LoginController {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    @GetMapping("/")
    public ModelAndView login() {
        final var mav = new ModelAndView("login");
        mav.addObject("user", new User());
        return mav;
    }

    @PostMapping("/connection")
    public String connection(final User user) {
        if (isValidUser(user)) {
            return "success";
        }
        return "login";
    }

    /**
     * Check if the user is valid.
     * 
     * @param user the user to check
     * @return true if the user is valid, false otherwise
     */
    private boolean isValidUser(final User user) {
        if (!isExist(user)) {
            return false;
        }

        return user.getEmail().matches(EMAIL_REGEX);
    }

    /**
     * Check if the user is in the database.
     * 
     * @param user the user to check
     * @return true if the user exist, false otherwise
     */
    private boolean isExist(final User user) {
        final var email = "test@mail.com";
        final var password = "testPassword";

        return email.equals(user.getEmail()) && password.equals(user.getPassword());
    }

}
