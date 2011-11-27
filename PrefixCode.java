public class PrefixCode {
/*
 * goodplus has submitted the 250-point problem for 197.47 points
 */
  public String isOne(String[] words) {
    int position = Integer.MAX_VALUE;
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      for (int j = 0; j < words.length; j++) {
        if (i == j)
          continue;
        String testWord = words[j];
        boolean isOne = testWord.startsWith(word);
        if (isOne) {
          position = Math.min(i, position);
        }
      }
    }
    String resultString = String.format("No, %d", position);
    return position != Integer.MAX_VALUE ? resultString : "Yes";
  }

}
