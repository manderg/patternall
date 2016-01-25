package pattern.behavioral.command2;

public class TestCommand {
	public static void main(String[] args){
	       Light light=new Light();
	       Command switchUp=new TurnOnLightCommand(light);
	       Command switchDown=new TurnOffLightCommand(light);
	       Alarm alarm=new Alarm();
	       Command switchUp1=new TurnOnAlarmCommand(alarm);
	       Command switchDown1=new TurnOffAlarmCommand(alarm);

	       Switch s=new Switch(switchUp1,switchDown1);

	       s.flipUp();
	       s.flipDown();
	   }
}
