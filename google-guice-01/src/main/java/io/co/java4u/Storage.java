/**
 * 
 */
package io.co.java4u;

/**
 * @author karthik
 *
 */
public interface Storage {
	public void store(String uniqueId, String data);

	public String retrieve(String uniqueId);
}
