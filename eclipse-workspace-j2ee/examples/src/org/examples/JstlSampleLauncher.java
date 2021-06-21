package org.examples;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JstlSampleLauncher {

    public static void main(String[] args) throws Exception {

        String weppAppHome = args[0];
        Integer port = 8080;

        Server server = new Server(port);

        WebAppContext webapp = new WebAppContext();
        webapp.setWar("/path/to/webapp.war");
     // Configure the contextPath.
        webapp.setContextPath("/app");

     // Link the context to the server.
        server.setHandler(webapp);

        webapp.start();

    }

}