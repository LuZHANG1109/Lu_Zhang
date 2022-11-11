package Q1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String A=sc.nextLine();
        int m=sc.nextInt();
        sc.nextLine();
        String B=sc.nextLine();
        if(n<m){
            System.out.println("No");
        }
        String[] As=A.split(" ");
        String[] Bs=B.split(" ");
        int[] cmpA=new int[As.length];
        int[] cmpB=new int[Bs.length];
        // System.out.println(As.length);
        // System.out.println(Bs.length);
        for(int i=0;i<As.length;i++){
            if(As[i].substring(As[i].length()-1)=="S"){
                cmpA[i]=0;
                
            }else if(As[i].substring(As[i].length()-1)=="M"){
                cmpA[i]=1;
            }else{
                cmpA[i]=2;
                
            }
        }
        for(int i=0;i<Bs.length;i++){
            if(Bs[i].substring(Bs[i].length()-1)=="S"){
                cmpB[i]=1;
                
            }else if(Bs[i].substring(Bs[i].length()-1)=="M"){
                cmpB[i]=2;
            }else{
                cmpB[i]=3;
                
            }
        }

        Arrays.sort(cmpA);
        Arrays.sort(cmpB);
        boolean flg=true;
        for(int i=Bs.length-1;i>=0;i++){
            System.out.println(i);
            System.out.println(i+Bs.length-As.length);
            if(cmpA[i+As.length-Bs.length]<cmpB[i]){
                flg=false;
                break;
            }
        }
        // for(int i=0;i<As.length;i++){
        //     if(As[i].substring(-1)=="S"){
                
        //         cmpA[i]+=Integer.toString(As[i].length()-1);
        //     }else if(As[i].substring(-1)=="L"){
                
        //         cmpA[i]+=Integer.toString(As[i].length()-1);
        //     }
        // }
        // for(int i=0;i<Bs.length;i++){
        //     if(Bs[i].substring(-1)=="S"){
                
        //         cmpB[i]+=Integer.toString(Bs[i].length()-1);
        //     }else if(Bs[i].substring(-1)=="L"){
                
        //         cmpB[i]+=Integer.toString(Bs[i].length()-1);
        //     }
        // }
        if(!flg){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }



        

    }
}