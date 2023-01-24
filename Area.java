package vikas.test;

@FunctionalInterface
public interface Area {
    int calculate(int x, int y);

    default int square(int x){
        return x*x;
    }
}