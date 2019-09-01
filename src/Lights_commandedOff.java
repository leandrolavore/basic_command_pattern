public class Lights_commandedOff implements Command{

    Lights light;

    public Lights_commandedOff(Lights light){this.light = light;}

    public void execute(){
        light.off();
    }
}
