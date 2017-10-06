package perso.projet.javaee.filerouge.managepersons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Eddy on 06/10/2017.
 */


@SpringBootApplication
public class StarterApplication {
    private static final Logger log = LoggerFactory.getLogger(StarterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
}
