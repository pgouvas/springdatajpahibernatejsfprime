package gr.army.usermanagement.backingbeans;

import gr.army.usermanagement.dao.UserRepository;
import gr.army.usermanagement.datamodel.User;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Iterator;  
import java.util.List;  
import java.util.Map;  
import org.primefaces.model.LazyDataModel;  
import org.primefaces.model.SortOrder;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
  
/** 
 * @author Panagiotis Gouvas 
 * Implementation of UserDataModel  
 */  
@Component
@Scope(value = "request")
public class LazyUserDataModel extends LazyDataModel<User> {  
    
    @Autowired
    private UserRepository userdao;        
      
    @Override  
    public User getRowData(String rowKey) {    
        return userdao.findByUserId(rowKey);  
    }  
  
    @Override  
    public Object getRowKey(User user) {  
        return user.getUserId();  
    }  
  
    @Override  
    public List<User> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,String> filters) {   
        List<User> data=null;
        int totalcount=0;
        int page = first / pageSize;
        System.out.println ( "LazyUserDataModel.load() first:"+first+" pagesize:"+pageSize +" --> page:"+page );
                
        //Filters
        System.out.println("filetrs: "+filters);
        if ( filters.containsKey("userId") && filters.containsKey("dorCode") ) {
            
        } else
        if (filters.containsKey("userId") ) {
            
        } else
        if (filters.containsKey("dorCode") ) {
            
        } else {
            data = userdao.findAll(new PageRequest(page, pageSize)).getContent(); 
            totalcount = userdao.findAll().size();
        }
        
        //Set The Raw count for repagination
        setRowCount(totalcount);  
        
        System.out.println ( "Query Returned size:"+data.size() );
        
        return data;
    }//EoM  
    
}//EoClass  