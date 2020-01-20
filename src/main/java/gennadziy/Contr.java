package gennadziy;

import gennadziy.models.User;
import gennadziy.service.UserService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
@PropertySource(value = "classpath:log4j.properties")

public class Contr {
    private static final Logger logger = LoggerFactory.getLogger(Contr.class);
    private static final String FILENAME = "C:\\data.txt";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView name(ModelAndView modelAndView,UserService userService){
    logger.info ( "{JJFSDHJFJDSJFJDFNJDNFJDNJFDNJFNDKJFNJ");
    logger.debug ( "свыавыаыв"+userService.findAllUsers ().toString () );
        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException ioex) {
            logger.error("Failed to read file {}.", FILENAME, ioex);
        }
    List<User> users=userService.findAllUsers ();
    modelAndView.setViewName ("index");
    System.out.println (users.toString ());

    modelAndView.addObject ( "users",users );
    return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") int id, UserService userService) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        User user = userService.findUser ( id );
        userService.deleteUser ( user );
        return modelAndView;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addKlient(@ModelAttribute("user") User user, UserService userService) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        userService.saveUser (user);
        return modelAndView;
    }


}

