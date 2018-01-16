/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptest;

/**
 *
 * @author elliott
 */
public class JpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String s = "1199";
        String ans = strings(s);

        System.out.println(ans);
    }

    public static String strings(String s) {
        s = ("000000000" + s);

        int[] numArr = stringBreak(s);

        String postName[] = {"Million", "Thousand", ""};
        String ans = "";

        for (int i = 0; i < 3; i++) {
            if (numArr[i] > 0) {
                if (numArr[i] >= 100) {
                    ans += getSingles((int) (numArr[i] / 100)) + "Hundred";
                }
                int tens = numArr[i] % 100;
                if (tens >= 20) {
                    ans += getOverTwenty(tens - tens % 10) + getSingles(tens % 10);
                } else {
                    ans += getSingles(tens);
                }
                ans += postName[i];
            }

        }

        return ans;
    }

    public static int[] stringBreak(String s) {
        s = s.substring(s.length() - 9);
        String[] arr = new String[]{s.substring(0, 3), s.substring(3, 6), s.substring(6)};
        int[] numArr = new int[3];
        for (int i = 0; i < 3; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        return numArr;
    }

    public static String getSingles(int h) {
        switch (h) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return "Err";
        }
    }

    public static String getOverTwenty(int m) {
        switch (m) {
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return "Fourty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";
            default:
                return "Err";
        }
    }
}
