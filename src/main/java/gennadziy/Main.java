package gennadziy;

import gennadziy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;

@PropertySource(value = "classpath:log4j.properties")
public class Main {
//    private static final Logger logger = LoggerFactory.getLogger(Main.class);
//    private static final String FILENAME = "C:\\data.txt";
//    public static void main(String[] args) throws SQLException {



//        UserService userService = new UserService();
//        User user = new User("Masha456",26);
////        userService.saveUser(user);
////        Auto ferrari = new Auto("Ferrari8", "red");
////        ferrari.setUser(user);
////        user.addAuto(ferrari);
////        Auto ford = new Auto("Ford8", "black");
////        ford.setUser(user);
////        user.addAuto(ford);
////        userService.updateUser(user);
//        logger.info ( "{JJFSDHJFJDSJFJDFNJDNFJDNJFDNJFNDKJFNJ");
//        logger.debug ( "свыавыаыв"+userService.findAllUsers ().toString () );
//        try {
//            Files.readAllBytes(Paths.get(FILENAME));
//        } catch (IOException ioex) {
//            logger.error("Failed to read file {}.", FILENAME, ioex);
//        }
//        System.out.println (userService.findAllUsers ().toString ());
//    }
}