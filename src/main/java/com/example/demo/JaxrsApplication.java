package com.example.demo;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author shi.jiake
 * @time 2018/2/2 11:16
 */
@Component
@ApplicationPath("/sample-app/")
public class JaxrsApplication extends Application {
}
