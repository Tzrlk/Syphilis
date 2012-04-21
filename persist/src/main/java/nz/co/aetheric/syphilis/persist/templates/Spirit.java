package nz.co.aetheric.syphilis.persist.templates;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Spirit extends AbstractTemplate {
    Integer rank;

    Integer power;
    Integer finesse;
    Integer resistance;

    Integer essence_capacity;

    @Override
    public Integer calcExp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
