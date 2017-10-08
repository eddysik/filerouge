package perso.projet.javaee.filerouge.managepersons.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by Eddy on 08/10/2017.
 */
public class UserNotActivatedException extends AuthenticationException {
    public UserNotActivatedException(String s) {
        super(s);
    }
}
