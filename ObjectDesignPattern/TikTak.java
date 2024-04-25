// TikTak.java 
// 25th april 2024

// GUIDE to user:
// TikTak object will print "Tik" or "Tak" sound every time timer sends a notification.

import java.util.ArrayList;

public class TikTak extends Observer{
    private ArrayList<String> clockSounds = new ArrayList<>();
    private int soundIndex = 1;

    public TikTak(String id) {
        super(id);
        clockSounds.add("Tik!");
        clockSounds.add("Tak!");
    }
    
    @Override
    public void update(String event) {
        if (event != "second has been elapsed") {
            return;
        }

        if (soundIndex == 0) {
            soundIndex = 1;
        } 
        else if (soundIndex == 1) {
            soundIndex = 0;
        }
        System.out.println(clockSounds.get(soundIndex));
    }
}
