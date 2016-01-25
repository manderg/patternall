package pattern.behavioral.state2;

public class Test {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.processEvent(Action.EAT);
        context.processEvent(Action.EAT);
        context.processEvent(Action.GOTOBED);
        context.processEvent(Action.DIGEST);
        context.processEvent(Action.GOTOBED);
    }
}
