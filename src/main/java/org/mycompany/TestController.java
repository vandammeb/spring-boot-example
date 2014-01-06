package org.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DataSource dataSource;

    public TestController() {
    }

}
