package org.example.tomcat7.embed;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;


public class BasicServerSetup {

    public static void main(String[] args)
            throws ServletException, LifecycleException
    {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.setBaseDir(".");
        Context rootCtx = tomcat.addContext("/", new File(".").getAbsolutePath());

        tomcat.addServlet(rootCtx, "hello", new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                    throws ServletException, IOException
            {
                resp.getWriter().write("Hello World from anonymous servlet!!");
            }
        });

        rootCtx.addServletMapping("/","hello");

        tomcat.start();
        tomcat.getServer().await();
    }
}
