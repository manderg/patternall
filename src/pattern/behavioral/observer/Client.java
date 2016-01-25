package pattern.behavioral.observer;


/* Observer 패턴 
 * 데이터의 변경이 발생했을 경우 상대 클래스나 객체에 의존하지 않으면서 데이터 변경을 통보하고자 할 때
 */
public class Client { //test
	public static void main(String[] args) {
		ScoreRecored scoreRecord=new ScoreRecored();
		DataSheetView dataSheetView3=new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5=new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView=new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheetView3);
		
		scoreRecord.attach(dataSheetView5);
		
		scoreRecord.attach(minMaxView);
		
		for(int index=1;index<=5;index++){
			System.out.println("********************");
			int score=index*10;
			System.out.println("Adding "+score);
			scoreRecord.addScore(score);
			System.out.println("********************");
		}
	}
}
