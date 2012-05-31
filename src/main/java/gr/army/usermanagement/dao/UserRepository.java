package gr.army.usermanagement.dao;


import gr.army.usermanagement.datamodel.User;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Panagiotis Gouvas (KEPYES 28/5/2012)
 */
public interface UserRepository extends JpaRepository<User,String>{
    
    /*
     * Will produce autogenerated DAO Impl
     */
    public User findByUserId(String userid);

    public List<User> findByUserIdLike(String userid);    
    
    @Query("select count (*) from USERS u where u.userId like ?1 ")
    public long countByUserIdLike(String userid);
            
    public List<User> findByUserIdLike(String userid,Pageable page);    
        
    public User findByUserIdAndDorCode(String userid,Long dorcode);    
    
}