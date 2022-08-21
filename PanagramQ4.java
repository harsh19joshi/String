import java.util.Scanner;
public class PanagramQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=sc.nextInt();
        String s2="";
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++){
            char x= s1.charAt(i);
            if((s1.charAt(i)>='a' && s1.charAt(i)<='z') ){
                b[x-'a']=true;
            }else if ((s1.charAt(i)>='A' && s1.charAt(i)<='Z')){
                b[x-'A']=true;
            }
        }
        for (int i=0;i<n;i++) {
            if (b[i] == true) {
                s2 = "panagram";
            } else {
                s2 = "not panagram";
            }
        }
    }
}
