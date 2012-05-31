package gr.army.usermanagement.test;

import gr.army.usermanagement.dao.UserRepository;
import gr.army.usermanagement.datamodel.User;
import java.util.List;
import java.util.Random;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Panagiotis Gouvas ( KEPYES 29/5/2012 )
 * Please note that in @ContextConfiguration the file: notation is used instead of the class:
 */
//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:**/WEB-INF/applicationContext.xml"})
public class genericTest {
    
    protected final Log log = LogFactory.getLog(getClass());
    
    
    @Autowired
    UserRepository userdao;        
    
    @Ignore
    @Test
    public void testWiring(){
        Assert.assertNotNull(userdao);
    }
    
    //@Ignore
    @Test
    public void testPaging(){
        Page<User> upage = userdao.findAll(new PageRequest(5, 15, Sort.Direction.ASC,"userId"));
        System.out.println(upage.getContent());        
        //userdao.count();
        //List <User> users = userdao.findByUserIdLike("%1%");        
        //System.out.println("users: "+users.size());
        //
        //List <User> users = userdao.findByUserIdLike("%1%", new PageRequest(0, 2));        
        
        //long ucount = userdao.countByUserIdLike("%1%"); 
        //System.out.println( "users: "+ucount );        
        
        
        //userdao.findAll().size();
        
    }    
    
    @Ignore
    @Test
    @Transactional
    public void addUser(){
        Random rand = new Random();
        Long long1 = rand.nextLong();
        User newuser = new User(""+long1);
        newuser.setDorCode(long1+1);
        newuser.setMipCode(long1+2);
        userdao.save(newuser);
        //log.info( " newuser:"+newuser );  
    }
    
    @Ignore
    @Test
    public void testMain(){
        try{
            Random rand = new Random();
            for (int i=0;i<20;i++){
                Long long1 = rand.nextLong();
                String str = ""+long1;
                str = str.substring(3);
                User user = new User(str);                
                user.setDorCode(long1);
                userdao.save(user);
            }
            //User newuser = new User("test123");
            //userdao.save(newuser);
            //log.info( " newuser:"+newuser );  
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }    
    
    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
        
}
