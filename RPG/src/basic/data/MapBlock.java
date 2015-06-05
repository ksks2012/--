package basic.data;

public class MapBlock {
    private boolean choose = false;
    private boolean things = false;

    private CharacterTemplate character = new CharacterTemplate();

    public boolean isChoose() {
        return choose;
    }

    public void setChoose() {
        choose = choose ? false : true;
    }

    public void addCharacter(CharacterTemplate character) {
        this.character = character;
        things = true;
    }

    public boolean isThingsExist() {
        return things;
    }

    public CharacterTemplate getCharacterTemplate() {
        return character;
    }
}
