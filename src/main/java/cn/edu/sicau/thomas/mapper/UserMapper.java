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
	//�����û������û��������룩
	User findUserByNameAndPassword(@Param("userName") String userName, @Param("password")String password);
	//�����û�
	int insertUser(User user);
	//�����û�����ѯ
	User getUserByUserName(String userName);
	//����С������
	List<String> getGroupName();
}