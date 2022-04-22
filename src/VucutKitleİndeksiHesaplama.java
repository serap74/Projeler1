import java.text.DecimalFormat;
import java.util.Scanner;

public class VucutKitleİndeksiHesaplama {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        double kilo = s.nextFloat();
        System.out.println("Boyunuzu giriniz (cm cinsinden): ");
        double boy = s.nextInt();
        double vki = kilo/Math.pow(boy/100,2);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Vücut kitle indexiniz: "+df.format(vki));
        System.out.println("Durumunuz: ");
        if(vki<=18.5){
            System.out.println("Zayıf");
            System.out.println(df.format(18.5*Math.pow(boy/100,2)-kilo)+" Kilogram almanız gerekiyor"); }
        else if(vki<=24.9){
            System.out.println("Normal"); }
        else if(vki<=29.9){
            System.out.println("Fazla kilolu");
            System.out.println(df.format(kilo-24.9*Math.pow(boy/100,2))+" Kilogram vermeniz gerekiyor");
        }
        else if(vki<=39.9){
            System.out.println("Obez");
            System.out.println(df.format(kilo-24.9*Math.pow(boy/100,2))+" Kilogram vermeniz gerekiyor"); }
        else {
            System.out.println("Aşırı obez");
            System.out.println(df.format(kilo - 24.9 * Math.pow(boy / 100, 2)) + " Kilogram vermeniz gerekiyor"); }

    }
}
