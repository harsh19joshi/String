import java.util.Scanner;
public class CountSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                continue;
            }else if (s.charAt(i)>0 && s.charAt(i)<=9){
                continue;
            }else {
                count++;
            }
        }
        System.out.println("spcial charecter:"+count);
    }
}
