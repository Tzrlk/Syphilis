package nz.co.aetheric.syphilis.persist.templates;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vampire extends AbstractTemplate {
    Integer blood_potency;

    Integer blood_capacity;

    @Override
    public Integer calcExp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
