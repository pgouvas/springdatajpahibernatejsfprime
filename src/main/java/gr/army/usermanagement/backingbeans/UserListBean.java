package gr.army.usermanagement.backingbeans;

import gr.army.usermanagement.dao.UserRepository;
import gr.army.usermanagement.datamodel.User;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
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
@Scope(value = "session")
@ManagedBean
@SessionScoped
public class UserListBean implements Serializable{

    private User selectedItem;
    
    
    private User newuser = new User();
        
    @Autowired
    private UserRepository userdao;  
    
    @Autowired
    private LazyUserDataModel allItems;  
    
    //---Listeners
    public void onRowSelect(){
        System.out.println(" onRowSelect: "+selectedItem);
    }

    public void resetNewUser(){
        System.out.println("resetNewUser invoked() ");
        newuser = new User();
    }
    
    public void addUser(){ 
        System.out.println("addUser invoked() ");
        userdao.save(newuser);
    }    
    
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
        System.out.println("Row selected: "+selectedItem );
        this.selectedItem = selectedItem;
    }

    /*   LAZY APPROACH  */ 
    public LazyUserDataModel getAllItems() {
        return allItems;
    }
    public void setAllItems(LazyUserDataModel allItems) {
        this.allItems = allItems;
    }

    /**
     * @return the newuser
     */
    public User getNewuser() {
        return newuser;
    }

    /**
     * @param newuser the newuser to set
     */
    public void setNewuser(User newuser) {
        this.newuser = newuser;
    }

 

          
}//EoC
