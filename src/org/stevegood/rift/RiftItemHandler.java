package org.stevegood.rift;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;

/**
 * User: stgood
 * Date: 1/14/14
 * Time: 10:11 AM
 */
public class RiftItemHandler extends DefaultHandler {
    private ArrayList<RiftItem> items;
    private boolean excludeConsumables = true;
    private RiftItem riftItem;
    private String lastNodeName = "";
    private boolean bItemKey;
    private boolean bName;
    private boolean bMaxStackSize;
    private boolean bRarity;
    private boolean bCalling;
    private boolean bIcon;
    private boolean bArmor;
    private boolean bDexterity;
    private boolean bEndurance;
    private boolean bIntelligence;
    private boolean bStrength;
    private boolean bWisdom;
    private boolean bOnEquipAbility;
    private boolean bOnUseAbility;
    private boolean bOnEquip;
    private boolean bOnUse;
    private boolean bDodge;
    private boolean bBlock;
    private boolean bDeflect;
    private boolean bParry;
    private boolean bHit;
    private boolean bToughness;
    private boolean bSlot;
    private boolean bArmorType;
    private boolean bRequiredLevel;
    private boolean bWeaponType;
    private boolean bMinimumDamage;
    private boolean bMaximumDamage;
    private boolean bSpeed;
    private boolean bRange;
    private boolean bSpellDamage;
    private boolean bSpellPower;
    private boolean bValor;
    private boolean bVengeance;
    private boolean bCriticalHit;
    private boolean bSpellCriticalHit;
    private boolean bCritPowerRating;

    public ArrayList<RiftItem> getItems() {
        return items;
    }

    public void setExcludeConsumables(boolean excludeConsumables) {
        this.excludeConsumables = excludeConsumables;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Item")) {
            riftItem = new RiftItem();
            if (items == null) {
                items = new ArrayList<RiftItem>();
            }
        } else if (qName.equalsIgnoreCase("ItemKey")) {
            bItemKey = true;
        } else if (lastNodeName.equalsIgnoreCase("Name") && qName.equalsIgnoreCase("English")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("MaxStackSize")) {
            bMaxStackSize = true;
        } else if (qName.equalsIgnoreCase("Rarity")) {
            bRarity = true;
        } else if (qName.equalsIgnoreCase("Consumable")) {
            riftItem.setConsumable(true);
        } else if (qName.equalsIgnoreCase("Calling")) {
            bCalling = true;
        } else if (qName.equalsIgnoreCase("Icon")) {
            bIcon = true;
        } else if (qName.equalsIgnoreCase("Armor")) {
            bArmor = true;
        } else if (qName.equalsIgnoreCase("Dexterity")){
            bDexterity = true;
        } else if (qName.equalsIgnoreCase("Endurance")){
            bEndurance = true;
        } else if (qName.equalsIgnoreCase("Intelligence")) {
            bIntelligence = true;
        } else if (qName.equalsIgnoreCase("Strength")) {
            bStrength = true;
        } else if (qName.equalsIgnoreCase("Wisdom")) {
            bWisdom = true;
        } else if (lastNodeName.equalsIgnoreCase("OnUse") && qName.equalsIgnoreCase("Ability")) {
            bOnUseAbility = true;
        } else if (bOnUseAbility && qName.equalsIgnoreCase("English")) {
            bOnUse = true;
            bOnUseAbility = false;
        } else if (lastNodeName.equalsIgnoreCase("OnEquip") && qName.equalsIgnoreCase("Ability")) {
            bOnEquipAbility = true;
        } else if (bOnEquipAbility && qName.equalsIgnoreCase("English")) {
            bOnEquip = true;
            bOnEquipAbility = false;
        } else if (lastNodeName.equalsIgnoreCase("OnEquip") && qName.equalsIgnoreCase("Tooltip")) {
            bOnEquipAbility = true;
        } else if (lastNodeName.equalsIgnoreCase("OnUse") && qName.equalsIgnoreCase("Tooltip")) {
            bOnUseAbility = true;
        } else if (qName.equalsIgnoreCase("ShieldBlock")) {
            bBlock = true;
        } else if (qName.equalsIgnoreCase("Dodge")) {
            bDodge = true;
        } else if (qName.equalsIgnoreCase("Deflect")) {
            bDeflect = true;
        } else if (qName.equalsIgnoreCase("Parry")) {
            bParry = true;
        } else if (qName.equalsIgnoreCase("HitBonus")) {
            bHit = true;
        } else if (qName.equalsIgnoreCase("Toughness")) {
            bToughness = true;
        } else if (qName.equalsIgnoreCase("Slot")) {
            bSlot = true;
        } else if (qName.equalsIgnoreCase("ArmorType")) {
            bArmorType = true;
        } else if (qName.equalsIgnoreCase("RequiredLevel")) {
            bRequiredLevel = true;
        } else if (qName.equalsIgnoreCase("WeaponType")) {
            bWeaponType = true;
        } else if (qName.equalsIgnoreCase("MinimumDamage")) {
            bMinimumDamage = true;
        } else if (qName.equalsIgnoreCase("MaximumDamage")) {
            bMaximumDamage = true;
        } else if (qName.equalsIgnoreCase("Speed")) {
            bSpeed = true;
        } else if (qName.equalsIgnoreCase("Range")) {
            bRange = true;
        } else if (qName.equalsIgnoreCase("SpellDamage")) {
            bSpellDamage = true;
        } else if (qName.equalsIgnoreCase("SpellPower")) {
            bSpellPower = true;
        } else if (qName.equalsIgnoreCase("Valor")) {
            bValor = true;
        } else if (qName.equalsIgnoreCase("Vengeance")) {
            bVengeance = true;
        } else if (qName.equalsIgnoreCase("CriticalHit")) {
            bCriticalHit = true;
        } else if (qName.equalsIgnoreCase("SpellCriticalHit")) {
            bSpellCriticalHit = true;
        } else if (qName.equalsIgnoreCase("CritPowerRating")) {
            bCritPowerRating = true;
        }

