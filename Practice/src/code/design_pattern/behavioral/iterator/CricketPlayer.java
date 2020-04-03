package code.design_pattern.behavioral.iterator;

public class CricketPlayer implements Container {

    @Override
    public Iterator getIterator() {
        return new CricketPlayerIterator();
    }

    private class CricketPlayerIterator implements Iterator {

        public String cricketerNames[] = {"Dhoni", "Kohli", "Bumrah", "De Villiers", "Williamson"};
        int i;

        @Override
        public boolean hasNext() {
            if (i < cricketerNames.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return cricketerNames[i++];
            }
            return null;
        }
    }

}
