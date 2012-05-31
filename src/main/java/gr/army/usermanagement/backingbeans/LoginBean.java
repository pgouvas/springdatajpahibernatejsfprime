package gr.army.usermanagement.backingbeans;

/**
 *
 * @author Panagiotis Gouvas
 */
import gr.army.usermanagement.dao.UserRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "request")
@ManagedBean
@RequestScoped
public class LoginBean {
    
    protected final Log log = LogFactory.getLog(getClass());
    
    @Autowired
    private UserRepository userdao;
    
    private String username;
    private String password;


    public String validateUser() {
        log.info("validateUser() invoked with username:"+getUsername()+" and password:"+getPassword());
        if (userdao==null){
            System.out.println("userdao is NULL");
        } else {
            System.out.println("count: "+userdao.count());
        }        
        return "ok";
    }//EoM validateUser

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
   

}//EoClass
