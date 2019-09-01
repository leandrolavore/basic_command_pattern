public class Remote_control {

    Command slot;

    public Remote_control(){};

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonPressed(){

        slot.execute();
    }

}
