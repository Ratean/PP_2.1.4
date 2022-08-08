package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Island2 {

    @Autowired
    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }

    public Wood3 getWood() {
        return wood;
    }

    public void setWood(Wood3 wood) {
        this.wood = wood;
    }
}
