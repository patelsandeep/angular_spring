
package com.angularspringdemo.dao;

import com.angularspringdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author shruti
 */
public interface UserDao extends JpaRepository<User, Long>{
   
}
