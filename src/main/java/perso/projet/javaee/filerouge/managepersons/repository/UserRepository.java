package perso.projet.javaee.filerouge.managepersons.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import perso.projet.javaee.filerouge.managepersons.domain.User;

import java.util.Optional;

/**
 * Created by Eddy on 07/10/2017.
 */
public interface UserRepository  extends JpaRepository<User, Long>{

    @EntityGraph(attributePaths = "roles")
    User findOneWithRolesById(Long id);

    Optional<User> findOneByEmail(String email);

    @EntityGraph(attributePaths = "roles")
    Optional<User> findOneWithRolesByEmail(String email);
}
