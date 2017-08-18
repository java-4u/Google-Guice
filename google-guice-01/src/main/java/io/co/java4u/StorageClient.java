package io.co.java4u;

public class StorageClient {

	public static void main(String[] args) {
		// the Client module has to manually create instances to the actual
		// implementation classes

		// Making use of file storage.
		Storage storage = new FileStorage();
		storage.store("123", "data");

	}
}