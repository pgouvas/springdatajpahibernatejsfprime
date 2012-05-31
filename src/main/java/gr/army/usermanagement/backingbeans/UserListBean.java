package gr.army.usermanagement.backingbeans;

import gr.army.usermanagement.dao.UserRepository;
import gr.army.usermanagement.datamodel.User;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.LazyDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Panagiotis Gouvas
 * 
 */
@Component
@Scope(value = "request")
@ManagedBean
@RequestScoped
public class UserListBean implements Serializable{

    private User selectedItem;
    
    //---LAZY APPROACH 
    @Autowired
    private LazyUserDataModel allItems;  
    
    //---EAGER APPROACH
    /*
    @Autowired
    private UserRepository userdao;  
    private List<User> allItems;  
    */ 


    
    /**
     * @return the selectedItem
     */
    public User getSelectedItem() {
        return selectedItem;
    }

    /**
     * @param selectedItem the selectedItem to set
     */
    public void setSelectedItem(User selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    /*   EAGER APPROACH
    public List<User> getAllItems() {
        allItems = userdao.findAll();
        return allItems;
    }

    public void setAllItems(List<User> allItems) {
        
        this.allItems = allItems;
    }
    */
       
    /*   LAZY APPROACH  */ 
    public LazyUserDataModel getAllItems() {
        return allItems;
    }
    public void setAllItems(LazyUserDataModel allItems) {
        this.allItems = allItems;
    }
    
        
}//EoC
