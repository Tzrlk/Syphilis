package nz.co.aetheric.syphilis.persist;

import org.springframework.data.annotation.Id;

import java.util.Date;

public abstract class AbstractEntity {
    @Id Long id;
    Long version;
    Date dateCreated;
    Date lastUpdated;

    public abstract Integer calcExp();
}