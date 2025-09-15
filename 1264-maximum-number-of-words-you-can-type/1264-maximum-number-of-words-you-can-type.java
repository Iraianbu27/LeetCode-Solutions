class Solution {
    public int canBeTypedWords(String text, String broken) {
        boolean[] b = new boolean[26];
        int res = 0;

        for (char c : broken.toCharArray()) {
            b[c - 97] = true;
        }

        String[] words = text.split(" ");
        for (String w : words) {
            boolean ok = true;
            for (char c : w.toCharArray()) {
                if (b[c - 97]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res = res + 1;
            }
        }

        return res;
    }
}