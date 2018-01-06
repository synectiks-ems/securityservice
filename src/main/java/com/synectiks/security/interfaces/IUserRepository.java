/**
 * 
 */
package com.synectiks.security.interfaces;

import com.synectiks.security.entities.User;

/**
 * @author Rajesh
 */
public interface IUserRepository {

	User findById(String id);
	User findByUsername(String username);
}
