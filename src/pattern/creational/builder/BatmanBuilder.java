package pattern.creational.builder;

public class BatmanBuilder implements Builder {
    private Hero batman;
    BatmanBuilder(){
        batman = new Hero("배트맨");
    }
    public void makeArm() {
        batman.setArmSource("돈지랄");
    }
    public void makeLeg() {
        batman.setLegSource("돈지랄");
    }
    public Hero getResult() {
        return batman;
    }
}
