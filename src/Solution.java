class Solution { // "babad"
    public String longestPalindrome(String s) {
        String res = "";
        String temp = "";
        if (s.length() <= 1) return s;
        int iL, iR;
        if (s.length() % 2 == 0) {
            iL = 0;
            iR = 1;
        } else {
            iL = 1;
            iR = 1;
        }
        while (iL >= 0 && iR < s.length()) {
            if (s.charAt(iL) == s.charAt(iR)) {
                temp = s.charAt(iL) + temp + s.charAt(iR);
                iL -= 1;
                iR += 1;
            } else break;
        }


        return res;
    }
}