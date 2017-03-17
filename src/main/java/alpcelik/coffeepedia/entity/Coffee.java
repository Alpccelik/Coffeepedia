package alpcelik.coffeepedia.entity;

import com.sun.istack.internal.Nullable;

/**
 * Created by alp on 12/03/17.
 */
public class Coffee {
    private int coffeeid;
    private String Coffeename;
    private boolean Milkinside;
    private String Coffeekind;



    public Coffee(int coffeeid, String coffeename, String coffeekind, boolean milkinside) {
        this.coffeeid = coffeeid;
        Coffeename = coffeename;
        Coffeekind = coffeekind;
        Milkinside= milkinside;

    }

    public Coffee(){};

    public int getCoffeeid() {
        return coffeeid;
    }

    public void setCoffeeid(int coffeeid) {
        this.coffeeid = coffeeid;
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
