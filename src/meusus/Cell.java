package meusus;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cell extends JButton{
    
    private Date date;
    private boolean title;
    
    public Cell() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    
    public void asTitle(){
        title=true;
    }
    
    public boolean isTitle() {
        return title;
    }
    
    public void currentMonth(boolean act){
        if(act) {
            setForeground(new Color());
        }else{
            setForeground(new Color());            
        }
    }
}
