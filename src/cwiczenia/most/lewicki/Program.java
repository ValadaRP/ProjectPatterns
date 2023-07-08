package cwiczenia.most.lewicki;

import cwiczenia.most.lewicki.implem.SerialDevice;
import cwiczenia.most.lewicki.abstr.SerialFlasher;
import cwiczenia.most.lewicki.abstr.Flasher;
import cwiczenia.most.lewicki.implem.USBDevice;
import cwiczenia.most.lewicki.abstr.USBFlasher;

public class Program {
    
	public static void main(String[] args) 
    {
        Flasher anUsbFlasher = new USBFlasher(new USBDevice());
        Flasher aSerialFlasher = new SerialFlasher(new SerialDevice());
        System.out.println("sygnalizacja pracy urz�dzenia portu szeregowego");
        aSerialFlasher.connectDevice();
        aSerialFlasher.validateDevice();
        aSerialFlasher.initFlashing();
        aSerialFlasher.communicateViaProtocall();
        if(aSerialFlasher.flashStatus){
            aSerialFlasher.flashDevice();
        }
        aSerialFlasher.eject();        
        System.out.println("\nsygnalizacja pracy urz�dzenia portu usb");
        anUsbFlasher.connectDevice();
        anUsbFlasher.validateDevice();
        anUsbFlasher.initFlashing();
        anUsbFlasher.communicateViaProtocall();
        if(anUsbFlasher.flashStatus){
            anUsbFlasher.flashDevice();
        }
        anUsbFlasher.eject();
    }
}