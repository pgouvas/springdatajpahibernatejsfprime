package gr.army.usermanagement.backingbeans;

/**
 *
 * @author Panagiotis Gouvas
 */
import gr.army.usermanagement.dao.UserRepository;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name = "LoginBean")
@RequestScoped
public class LoginBean implements Serializable{
    
    protected final Log log = LogFactory.getLog(getClass());
    
    @Autowired
    private UserRepository userdao;
    
    private String username;
    private String password;
    private int usertype;
    private String text;

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void validateUser() {
        log.info("validateUser() invoked with username:"+username+" and password:"+password);
        getUserdao().findAll();
        //userdao.findByUserIdAndDorCode(username, new Long(password) );
        
        /*
        model.User user = null;
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        if ((user = cmTransactions.validateUser(username, password)) != null) {
            String userid = "" + user.getId();
            int localusertype = user.getUsertype().getId();
            System.out.println("Successfull login of user:" + userid + "with userType " + localusertype);
            session.setAttribute("userid", userid);
            this.setUsertype(localusertype);
        } else {
            session.setAttribute("usertype", "0");
            this.setUsertype(0);
        }
        */ 

    }//EoM validateUser

    public void logoutUser() {

    }

    /**
     * @return the userdao
     */
    public UserRepository getUserdao() {
        return userdao;
    }

    /**
     * @param userdao the userdao to set
     */
    public void setUserdao(UserRepository userdao) {
        this.userdao = userdao;
    }
    
}//EoC
