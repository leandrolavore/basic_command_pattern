public class GarageDoor_commanded implements Command{

    Garage_door garage_door;

    public GarageDoor_commanded(Garage_door garage_door){
        this.garage_door = garage_door;
    }
    public void execute(){
        garage_door.Up();
    }
}
