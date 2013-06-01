package sk.dfx.labs.fragments.concepts;

public interface ExtensibleObject<T> {

	<E extends Extension<T>> E getExtension(Class<E> extensionType);
	
	public interface Extension<T> {
		
	}
}
