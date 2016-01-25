package pattern.behavioral.chainofresponsibility;

public abstract class Expert {
	private Expert next;
	protected String expertName;
	//support가 하는일은 자기가 해결할 수 있으면 하고 못하면 다음 전문가한테 넘김. 떠넘길 다음 전문가 없으면 못한다고 씀.
	public final void support(Problem p){
		//solve는 각각 개별 클래스가 자기가 해결 가능한지 불가능한지 판단하는 메소드.객체에 떠넘김.
		if(solve(p)){
			System.out.println(expertName+"이(가)"+p.getProblemName()+" 을(를) 해결해 버렸네");
		}else{
			if(next!=null){
				next.support(p);
			}else{
				System.out.println(p.getProblemName()+ "은(는) 해결할 넘이 없다");
			}
		}
	}
	public Expert setNext(Expert next){
		this.next = next;
		return next;
	}
	
	protected abstract boolean solve(Problem p);
}
