
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class TitleLastAndMagnitudeComparitor implements Comparator<QuakeEntry>{
   
    
    public TitleLastAndMagnitudeComparitor() {
        
    }
    
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String title1 = q1.getInfo();
        String title2 = q2.getInfo();
        
        String[] q1Words = title1.split("\\W+");
        String[] q2Words = title2.split("\\W+");
        
        String lastWord1 = q1Words[q1Words.length-1];
        String lastWord2 = q2Words[q2Words.length-1];
        
        if (lastWord1.compareTo(lastWord2) < 0)
            return -1;
        
         if (lastWord1.compareTo(lastWord2) > 0)
           return 1;
        
        if (q1.getMagnitude() < q2.getMagnitude())
            return -1;
        
        if(q1.getMagnitude() > q2.getMagnitude())
            return 1;
        
        return 0;
    }
}

