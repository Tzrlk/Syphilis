package nz.co.aetheric.syphilis.persist.templates;

import nz.co.aetheric.syphilis.persist.AbstractEntity;
import nz.co.aetheric.syphilis.persist.Character;
import org.springframework.data.annotation.Reference;

public abstract class AbstractTemplate extends AbstractEntity {
    @Reference Character character;
}
