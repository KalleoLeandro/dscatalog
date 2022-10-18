/**
 * 
 */
package com.kalleo.dscatalog.dto;

import java.io.Serializable;

import com.kalleo.dscatalog.services.validation.UserInsertValid;
import com.kalleo.dscatalog.services.validation.UserUpdateValid;

/**
 * @author Kalleo
 *
 */

@UserUpdateValid
public class UserUpdateDTO extends UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
