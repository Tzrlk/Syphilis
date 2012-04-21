package nz.co.aetheric.syphilis.persist.resources;

import nz.co.aetheric.syphilis.persist.AbstractEntity;
import nz.co.aetheric.syphilis.persist.enumerations.MageArcanaBean;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document
public class Spell extends AbstractEntity {
    public static final int EXP_FACTOR_ROTE = 2;

    @Reference MageArcanaBean arcana_primary;
    String practice;
    String action;
    String duration;
    String aspect;
    String cost;

    List<Rote> rotes;
    Map<MageArcanaBean, Integer> arcana;

    @Override
    public Integer calcExp() {
        return EXP_FACTOR_ROTE * arcana.get(arcana_primary);
    }
}
