package Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> err=new ArrayList<>();
        boolean isValid=true;
        for(int i=0;i<n;i++){
            String line=sc.nextLine();
            String[] params=line.split(" ");
            if(params[1].equals("false")){
                isValid=false;
                err.add(params[2]);
            }
        }
        if(isValid){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            for(String i:err){
                System.out.print(i+" ");
            }
        }
    }
}
