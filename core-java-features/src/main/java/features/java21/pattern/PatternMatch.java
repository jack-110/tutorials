package features.java21.pattern;

import features.java17.sealed.Celestial;
import features.java17.sealed.Comet;
import features.java17.sealed.Planet;
import features.java17.sealed.Star;

public class PatternMatch {

    public String decide(Celestial celestial) {
        switch (celestial) {
            case null -> {
                return null;
            }
            case Comet comet
                when comet.equals(new Comet()) -> {
                return comet.toString();
            }
            case Comet comet -> {
                return comet.toString();
            }
            case Planet planet -> {
                return planet.toString();
            }
            case Star star -> {
                return star.toString();
            }
        }
    }
}
