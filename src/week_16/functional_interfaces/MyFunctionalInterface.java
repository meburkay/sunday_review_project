package week_16.functional_interfaces;
@FunctionalInterface
public interface MyFunctionalInterface<T,U,D,R> {
    R myMethod(T t,U u, D d);
}
