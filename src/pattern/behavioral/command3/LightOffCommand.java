package pattern.behavioral.command3;

public class LightOffCommand implements Command {

	private Light light ;
	
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.off();
	}

}
