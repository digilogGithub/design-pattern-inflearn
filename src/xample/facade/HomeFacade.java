package xample.facade;

public class HomeFacade {

    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void homeTurnOn() {
        System.out.println("-----Home Turn on-----");
        if(!computer.isTurnedOn())
            computer.turnOn();
        if(!light.isTurnedOn())
            light.turnOn();
        if(!radio.isTurnedOn())
            radio.turnOn();
    }

    public void homeTurnOff() {
        System.out.println("-----Home Turn off-----");
        if(computer.isTurnedOn())
            computer.turnOff();
        if(light.isTurnedOn())
            light.turnOff();
        if(radio.isTurnedOn())
            radio.turnOff();
    }

}
