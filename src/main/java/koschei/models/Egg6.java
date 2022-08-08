package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    public Needle7 getNeedle() {
        return needle;
    }

    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }
}
