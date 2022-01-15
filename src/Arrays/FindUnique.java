package Arrays;
//https://www.codingninjas.com/codestudio/problems/find-unique_625159?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTab=0
public class FindUnique {
    public static int findUnique(int[] arr){
        //Your code goes here
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
