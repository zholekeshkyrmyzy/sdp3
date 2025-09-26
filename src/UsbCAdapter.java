public class UsbCAdapter implements Charger {
    private final UsbCCharger usbCCharger;

    public UsbCAdapter(UsbCCharger usbCCharger) {
        this.usbCCharger = usbCCharger;
    }

    @Override
    public void chargePhone() {
        usbCCharger.chargeUsbC();
    }
}
