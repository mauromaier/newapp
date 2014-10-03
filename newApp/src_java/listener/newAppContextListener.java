package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * Application Lifecycle Listener implementation class projetoFlexContextListener
 *
 */
public class newAppContextListener implements ServletContextListener {


    public newAppContextListener() {
        
    }

    public void contextInitialized(ServletContextEvent arg0) {
    	//new BaseController();
   
    }

    public void contextDestroyed(ServletContextEvent arg0) {
       
    }
	
}
