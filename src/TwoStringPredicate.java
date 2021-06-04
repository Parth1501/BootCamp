@FunctionalInterface
public interface TwoStringPredicate<T> {
	boolean isFirstBetterThanSecond(T first,T second);
}
