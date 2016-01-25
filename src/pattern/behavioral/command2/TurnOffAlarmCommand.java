package pattern.behavioral.command2;

public class TurnOffAlarmCommand implements Command {
	private Alarm theAlarm;

	public TurnOffAlarmCommand(Alarm alarm) {
		this.theAlarm = alarm;
	}

	public void execute() {
		theAlarm.turnOff();
	}
}
