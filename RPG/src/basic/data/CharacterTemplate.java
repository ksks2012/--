package basic.data;

public class CharacterTemplate {
    private double HP;
    private double MP;
    private double ATK;
    private double DEF;

    private int move;
    protected int camp;

    private String name;

    public CharacterTemplate() {
        initial();
    }

    public void initial() {
        HP = 0;
        MP = 0;
        ATK = 0;
        DEF = 0;

        move = 0;
        camp = 0;

        name = null;
    }

    public CharacterTemplate(double HP, double MP, double ATK, double DEF,
            String name) {
        setHP(HP);
        setMP(MP);
        setATK(ATK);
        setDEF(DEF);
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setMP(double MP) {
        this.MP = MP;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getName() {
        return "Name: " + name;
    }

    public String getHP() {
        return "HP: " + Double.toString(HP);
    }

    public String getMP() {
        return "MP: " + Double.toString(MP);
    }

    public String getATK() {
        return "ATK: " + Double.toString(ATK);
    }

    public String getDEF() {
        return "DEF: " + Double.toString(DEF);
    }

    public int getCamp() {
        return camp;
    }

    public int getMove() {
        return move;
    }

    public void printData() {
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
        System.out.println("ATK:" + ATK);
        System.out.println("DEF:" + DEF);
    }

    public boolean isExist() {
        if (HP == 0 || MP == 0 || ATK == 0 || DEF == 0) {
            return false;
        } else {
            return true;
        }
    }
}
