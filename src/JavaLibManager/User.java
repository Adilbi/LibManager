package JavaLibManager;

public abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void showMenu();
    public abstract String getRole();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
