public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private int batteryPercentage;
    private boolean isOn;

    public Smartphone(String Brand, String Model, int Storage, int Battery){
        brand = Brand;
        model = Model;
        storageCapacity = Storage;
        batteryPercentage = Battery;
        isOn = false;
    }

    public boolean turnOn(){
        if (batteryPercentage > 0 && isOn == false){
            isOn = true;
            return true;
        }
        else{
            return false;
        }
    }

    public void turnOff(){
        isOn = false;
    }

    public void chargePhone(int chargeAmount){
        batteryPercentage += chargeAmount;
        if (batteryPercentage > 100){
            batteryPercentage = 100;
        }
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Storage: "+storageCapacity+", Battery: "+batteryPercentage+", On: "+isOn;
    }
}
