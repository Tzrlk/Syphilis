package nz.co.aetheric.syphilis.persist.resources;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Legacy extends AbstractResource {
    List<Attainment> attainments;

    @Override
    public Integer calcExp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static class Attainment {
        List<String> prerequisites;
        String description;
    }
}