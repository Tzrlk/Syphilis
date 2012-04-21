package nz.co.aetheric.syphilis.persist.resources;

import org.springframework.data.annotation.Reference;

public class Rote extends AbstractResource {
    @Reference Spell spell;
    String order;
    String pool;

    @Override
    public Integer calcExp() {
        return spell.calcExp();
    }
}
