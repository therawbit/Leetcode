class Solution {
  public boolean hasSameDigits(String s) {
    while (s.length() > 2) {
      StringBuilder newString = new StringBuilder();
      for (int i = 0; i <= s.length() - 2; i++) {
        int a = Character.getNumericValue(s.charAt(i));
        int b = Character.getNumericValue(s.charAt(i + 1));
        int c = (a + b) % 10;
        newString.append(c);
      }
      s = newString.toString();
    }
    return s.charAt(0) == s.charAt(1);
  }
}
