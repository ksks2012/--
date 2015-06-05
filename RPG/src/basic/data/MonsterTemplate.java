package basic.data;

public class MonsterTemplate extends CharacterTemplate{
    
    public MonsterTemplate() {
        super();
        camp = 2;
    }

    public MonsterTemplate(double HP, double MP, double ATK, double DEF, String name) {
        super(HP, MP, ATK, DEF, name);
        camp = 2;
    }

}
