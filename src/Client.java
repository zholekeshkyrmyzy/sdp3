public class Client {
    public static void main(String[] args) {
        Charger oldCharger = new OldCharger();
        oldCharger.chargePhone();

        UsbCCharger usbC = new UsbCCharger();

        Charger adapter = new UsbCAdapter(usbC);
        adapter.chargePhone();
    }
}