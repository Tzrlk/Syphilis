package nz.co.aetheric.syphilis.persist.templates;

import nz.co.aetheric.syphilis.persist.resources.Legacy;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;
import static nz.co.aetheric.syphilis.util.Math.triangle;

@Document
public class Mage extends AbstractTemplate {
    public static final int EXP_FACTOR_ARCANA_PRIMARY = 6;
    public static final int EXP_FACTOR_ARCANA_INFERIOR = 8;
    public static final int EXP_FACTOR_ARCANA_NORMAL = 7;
    public static final int EXP_FACTOR_GNOSIS = 8;

    String path;

    Integer gnosis;
    @Reference Legacy legacy;

    Integer death;
    Integer fate;
    Integer forces;
    Integer life;
    Integer matter;
    Integer mind;
    Integer prime;
    Integer space;
    Integer spirit;
    Integer time;
    
    public Integer getManaCapacity() {
        return gnosis + 2 * 3; //TODO: make this accurate
    }

    public int[] getArcanaAsArray() {
        return new int[] { death, fate, forces, life, matter, mind, prime, space, spirit, time };
    }

    private int[] getSpecialArcana() {
        switch(path) {
            case PATH_ACANTHUS: return new int[] { 1, 9, 7 };
            case PATH_MASTIGOS: return new int[] { 5, 7, 4 };
            case PATH_MOROS:    return new int[] { 0, 4, 8 };
            case PATH_OBRIMOS:  return new int[] { 2, 6, 0 };
            case PATH_THYRSUS:  return new int[] { 3, 8, 9 };
            default: return null;
        }
    }

    @Override
    public Integer calcExp() {
        int[] special = getSpecialArcana();
        int[] arcana = getArcanaAsArray();

        int exp = 0;
        exp += triangle(EXP_FACTOR_ARCANA_PRIMARY, arcana[special[0]]);
        exp += triangle(EXP_FACTOR_ARCANA_PRIMARY, arcana[special[1]]);
        exp += triangle(EXP_FACTOR_ARCANA_INFERIOR, arcana[special[2]]);
        for(int sphere : special) arcana[sphere] = 0;
        for(int sphere : arcana) exp += triangle(EXP_FACTOR_ARCANA_NORMAL, sphere);
        exp += triangle(EXP_FACTOR_GNOSIS, gnosis);
        if(legacy != null) exp += legacy.calcExp();
        return exp;
    }
}
