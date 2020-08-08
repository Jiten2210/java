package code.design_pattern.behavioral.iterator;

public class IteratorPatternMain {
    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer();

        for(Iterator iter = cricketPlayer.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Player Name : " + name);
        }
    }
}
