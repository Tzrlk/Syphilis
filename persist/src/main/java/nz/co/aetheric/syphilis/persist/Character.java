package nz.co.aetheric.syphilis.persist;

import nz.co.aetheric.syphilis.persist.resources.AbstractResource;
import nz.co.aetheric.syphilis.persist.templates.AbstractTemplate;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Character extends AbstractEntity {
    String name;

    @Reference
    UserBean user;

    // Queries

    public List<AbstractTemplate> getTemplates() {
        return null;
    }

    public List<AbstractResource> getResources() {
        return null;
    }

    public Integer calcExp() {
        int exp = 0;

        for(AbstractTemplate template : getTemplates()) exp += template.calcExp();
        for(AbstractResource resource : getResources()) exp += resource.calcExp();

        return exp;
    }
}
