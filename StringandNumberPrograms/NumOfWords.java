/* Simple program to calculate the number of words in a sentence. */
class NumOfWords {
    public static void main(String[] args) {
        String s = " How many    words are    in this sentence? ";
        String str = s.trim().toUpperCase() + " ";
        System.out.print(s + " " + str);
        int i = 1, cnt = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
                cnt++;
            i++;
        }
        System.out.println("Counting done");
        String arr[] = new String[cnt];
        for (int j = 0; j < cnt; j++)
            arr[j] = "";
        int num = 0;
        String temp = "";
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ' ' && str.charAt(j - 1) != ' ') {
                num++;
                temp = "";
            } else if (str.charAt(j) != ' ') {
                temp = arr[num] + "" + String.valueOf(str.charAt(j));
                arr[num] = temp;
            }
        }
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("Number of words are = " + arr.length);
    }
}
