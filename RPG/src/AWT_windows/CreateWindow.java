package AWT_windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import basic.data.CharacterTemplate;
import basic.data.MapBlock;

public class CreateWindow extends Frame implements MouseListener {

    static final int windowX = 800;
    static final int windowY = 700;

    CreateWindow frame;

    MenuBar menuBar = new MenuBar();
    Menu basicMenu = new Menu("基本");
    Menu exit = new Menu("結束");
    MenuItem exit_close = new MenuItem("關閉遊戲");

    Graphics graphics = getGraphics();

    boolean focusFlag = false;

    private MapBlock mapInformation[] = new MapBlock[150];

    public CreateWindow() {
        frame = this;
        initialMapInformation();
        setMenu();
        setFrame();
    }

    private void initialMapInformation() {
        for (int i = 0; i < 150; i++) {
            mapInformation[i] = new MapBlock();
        }
    }

    private void setMenu() {
        menuBar.add(basicMenu);
        menuBar.add(exit);
        exit.add(exit_close);
    }

    private void setFrame() {
        frame.setTitle("廢物黃翔");
        frame.setSize(windowX, windowY);
        frame.setResizable(false);
        frame.setBackground(Color.white);
        frame.setLocation(200, 50);
        frame.setMenuBar(menuBar);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.addMouseListener(frame);
    }

    public void displayWindows() {
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        paintBlock(g);
        checkFocus(g);
    }

    private void checkFocus(Graphics g) {
        int blockCamp;
        for (int i = 0; i < 150; i++) {
            if (mapInformation[i].isChoose() == true) {
                blockCamp = mapInformation[i].getCharacterTemplate().getCamp();

                switch (blockCamp) {
                case 0:
                    g.setColor(Color.green);
                    break;
                case 1:
                    g.setColor(Color.blue);
                    break;
                case 2:
                    g.setColor(Color.red);
                    break;
                }

                g.fillRect(10 + i % 15 * 50, 50 + i / 15 * 50, 50, 50);
                g.setColor(Color.black);
                g.drawRect(10 + i % 15 * 50, 50 + i / 15 * 50, 50, 50);

                if (mapInformation[i].isThingsExist() == true) {
                    paintCharacter(g, i);
                    paintMove(i, g);
                }

                break;
            }
        }
    }

    private void paintMove(int location, Graphics g) {
        int move = mapInformation[location].getCharacterTemplate().getMove();
        for (int i = 0; i < location + move * 15 + 1; i++) {
            if (i != location
                    && Math.abs((i % 15) - (location % 15))
                            + Math.abs((i / 15) - (location / 15)) <= move) {
                g.setColor(Color.pink);
                g.fillRect(10 + i % 15 * 50, 50 + i / 15 * 50, 50, 50);
                g.setColor(Color.black);
                g.drawRect(10 + i % 15 * 50, 50 + i / 15 * 50, 50, 50);
            }
        }
    }

    private void paintCharacter(Graphics g, int i) {
        System.out.println("character");
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
        g.drawRect(10, 570, 100, 100);
        g.drawString(mapInformation[i].getCharacterTemplate().getName(), 120,
                570);
        g.drawString(mapInformation[i].getCharacterTemplate().getHP(), 120, 600);
        g.drawString(mapInformation[i].getCharacterTemplate().getMP(), 120, 630);
        g.drawString(mapInformation[i].getCharacterTemplate().getATK(), 120,
                660);
        g.drawString(mapInformation[i].getCharacterTemplate().getDEF(), 120,
                690);
    }

    private void paintBlock(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, windowX, windowY);
        g.setColor(Color.black);
        for (int i = 50; i < 600; i = i + 50) {
            g.drawLine(10, i, 760, i);
        }
        for (int i = 10; i < 800; i = i + 50) {
            g.drawLine(i, 50, i, 550);
        }
    }

    public void addCharacter(CharacterTemplate inputCharacter, int location) {
        mapInformation[location].addCharacter(inputCharacter);
    }

    public void mousePressed(MouseEvent e) {
        int mouseCompressX = e.getX();
        int mouseCompressY = e.getY();

        System.out.println(e.getX());
        System.out.println(e.getY());
        System.out.println(((mouseCompressX - 10) / 50)
                + ((mouseCompressY - 50) / 50) * 15);
        if (focusFlag == false) {
            mapInformation[(mouseCompressX - 10) / 50
                    + ((mouseCompressY - 50) / 50) * 15].setChoose();
            focusFlag = focusFlag ? false : true;
        } else {
            if (mapInformation[(mouseCompressX - 10) / 50
                    + ((mouseCompressY - 50) / 50) * 15].isChoose()) {
                mapInformation[(mouseCompressX - 10) / 50
                        + ((mouseCompressY - 50) / 50) * 15].setChoose();
                focusFlag = focusFlag ? false : true;
            }
        }
        // TODO 效率
        graphics = getGraphics();
        paint(graphics);
    }

    public void mouseClicked(MouseEvent arg0) {
        ;
    }

    public void mouseEntered(MouseEvent arg0) {
        ;
    }

    public void mouseExited(MouseEvent arg0) {
        ;
    }

    public void mouseReleased(MouseEvent arg0) {
        ;
    }
}
