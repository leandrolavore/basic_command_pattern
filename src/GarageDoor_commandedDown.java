public class GarageDoor_commandedDown implements Command{

    Garage_door garage_door;

     public GarageDoor_commandedDown(Garage_door garage_door){this.garage_door = garage_door;}

    public void execute(){
        garage_door.Down();
    }
}
