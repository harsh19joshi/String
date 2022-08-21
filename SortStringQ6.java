import java.util.Scanner;
public class SortStringQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char temp;
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for (int j=i+1;j< ch.length;j++){
                if (ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]= temp;
                }
            }
        }
        System.out.println(new String(ch));
    }
}
