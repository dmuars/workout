package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mysql.Customer;

public class CustomerDAO {
    
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession        session;
    
    protected List<Customer> getCustomerPaymentList( Customer customer ) {
        sqlSessionFactory = MyBatisSqlSessionFactory.getInstance();
        session = sqlSessionFactory.openSession();
        List<Customer> customerList = session.selectList( "mybatis.sakila.getCustomerPaymentList", customer );
        session.close();
        
        return customerList;
    }
}
