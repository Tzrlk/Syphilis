package nz.co.aetheric.syphilis.persist.enumerations;

import org.springframework.data.annotation.Reference;

public class MagePathBean {
    String name;
    @Reference MageArcanaBean primary1;
    @Reference MageArcanaBean primary2;
    @Reference MageArcanaBean inferior;
}
