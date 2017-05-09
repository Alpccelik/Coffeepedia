package alpcelik.coffeepedia.entity;

import com.sun.istack.internal.Nullable;

/**
 * Created by alp on 12/03/17.
 */
public class Coffee {
    private Integer id;
    private String Coffeename;
    private boolean Milkinside;
    private String Coffeekind;


    public Coffee(Integer id, String coffeename, String coffeekind, boolean milkinside) {
        this.id = id;
        this.Coffeename = coffeename;
        this.Coffeekind = coffeekind;
        this.Milkinside = milkinside;

    }

    public Coffee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoffeename() {
        return Coffeename;
    }

    public void setCoffeename(String coffeename) {
        Coffeename = coffeename;
    }

    public String getCoffeekind() {
        return Coffeekind;
    }

    public void setCoffeekind(String coffeekind) {
        Coffeekind = coffeekind;
    }
    @Nullable
    public boolean isMilkinside() {
        return Milkinside;
    }
    @Nullable
    public void setMilkinside(boolean milkinside) {
        Milkinside = milkinside;
    }
}
