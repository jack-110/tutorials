package features.java17.pattern;

import features.java17.sealed.Celestial;
import features.java17.sealed.Comet;

public class Earth {

    public String decide(Object celestial) {
        switch (celestial) {
            case Integer comet -> {
                return "Comet";
            }
            default -> throw new IllegalStateException("Unexpected value: " + celestial);
        }
    }
}
