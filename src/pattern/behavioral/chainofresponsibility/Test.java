package pattern.behavioral.chainofresponsibility;

public class Test {
	//문제 해결사들이 한줄로 서있다가 문제가 들어오면 자기가 해결할 수 있으면 해결하고 안되면 다음 해결사에게 문제를 던짐.
	public static void main(String[] args) {
		Problem[] problems = new Problem[5];
		
		//5개의 문제점들
		problems[0] = new Problem("덩치 큰 깡패");
		problems[1] = new Problem("컴퓨터 보안장치");
		problems[2] = new Problem("까칠한 여자");
		problems[3] = new Problem("날렵한 깡패");
		//폭탄에서 전문가들이 좌절. 필요한 전문가 영입및 해고는 로직 변경없이 가능.
		//모든 문제는 fighter객체를 거쳐간다. 맨앞에 있어서. 
		problems[4] = new Problem("폭탄");
		
		//3명의 전문가들
		Expert fighter = new Fighter();
		Expert hacker = new Hacker();
		Expert casanova = new Casanova();
		//어떤 전문가가 어떤 문제를 해결하는지는 관심 없다.
		//Expert 클래스는 마치 장식자 패턴처럼 Expert를 멤버 변수로 가지고 있다. 그러나 장식자와 달리 그 값이 null일 수 도있다.
		//casanova는 next가 null. 리턴 타입이 Expert이기에 가능.
		fighter.setNext(hacker).setNext(casanova);
		
		for(Problem problem:problems){
			fighter.support(problem);
		}
	}

}
