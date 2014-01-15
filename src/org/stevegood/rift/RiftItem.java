package org.stevegood.rift;

import java.util.ArrayList;

/**
 * User: stgood
 * Date: 1/14/14
 * Time: 10:35 AM
 */
public class RiftItem {

    private String itemKey;
    private String name;
    private int maxStackSize;
    private String rarity;
    private boolean consumable;
    private String icon;
    private int requiredLevel;
    private ArrayList<String> requiredCallings;
    private int armor;
    private int dexterity;
    private int endurance;
    private int intelligence;
    private int strength;
    private int wisdom;
    private int dodge;
    private int block;
    private int deflect;
    private int parry;
    private int hit;
    private int toughness;
    private String onUse;
    private String onEquip;
    private String slot;
    private String armorType;
    private String weaponType;
    private int minimumDamage;
    private int maximumDamage;
    private float speed;
    private float range;
    private int spellDamage;
    private int spellPower;
    private int valor;
    private int vengeance;
    private int criticalHit;
    private int spellCriticalHit;
    private int critPowerRating;

    public RiftItem() {

    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVengeance() {
        return vengeance;
    }

    public void setVengeance(int vengeance) {
        this.vengeance = vengeance;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int getSpellCriticalHit() {
        return spellCriticalHit;
    }

    public void setSpellCriticalHit(int spellCriticalHit) {
        this.spellCriticalHit = spellCriticalHit;
    }

    public int getCritPowerRating() {
        return critPowerRating;
    }

    public void setCritPowerRating(int critPowerRating) {
        this.critPowerRating = critPowerRating;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getMinimumDamage() {
        return minimumDamage;
    }

    public void setMinimumDamage(int minimumDamage) {
        this.minimumDamage = minimumDamage;
    }

    public int getMaximumDamage() {
        return maximumDamage;
    }

    public void setMaximumDamage(int maximumDamage) {
        this.maximumDamage = maximumDamage;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getDeflect() {
        return deflect;
    }

    public void setDeflect(int deflect) {
        this.deflect = deflect;
    }

    public int getParry() {
        return parry;
    }

    public void setParry(int parry) {
        this.parry = parry;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public void setConsumable(boolean consumable) {
        this.consumable = consumable;
    }

    public String getOnEquip() {
        return onEquip;
    }

    public void setOnEquip(String onEquip) {
        this.onEquip = onEquip;
    }

    public Boolean getConsumable() {
        return consumable;
    }

    public void setConsumable(Boolean consumable) {
        this.consumable = consumable;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOnUse() {
        return onUse;
    }

    public void setOnUse(String onUse) {
        this.onUse = onUse;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public ArrayList<String> getRequiredCallings() {
        return requiredCallings;
    }

    public void setRequiredCallings(ArrayList<String> requiredCallings) {
        this.requiredCallings = requiredCallings;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }

    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String toString() {
        return name + " <" + itemKey + ">";
    }

}