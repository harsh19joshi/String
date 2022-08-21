import java.util.Scanner;
public class AnagramQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        //String s2="";
        char temp;
        char[]ch= s1.toCharArray();
        for(int i=0;i< ch.length;i++){
            for(int j=i+1;j< ch.length;j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        char[]ch1= s2.toCharArray();
        for(int i=0;i< ch1.length;i++){
            for(int j=i+1;j< ch1.length;j++) {
                if (ch1[i] > ch1[j]) {
                    temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
            }
        }
        int n=new String(ch).compareTo(new String(ch1));
        if(n==0){
            System.out.println("Anagram");
        }else {
            System.out.println("not anagram");
        }

        //System.out.println(s2);
    }
}
