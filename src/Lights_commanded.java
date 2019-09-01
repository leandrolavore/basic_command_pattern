public class Lights_commanded implements Command{

    Lights light;

    public Lights_commanded(Lights light){
        this.light = light;
    }


    public void execute(){
        light.on();
    }
}
