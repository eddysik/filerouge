package perso.projet.javaee.filerouge.managepersons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perso.projet.javaee.filerouge.managepersons.domain.Role;

/**
 * Created by Eddy on 08/10/2017.
 */


public interface RoleRepository extends JpaRepository<Role, String>{
}
