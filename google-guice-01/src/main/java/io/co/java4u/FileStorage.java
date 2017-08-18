/**
 * 
 */
package io.co.java4u;

/**
 * @author karthik
 *
 */
public class FileStorage implements Storage {
	public FileStorage() {
	}

	public void store(String uniqueId, String data) {
		System.out.println("File Storage -> store()");
	}

	public String retrieve(String uniqueId) {
		System.out.println("File Storage -> retrieve()");
		return null;
	}

}
