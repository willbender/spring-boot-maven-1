package com.twenty3.sbmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller handles HTTP GET requests for greeting messages.
 * It provides an endpoint to greet a user with their name and location.
 */
@RestController
public class WebServiceController {

    /**
     * Handles HTTP GET requests to greet a user with their name and location.
     *
     * @param name the name of the user to greet
     * @param locationname the name of the location from which the greeting is sent
     * @return a greeting message in the format "Hello from {locationname} dear {name}"
     */
    @GetMapping("/hello/{name}/{locationname}")
    public String sayHello(@PathVariable String name, @PathVariable String locationname) {
        return "Hello from " + locationname + " dear " + name;
    }
}