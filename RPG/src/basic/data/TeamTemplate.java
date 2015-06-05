package basic.data;

public class TeamTemplate extends CharacterTemplate{
    
    public TeamTemplate() {
        super();
        camp = 1;
    }

    public TeamTemplate(double HP, double MP, double ATK, double DEF, String name) {
        super(HP, MP, ATK, DEF, name);
        camp = 1;
    }
}
