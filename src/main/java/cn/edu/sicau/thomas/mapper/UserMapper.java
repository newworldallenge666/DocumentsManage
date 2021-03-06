/**
 * 
 */
package cn.edu.sicau.thomas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.sicau.thomas.pojo.User;

/**
 * @author lenovo
 *
 */
public interface UserMapper {
	//查找用户（按用户名和密码）
	User findUserByNameAndPassword(@Param("userName") String userName, @Param("password")String password);
	//添加用户
	int insertUser(User user);
	//根据用户名查询
	User getUserByUserName(String userName);
	
	
}
