package io.henriqueceleste.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class MainController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String home() {
        return "redirect:/books";
    }
}
