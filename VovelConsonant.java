import java.util.Scanner;
public class VovelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ccount=0;
        int vcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vcount++;
            }else{
                ccount++;
            }
        }
        System.out.println("vowel"+vcount);
        System.out.println("consonent"+ccount);
    }
}
