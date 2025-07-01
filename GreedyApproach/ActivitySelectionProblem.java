package GreedyApproach;

import java.util.*;

class Activity{
    int start,end;
    Activity(int s,int e){
        start =s;
        end=e;
    }
}

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        Activity[] activities = {
        new Activity(1,3),
        new Activity(2,4),
        new Activity(3,5),
        new Activity(0, 6),
        new Activity(5, 7),
        new Activity(8, 9)
        };
        Arrays.sort(activities,Comparator.comparingInt(a-> a.end));
        int count=1;
        int prevEnd = activities[0].end;
        for (int i = 1; i<activities.length;i++){
            if(activities[i].start>=prevEnd){
                count++;
                prevEnd = activities[i].end;
            }
        }
        System.out.println("Number of activities to be selected = " + count);
    }
}
