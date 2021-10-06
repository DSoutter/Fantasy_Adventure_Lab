package Character.Cleric;

public enum HealingTools {

    MAGICPOTION(150),
    GINGERROOT(50),
    SUPERPOTION(200);

    final int healthValue;

    HealingTools(int healthValue) {
        this.healthValue = healthValue;
    }
}
