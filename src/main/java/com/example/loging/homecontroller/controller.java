package com.example.loging.homecontroller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/home")
public class controller {

private Logger logger = LoggerFactory.getLogger(controller.class);

    @GetMapping
    public String Home(
            @RequestParam(defaultValue = "defailt value ",required = false) String value
    ){


//        System.out.println("home controller");
        logger.info("This is info calling {}",value);
        logger.warn("This is warn calling{}",value);
        logger.trace("This is trace calling");
        logger.error("This is error calling");
        logger.debug("This is debug calling");
        return "this is my API";
    }



}
