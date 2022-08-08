package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    private Deth8 deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }

    public Deth8 getDeth() {
        return deth;
    }

    public void setDeth(Deth8 deth) {
        this.deth = deth;
    }
}
