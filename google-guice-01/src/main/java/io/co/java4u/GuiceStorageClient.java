package io.co.java4u;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceStorageClient {

	public static void main(String[] args) {
		
		Injector createInjector = Guice.createInjector(new StorageModule());
		Storage storage = createInjector.getInstance(FileStorage.class);
		storage.store("123", "data");
		
	}
}