package io.co.java4u;

import com.google.inject.AbstractModule;

public class StorageModule extends AbstractModule {

	public StorageModule() {
	}

	@Override
	protected void configure() {
		bind(Storage.class).to(FileStorage.class);
	}

}
