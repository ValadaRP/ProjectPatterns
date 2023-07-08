package cwiczenia.most.lewicki.implem;

public class USBDevice extends Device
{
    public USBDevice(){
        type="USB";
        deviceConnectionStatus=true;
    }
    public boolean validateDevice() {
        System.out.println("system zatwierdzi� urz�dzenie portu USB");
        return true;
    }
}