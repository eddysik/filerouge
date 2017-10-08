package perso.projet.javaee.filerouge.managepersons.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import perso.projet.javaee.filerouge.managepersons.domain.Role;
import perso.projet.javaee.filerouge.managepersons.domain.User;
import perso.projet.javaee.filerouge.managepersons.repository.RoleRepository;
import perso.projet.javaee.filerouge.managepersons.repository.UserRepository;
import perso.projet.javaee.filerouge.managepersons.security.RolesConstants;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eddy on 08/10/2017.
 */

@Controller
public class Test {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public Test(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void save(){
        User user = new User();
        user.setEmail("sikubwabo.eddy@gmail.com");
        user.setFirstName("Sikubwabo");
        user.setLastName("Eddy");
        user.setPassword("test");
        user.setActivated(true);
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setName(RolesConstants.USER);
        roles.add(role);
        user.setRoles(roles);
        roleRepository.save(role);
        userRepository.save(user);
    }
}
