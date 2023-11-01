package com.springcore.springjdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String path = "src/main/java/com/springcore/springjdbc/config.xml";
        AbstractApplicationContext context = new FileSystemXmlApplicationContext(path);
        JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);

        String query="Select count(*) from student";

         Integer inte = jdbcTemplate.queryForObject(query, Integer.class);
        System.out.println(inte);

    }
}
