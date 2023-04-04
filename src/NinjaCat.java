import java.awt.*;

public class NinjaCat extends Tiger {

    public boolean hasInfected;

    public NinjaCat (){
        hasInfected=false;
    }

    public Color getColor() {
        if (hasInfected){
            return Color.yellow;
        } else {
            return Color.MAGENTA;
        }

    }

    public String toString() {
        if (hasInfected){
            return "NC";
        } else {
            return "nc";
        }
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        //same as Tiger, but changes color when has infected
        return super.getMove(info);
    }
}
