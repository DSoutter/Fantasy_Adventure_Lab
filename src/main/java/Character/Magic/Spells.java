package Character.Magic;

public enum Spells {

    FIREBALL(150.0),
    ICEBALL(125.0),
    PEWPEWPEW(300.0);

    final double damage;

    Spells(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}
