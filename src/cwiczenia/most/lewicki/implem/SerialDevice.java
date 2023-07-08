package cwiczenia.most.lewicki.implem;

public class SerialDevice extends Device{
    public SerialDevice(){
        type="portu szeregowego";
        deviceConnectionStatus=true;
    }
    public boolean validateDevice() {
        System.out.println("system zatwierdzi� urz�dzenie portu szeregowego");
        return true;
    }
}