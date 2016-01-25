package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/* 변경 관리 대상이 되는 데이터가 있는 클래스 */
public class ScoreRecored extends Subject { //Subject 구현 클래스
	private List<Integer> scores=new ArrayList<Integer>();
	
	public void addScore(int score){
		scores.add(score); /* 변경 관리 대상 데이터 : score */
		notifyObservers();
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
