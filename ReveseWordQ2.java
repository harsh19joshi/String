import java.util.Scanner;
public class ReveseWordQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        String s4="";
        int count=0;
        String[] s3=s1.split(" ");
        for (int i=0;i<=s3.length-1;i++){
            s2=s3[i]+" ";
            for(int j=s2.length()-1;j>=0;j--){
                s4+=s2.charAt(j);

            }

        }
        System.out.println(s4.toLowerCase());
    }
}
