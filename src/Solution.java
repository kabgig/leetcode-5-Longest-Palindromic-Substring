class Solution { // "abb"
    public String longestPalindrome(String s) {
        String res = "";
        String temp = "";
        if (s.length() <= 1) return s;
        int iL, iR;
        for (int i = 1; i < s.length(); i++) {
            iR = i;
            iL = i - 1;
            res = checkPal(s, res, temp, iL, iR);
        }
        if (s.length() >= 3) {
            for (int i = 1; i < s.length(); i++) {
                temp = String.valueOf(s.charAt(i));
                iR = i + 1;
                iL = i - 1;
                res = checkPal(s, res, temp, iL, iR);
            }
        }
        if (res.length() == 0) return String.valueOf(s.charAt(0));
        return res;
    }

    private static String checkPal(String s, String res, String temp, int iL, int iR) {
        while (iL >= 0 && iR < s.length()) {
            if (s.charAt(iL) == s.charAt(iR)) {
                temp = s.charAt(iL) + temp + s.charAt(iR);
                iL -= 1;
                iR += 1;
            } else break;
        }
        if (temp.length() > res.length()) res = temp;
        return res;
    }
}