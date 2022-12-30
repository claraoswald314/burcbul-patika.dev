import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       int month, day;
       Scanner input = new Scanner(System.in);
       System.out.println("kaçıncı ayda doğdunuz? " );
       month=input.nextInt();
       System.out.println("ayın kaçında doğdunuz? ");
       day = input.nextInt();

       if(month==1 && 1<=day  && day<=21){
           System.out.println("burcunuz oğlak");
       }else if(month==1 && 22<=day  && day<=31){
           System.out.println("burcunuz kova");
       }else if(month==2 && 1<=day  && day<=19){
           System.out.println("burcunuz kova");
       }else if(month==2 && 20<=day  && day<=29){
           System.out.println("burcunuz balık");
       }else if(month==3 && 1<=day  && day<=20){
           System.out.println("burcunuz balık");
       }else if(month==3 && 21<=day  && day<=31){
           System.out.println("burcunuz koç");
       }else if(month==4 && 1<=day  && day<=20){
           System.out.println("burcunuz koç");
       }else if(month==4 && 21<=day  && day<=30){
           System.out.println("burcunuz boğa");
       }else if(month==5 && 1<=day  && day<=21){
           System.out.println("burcunuz boğa");
       }else if(month==5 && 22<=day  && day<=31){
           System.out.println("burcunuz ikizler");
       }else if(month==6 && 1<=day  && day<=22){
           System.out.println("burcunuz ikizler");
       }else if(month==6 && 23<=day  && day<=30){
           System.out.println("burcunuz yengeç");
       }else if(month==7 && 1<=day  && day<=22){
           System.out.println("burcunuz yengeç");
       }else if(month==7 && 23<=day  && day<=31){
           System.out.println("burcunuz aslan");
       }else if(month==8 && 1<=day  && day<=22){
           System.out.println("burcunuz aslan");
       }else if(month==8 && 23<=day  && day<=30){
           System.out.println("burcunuz başak");
       }else if(month==9 && 1<=day  && day<=22){
           System.out.println("burcunuz başak");
       }else if(month==9 && 23<=day  && day<=30){
           System.out.println("burcunuz terazi");
       }else if(month==10 && 1<=day  && day<=22){
           System.out.println("burcunuz terazi");
       }else if(month==10 && 23<=day  && day<=31){
           System.out.println("burcunuz akrep");
       }else if(month==11 && 1<=day  && day<=21){
           System.out.println("burcunuz akrep");
       }else if(month==11 && 22<=day  && day<=30){
           System.out.println("burcunuz yay");
       }else if(month==12 && 1<=day  && day<=21){
           System.out.println("burcunuz yay");
       }else if(month==12 && 22<=day  && day<=30){
           System.out.println("burcunuz oğlak");
       }



    }
}
