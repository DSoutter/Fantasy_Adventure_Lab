package Character.Melee;

public enum WeaponType {

    SWORD(100),
    AXE(150),
    BATTLEAXE(200);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
