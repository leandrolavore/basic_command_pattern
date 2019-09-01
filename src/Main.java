public class Main {

    public static void main(String[] args) {
	// write your code here
    Remote_control controller = new Remote_control();

    Lights light = new Lights();

    Lights_commanded lightOn = new Lights_commanded(light);

    controller.setCommand(lightOn);
    controller.buttonPressed();

    Lights_commandedOff lightOff = new Lights_commandedOff(light);

    controller.setCommand(lightOff);
    controller.buttonPressed();

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Garage_door garage_door = new Garage_door();
    GarageDoor_commanded  garage_up = new GarageDoor_commanded(garage_door);
    GarageDoor_commandedDown garage_down = new GarageDoor_commandedDown(garage_door);

    controller.setCommand(garage_up);
    controller.buttonPressed();

    controller.setCommand(garage_down);
    controller.buttonPressed();

    Television tele = new Television();
    controller.setCommand(()->{tele.Turn_on();});
    controller.buttonPressed();
    controller.setCommand(()->{tele.Turn_off();});
    controller.buttonPressed();

    AC ac = new AC();
    controller.setCommand(ac::Turn_on);
    controller.buttonPressed();
    controller.setCommand(ac::Turn_off);
    controller.buttonPressed();

    }
}
