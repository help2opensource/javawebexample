package jettyServer.jettyserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyMoreServers {

       public static void main(String[] args) throws Exception {
              Server server = new Server(8080);
              ContextHandlerCollection contexts = new ContextHandlerCollection();

              // Get the root directory of the project
              String relativelyPath = System.getProperty("user.dir");

              System.out.println(relativelyPath);

              // Add the first web project, the name is manager
              WebAppContext context = new WebAppContext();
              context.setContextPath("/hello1");
              context.setDescriptor(relativelyPath + "/jetty/webapps/manager/WEB-INF/web.xml");
              context.setResourceBase(relativelyPath + "/jetty/webapps/manager");
              context.setParentLoaderPriority(true);

              // Use the context list, add multiple contexts, that is, multiple web projects
              contexts.addHandler(context);

              // Add a second web project, the name is manager
              WebAppContext context2 = new WebAppContext();
              context2.setContextPath("/myweb");
              context2.setDescriptor(relativelyPath + "/jetty/webapps/myweb/WEB-INF/web.xml");
              context2.setResourceBase(relativelyPath + "/jetty/webapps/myweb");
              context2.setParentLoaderPriority(true);
              // Use the context list, add multiple contexts, that is, multiple web projects
              contexts.addHandler(context2);

              server.setHandler(contexts);

              server.start();
              server.join();
       }

}

// https://examples.javacodegeeks.com/enterprise-java/jetty/jetty-jsp-example/