        lastNodeName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        boolean addItem = (!riftItem.isConsumable() || (!excludeConsumables && riftItem.isConsumable()));

        if (qName.equalsIgnoreCase("Item") && addItem) {
            items.add(riftItem);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        if (bItemKey) {
            riftItem.setItemKey(str);
            bItemKey = false;
        } else if (bName) {
            riftItem.setName(str);
            bName = false;
        } else if (bMaxStackSize) {
            riftItem.setMaxStackSize(Integer.parseInt(str));
            bMaxStackSize = false;
        } else if (bRarity) {
            riftItem.setRarity(str);
            bRarity = false;
        } else if (bCalling) {
            if (riftItem.getRequiredCallings() == null) {
                riftItem.setRequiredCallings(new ArrayList<String>());
            }
            riftItem.getRequiredCallings().add(str);
            bCalling = false;
        } else if (bIcon) {
            str = str.split("\\\\")[1];
            riftItem.setIcon(str);
            bIcon = false;
        } else if (bArmor) {
            riftItem.setArmor(Integer.parseInt(str));
            bArmor = false;
        } else if (bDexterity) {
            riftItem.setDexterity(Integer.parseInt(str));
            bDexterity = false;
        } else if (bEndurance){
            riftItem.setEndurance(Integer.parseInt(str));
            bEndurance = false;
        } else if (bIntelligence) {
            riftItem.setIntelligence(Integer.parseInt(str));
            bIntelligence = false;
        } else if (bStrength) {
            riftItem.setStrength(Integer.parseInt(str));
            bStrength = false;
        } else if (bWisdom) {
            riftItem.setWisdom(Integer.parseInt(str));
            bWisdom = false;
        } else if (bOnUse) {
            riftItem.setOnUse(str);
            bOnUse = false;
        } else if (bOnEquip) {
            riftItem.setOnEquip(str);
            bOnEquip = false;
        } else if (bBlock) {
            riftItem.setBlock(Integer.parseInt(str));
            bBlock = false;
        } else if (bDodge) {
            riftItem.setDodge(Integer.parseInt(str));
            bDodge = false;
        } else if (bDeflect) {
            riftItem.setDeflect(Integer.parseInt(str));
            bDeflect = false;
        } else if (bParry) {
            riftItem.setParry(Integer.parseInt(str));
            bParry = false;
        } else if (bHit) {
            riftItem.setHit(Integer.parseInt(str));
            bHit = false;
        } else if (bToughness) {
            riftItem.setToughness(Integer.parseInt(str));
            bToughness = false;
        } else if (bSlot) {
            riftItem.setSlot(str);
            bSlot = false;
        } else if (bArmorType) {
            riftItem.setArmorType(str);
            bArmorType = false;
        } else if (bRequiredLevel) {
            riftItem.setRequiredLevel(Integer.parseInt(str));
            bRequiredLevel = false;
        } else if (bWeaponType) {
            riftItem.setWeaponType(str);
            bWeaponType = false;
        } else if (bMinimumDamage) {
            riftItem.setMinimumDamage(Integer.parseInt(str));
            bMinimumDamage = false;
        } else if (bMaximumDamage) {
            riftItem.setMaximumDamage(Integer.parseInt(str));
            bMaximumDamage = false;
        } else if (bSpeed) {
            riftItem.setSpeed(Float.parseFloat(str));
            bSpeed = false;
        } else if (bRange) {
            riftItem.setRange(Float.parseFloat(str));
            bRange = false;
        } else if (bSpellDamage) {
            riftItem.setSpellDamage(Integer.parseInt(str));
            bSpellDamage = false;
        } else if (bSpellPower) {
            riftItem.setSpellPower(Integer.parseInt(str));
            bSpellPower = false;
        } else if (bValor) {
            riftItem.setValor(Integer.parseInt(str));
            bValor = false;
        } else if (bVengeance) {
            riftItem.setVengeance(Integer.parseInt(str));
            bVengeance = false;
        } else if (bCriticalHit) {
            riftItem.setCriticalHit(Integer.parseInt(str));
            bCriticalHit = false;
        } else if (bSpellCriticalHit) {
            riftItem.setSpellCriticalHit(Integer.parseInt(str));
            bSpellCriticalHit = false;
        } else if (bCritPowerRating) {
            riftItem.setCritPowerRating(Integer.parseInt(str));
            bCritPowerRating = false;
        }
    }
}
