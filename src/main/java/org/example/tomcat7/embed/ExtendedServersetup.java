package org.example.tomcat7.embed;

import java.io.File;
import org.apache.catalina.startup.Tomcat;

public class ExtendedServersetup {

    public static void main(String[] args) throws Exception
    {
        String webappDirLocation = "src/main/webapp/";

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
