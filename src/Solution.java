class Solution { // "abb"
    public String longestPalindrome(String s) {
        String res = "";
        String temp = "";
        if (s.length() <= 1) return s;
        int iL, iR;
//-----
        for (int i = 1; i < s.length(); i++) {
            if (s.length() % 2 == 0) {
                iR = i;
                iL = i - 1;
            } else {
                temp = String.valueOf(s.charAt(i));
                iR = i + 1;
                iL = i - 1;
            }
            while (iL >= 0 && iR < s.length()) {
                if (s.charAt(iL) == s.charAt(iR)) {
                    temp = s.charAt(iL) + temp + s.charAt(iR);
                    iL -= 1;
                    iR += 1;
                } else break;
            }
            if (temp.length() > res.length()) res = temp;
            temp = "";
        }
        //-----
        for (int i = 1; i < s.length(); i++) {
            if (s.length() % 2 == 0) {
                iR = i;
                iL = i - 1;
            } else {
                temp = String.valueOf(s.charAt(i));
                iR = i + 1;
                iL = i - 1;
            }
            while (iL >= 0 && iR < s.length()) {
                if (s.charAt(iL) == s.charAt(iR)) {
                    temp = s.charAt(iL) + temp + s.charAt(iR);
                    iL -= 1;
                    iR += 1;
                } else break;
            }
            if (temp.length() > res.length()) res = temp;
            temp = "";
        }
        //------

        if(res.length() == 0) return String.valueOf(s.charAt(0));

        return res;
    }
}