/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsys;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.util.ArrayList;

/**
 *
 * @author MACHINE
 */
public class People implements Observer {
    
    String Name;
    int ID;
    
    People(String Name)
    {
        this.Name = Name;
    }
    public void update(Object obj)
    {
        
    }
    
    public void checkNotification(ArrayList<Vote> V)
    {
        for(int i=0;i<V.size();i++)
        {
            if(V.get(i).VotersName==this.Name)
            {
                System.out.println("New Notification");
            }
        }
    }
    
    public void CastVote(ArrayList<Candidate> C)
    {
        DisplayCanList(C);
    }
   
    private void DisplayCanList(ArrayList<Candidate> C)
    {
        
    }
}
