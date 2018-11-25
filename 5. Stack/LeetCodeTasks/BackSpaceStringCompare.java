class Solution {
    public boolean backspaceCompare(String S, String T) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (char ch : S.toCharArray()
                ) {
            if (ch != '#') {
                list.add(ch);
            } else {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                }
            }
        }
        for (char ch : T.toCharArray()
                ) {
            if (ch != '#') {
                list2.add(ch);
            } else {
                if (list2.size() > 0) {
                    list2.remove(list2.size() - 1);
                }
            }


        }
        return list.equals(list2);
    }
}