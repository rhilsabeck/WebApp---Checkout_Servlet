

package Servlets;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Ryan
 */
public class WebListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) 
    {
      Map<String,Double> breadMap = new HashMap<>();
      String [] keys = {"Rye", "White", "Wheat", "Pumpernickle"};
      Double[] prices = {2.75, 1.50, 2.70, 1.00};
      for(int k =0; k < keys.length;k++)
      {
          breadMap.put(keys[k],prices[k]);
      }
      
      ServletContext sc = sce.getServletContext();
      sc.setAttribute("MyBreadMap", breadMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
