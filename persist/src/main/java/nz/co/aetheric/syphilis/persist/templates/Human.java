package nz.co.aetheric.syphilis.persist.templates;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import static nz.co.aetheric.syphilis.util.Math.triangle;

@Document
public class Human extends AbstractTemplate {
    public static final int EXP_FACTOR_ATTRIBUTE = 4;
    public static final int EXP_FACTOR_SKILL = 3;
    public static final int EXP_FACTOR_SPECIALITY = 3;

    Integer intelligence;
    Integer wits;
    Integer resolve;
    Integer strength;
    Integer dexterity;
    Integer stamina;
    Integer presence;
    Integer manipulation;
    Integer composure;

    Integer academics;
    Integer computers;
    //TODO: etc.

    List<String> specialities;

    public int[] getAttributesAsArray() {
        return new int[] { intelligence, wits, resolve, strength, dexterity, stamina, presence, manipulation,
                composure };
    }

    public int[] getSkillsAsArray() {
        return new int[] { academics, computers };
    }

    @Override
    public Integer calcExp() {
        int exp = 0;
        for(int attribute : getAttributesAsArray()) exp += triangle(EXP_FACTOR_ATTRIBUTE, attribute);
        for(int skill : getSkillsAsArray()) exp += triangle(EXP_FACTOR_SKILL, skill);
        exp += specialities.size() * EXP_FACTOR_SPECIALITY;
        return exp;
    }
}
