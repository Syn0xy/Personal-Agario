package engine.game;

import java.util.Comparator;

public class VisionCellComparator implements Comparator<Cell>{
    public int compare(Cell a, Cell b){
        return Double.compare(a.getSize(), b.getSize());
    }
}