/**
 * 
 */
package com.kalleo.dscatalog.dto;

import java.io.Serializable;
import java.util.Objects;

import com.kalleo.dscatalog.entities.Role;

/**
 * @author Kalleo
 *
 */
public class RoleDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authority;
	
	public RoleDTO() {
		
	}

	public RoleDTO(Long id, String authority) {		
		this.id = id;
		this.authority = authority;
	}
	
	public RoleDTO(Role entity) {
		id = entity.getId();
		authority = entity.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleDTO other = (RoleDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	

}