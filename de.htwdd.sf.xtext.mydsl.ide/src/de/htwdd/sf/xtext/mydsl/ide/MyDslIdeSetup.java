/*
 * generated by Xtext 2.26.0
 */
package de.htwdd.sf.xtext.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwdd.sf.xtext.mydsl.MyDslRuntimeModule;
import de.htwdd.sf.xtext.mydsl.MyDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDslIdeSetup extends MyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule(), new MyDslIdeModule()));
	}
	
}
