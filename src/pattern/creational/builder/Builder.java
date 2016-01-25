package pattern.creational.builder;

public interface Builder {
    void makeArm();
    void makeLeg();
    Hero getResult();
}