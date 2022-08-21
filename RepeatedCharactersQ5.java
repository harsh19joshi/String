import java.util.Scanner;
public class RepeatedCharactersQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        //int count=0;
        for(int i=0;i<s1.length();i++){
            int count=0;
            for (int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    s2+=s1.charAt(i);
                }
            }
            //System.out.println(s1.charAt(i)+":"+count+" ");
        }
        System.out.println(s2);
    }
}
