package com.sridhar.code.library.hard.graphs;

import java.util.*;

public class ReconstructItinerary {
    Map<String, LinkedList<String>> adjacency = new HashMap<>();
    LinkedList<String> path = new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> srcDests : tickets) {
            String src = srcDests.get(0);
            String dest = srcDests.get(1);

            if(adjacency.containsKey(src))
                adjacency.get(src).push(dest);
            else {
                LinkedList<String> temp = new LinkedList<>();
                temp.push(dest);
                adjacency.put(src, temp);
            }
        }
        adjacency.forEach((key, value) -> Collections.sort(value));
        recursive("JFK");
        return path;
    }

    public void recursive(String origin) {
        if(adjacency.containsKey(origin)) {
            LinkedList<String> dests = adjacency.get(origin);

            while(!dests.isEmpty()) {
                String dest = dests.poll();
                recursive(dest);
            }
        }
        path.offerFirst(origin);
    }

}
