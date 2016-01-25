package pattern.behavioral.visitor;

interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}