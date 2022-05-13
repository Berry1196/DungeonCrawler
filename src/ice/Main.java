package ice;

import encounter.Encounter;
import encounter.StoryProgressor;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        //Story story = new Story();
        //story.mapOne();
        Queue<Encounter> q = new LinkedList<>();

        q.add(new StoryProgressor("Welcome to the world Calderan"));
        while(!q.isEmpty()){
            q.poll().resolve();
        }
    }

}
