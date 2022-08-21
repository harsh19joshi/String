import java.util.Scanner;
public class AnagramQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        int low=0;
        int high=s1.length()-1;
        String s2="";
        while(low<high){
            if(s1.charAt(low)==s1.charAt(high)){
                s2="Anagram";
            }else{
                s2="Not Anagram";
            }
            low++;
            high--;
        }
        System.out.println(s2);
    }
}
