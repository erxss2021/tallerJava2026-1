package services;

import java.util.PriorityQueue;
import java.util.Queue;

import models.EmergencyCase;
import utils.EmergencyComparator;

public class EmergencyService {

    private final Queue<EmergencyCase> cases;

    public EmergencyService() {
        cases = new PriorityQueue<>(new EmergencyComparator());
    }

    public boolean registerCase(EmergencyCase case1){
        return cases.offer(case1);
    }

    public EmergencyCase nextPatient(){
        return cases.peek();
    }

    public EmergencyCase attendPatient(){
        return cases.poll();
    }

    public int pendientPatients(){
        return cases.size();
    }

    public void processAllPatients(){
        while (!cases.isEmpty()) {
            EmergencyCase case1 = cases.poll();
            System.out.println("Atendiendo -> " + case1);
        }
    }


    

}
