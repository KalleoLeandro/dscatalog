/**
 * 
 */
package com.kalleo.dscatalog.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kalleo
 *
 */
public class ValidationError extends StandardError {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<FieldMessage>();

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName,message));
	}
}
