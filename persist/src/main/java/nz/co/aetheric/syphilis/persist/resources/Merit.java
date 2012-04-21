package nz.co.aetheric.syphilis.persist.resources;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Merit extends AbstractResource {
    @Override
    public Integer calcExp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
