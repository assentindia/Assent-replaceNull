/**
 * 
 */
package com.assent.replacenull;

/**
 * This java file provides a method for replacing null reference to avoid null pointer exception. <br>
 * <p>
 * Creation Date : <br> 15-aug-2018
 * Modification Date : <br>
 * Modifyed by: <br>
 * Reason for modification:
 * <p>
 * 
 * @author Gaurav Shrivastava
 * @version 1.0
 */
public class Validator 
{
	/**
	 * Utility method to replace null values with other Object. <br>
	 * Replace the value of first parameter with value of second parameter. <br>
	 * if first parameter is null and returns the not null value of either
	 * parameters
	 * 
	 * @return a not null object value
	 * @param obj
	 *            the first parameter for null test
	 * @param constructor
	 *            the second parameter for value replacement
	 */
	public static <T extends Object> T replaceNull(T obj,T constructor)
	{
		if(obj==null)
		{
			return constructor;
		}
		else
		{
			return obj;
		}
	}
}
