import java.io.*;
import java.util.*;



class LB1{

    public static void main(String arg[]){
        int i=0,j=0,iSum=0;
        
        Scanner sobj=new Scanner(System.in);
            System.out.println("Enter the Rows");
            int iRow=sobj.nextInt();
            System.out.println("Enter the Column");
            int iCol=sobj.nextInt();

       int Arr[][]=new int[iRow][iCol];
         
       System.out.println("Enter the elements");
       for(i=0;i<Arr.length;i++){
        for(j=0;j<Arr[i].length;j++){
            Arr[i][j]=sobj.nextInt();


        
       }

    }
    for(i=0;i<Arr.length;i++){

       for(j=0;j<Arr[i].length;j++){

        if(i==j){
            iSum=iSum+Arr[i][j];

        }
       }
    }
    System.out.println("Addition is "+iSum);
}
}


