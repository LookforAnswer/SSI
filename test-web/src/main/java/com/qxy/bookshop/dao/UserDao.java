package com.qxy.bookshop.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;

import com.qxy.bookshop.model.User;

@Component
public class UserDao extends BaseDao {
	
	
	//添加操作  
    public void insertUser(User user) {  
        // TODO Auto-generated method stub  
        this.getSqlMapClientTemplate().insert("insertUser",user);  
    }  
      
    //删除操作  
	public void deleteById(String id) {  
        // TODO Auto-generated method stub  
		this.getSqlMapClientTemplate().delete("deleteById", id);  
    }  
  
    //查询全部  
    public List<User> queryAllUser() {  
        // TODO Auto-generated method stub  
        List<User> Users = this.getSqlMapClientTemplate().queryForList("user.queryAllUser");  
        return Users;  
    }  
  
    public User queryById(int id) {  
        // TODO Auto-generated method stub  
                    //自己添加实现代码  
	    return null;  
	}  
	  
	public boolean updateUser(User user) {  
	    // TODO Auto-generated method stub  
		//自己添加实现代码  
	    return false;  
	}  
}
