package Programming;
import java.util.ArrayList;

class Subsets {
    public static void main(String[] args) {
        ArrayList<Integer> superSet = new ArrayList<Integer>();
        superSet.add(1);
        superSet.add(2);
        superSet.add(3);
        superSet.add(4);
        ArrayList<ArrayList<Integer>> lists = Subsets.getSubsets(superSet);
        System.out.println("final set ==> " + lists);
    }

    static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> SubList) {
        if (SubList.size() > 0) {
            ArrayList<ArrayList<Integer>> list = addToList(SubList.remove(0),
                    SubList);
            return list;
        } else {
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            list.add(SubList);
            return list;
        }
    }

    private static ArrayList<ArrayList<Integer>> addToList(
            Integer firstElement, ArrayList<Integer> SubList) {
        ArrayList<ArrayList<Integer>> listOfLists = getSubsets(SubList);
        ArrayList<ArrayList<Integer>> superList = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> iList : listOfLists) {
            superList.add(new ArrayList<Integer>(iList));
            iList.add(firstElement);
            superList.add(new ArrayList<Integer>(iList));
        }
        return superList;
    }
}