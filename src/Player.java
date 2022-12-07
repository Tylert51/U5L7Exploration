public class Player
{
    private String name;
    private int score;
    private int health;
    private int attackPower;

    public Player(String name)
    {
        this.name = name;
        score = 0;
        health = 100;
        attackPower = 1;
    }

    public static boolean healthHigher(int health, int power, int val)
    {
        return (health > val || power > val);
    }

    public int powered()
    {
        return health * attackPower;
    }

    public int getHealth() {
        return health;
    }
}
