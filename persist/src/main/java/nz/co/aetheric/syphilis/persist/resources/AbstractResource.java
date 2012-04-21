package nz.co.aetheric.syphilis.persist.resources;

import nz.co.aetheric.syphilis.persist.AbstractEntity;
import org.springframework.data.annotation.Reference;

public abstract class AbstractResource extends AbstractEntity {
    @Reference Character character;

    String name;
    String brief;
    String description;
    String book;
    Integer page;
}
