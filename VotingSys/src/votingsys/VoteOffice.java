/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsys;

import java.util.ArrayList;

/**
 *
 * @author MACHINE
 */
public class VoteOffice implements Subject {
    
    private ArrayList<Vote> AllVotes;
    private ArrayList<Observer> Obs;
    public ArrayList<Candidate> Can;
    public VoteOffice()
    {
        AllVotes = new ArrayList<>();
        Obs = new ArrayList<>();
        Can = new ArrayList<>();
    }
    
    public void AddVote(Vote E)
    {
        AllVotes.add(E);
        Notify();
    }
    
    public void Attach(Observer O)
    {
        Obs.add(O);
    }
    
    public void Dettach(Observer O)
    {
        Obs.remove(O);
    }
    
    public void Notify()
    {
        for (int i=0;i<Obs.size();i++)
        {
            Obs.get(i).update(this);
        }
    }
}
