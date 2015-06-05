package basic.data;

public abstract class Resources {
    protected int storage;

    private String name;

    public abstract void naturalIncrease();

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage > 0 ? storage : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resources(int input, String name) {
        storage = input;
        this.setName(name);
    }

    public void addResources(int addition) {
        storage = storage + addition;
    }

    public void reduceResources(int input) {
        storage = storage - input;
    }

    public boolean isMore(int input) {
        if (input > storage)
            return true;
        else {
            return false;
        }
    }
}
