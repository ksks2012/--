import java.awt.Frame;
import java.awt.Graphics;

import AWT_windows.CreateWindow;
import basic.data.CharacterTemplate;
import basic.data.MonsterTemplate;

public class main {
    static final int campPlayer = 1;
    static final int campEnemy = 2;
    public static void main (String args[]) {
        
        //TODO window        
        CreateWindow createWindow = new CreateWindow();
        createWindow.displayWindows();
        
        CharacterTemplate t = new CharacterTemplate(1, 1, 1, 1, "haha");
        t.setCamp(campPlayer);
        createWindow.addCharacter(t, 32);
        MonsterTemplate m = new MonsterTemplate();
        m.setCamp(campEnemy);
        createWindow.addCharacter(m, 0);
        
    }
    
}
