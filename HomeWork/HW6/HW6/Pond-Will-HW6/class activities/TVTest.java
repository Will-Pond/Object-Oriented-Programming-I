class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){}
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }


        public void setChannel( int newChannel){
            if (on && newChannel >= 1 && newChannel <= 120)
                channel = newChannel;
        }
        public void setVolume(int newVolumeLevel){
            if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
                volumeLevel = newVolumeLevel;
        }
        public void channelUp() {
            if (on && channel < 120) channel++;
        }
        public void channelDown() {
            if (on && channel > 1) channel--;
        }
        public void volumeUp() {
            if (on && volumeLevel < 7) volumeLevel++;
        }
        public void volumeDown() {
            if (on && volumeLevel > 1) volumeLevel--;
        }
    }



public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.volumeUp();
        System.out.println("1.1: " + (tv.volumeLevel == 2));
        tv.channelUp();
        System.out.println("1.2: " + (tv.channel == 2));
    }
}

/** output
 1.1: true
 1.2: true
 */