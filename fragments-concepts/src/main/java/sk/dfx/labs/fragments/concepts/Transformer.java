package sk.dfx.labs.fragments.concepts;

public interface Transformer<I,P> {

	P transform(I input);
}
