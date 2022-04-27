package Okul_Projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String,String> ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("=============== YILDIZ KOLEJİ ===================\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            tercih=scan.nextLine();
            switch(tercih){
                case "1" ://Ogretmenler Listesi Yazdir
                    ogretmenListesiYazdir();

                    break;
                case "2" :// Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();

                    break;
                case "3" ://Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4" ://Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5" ://Kimlik No Ile Kayit Silme
                   tcNoİleOgretmenSil();
                case "a" :
                case "A" :
                    Depo.anaMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz");
            }








        }while(!tercih.equalsIgnoreCase("q"));
        Depo.ProjeyiDurdur();
    }

    public static void tcNoİleOgretmenSil() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();

        String silinecelValue=ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue=ogretmenlerMap.remove(silinecekOgretmen);


        try {
            boolean sonuc=sonucValue.equals(silinecelValue);
        } catch (Exception e) {
            System.out.println("İstediginiz tc no ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("Tc no ");
        String tcNo=scan.nextLine();
        System.out.println("isim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.nextLine();
        System.out.println("dogum yili");
        String dogumYili=scan.nextLine();
        System.out.println("Brans");
        String brans=scan.nextLine();

        String eklenecekValue=isim + ", " + soyisim + ", " + dogumYili + ", " + brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);




    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Arradiginiz ogretmenin bransini giriniz");

        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("=============== YILDIZ KOLEJİ ===================\n" +
                "=======BRANS İLE  OGRETMEN ARAMA ============\n" +
                "Tckno     Isim  Soyisim  D.Yili   Brans");
        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuArr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuArr[3])){
                System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey, eachValuArr[0], eachValuArr[1],
                        eachValuArr[2], eachValuArr[3]);
            }
        }
        Thread.sleep(5000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Arradiginiz ogretmenin soyismini giriniz");

        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("=============== YILDIZ KOLEJİ ===================\n" +
                "=======SOYİSİM İLE  OGRETMEN ARAMA ============\n" +
                "Tckno     Isim  Soyisim  D.Yili   Brans");
        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuArr[] = eachValue.split(", ");
           if (istenenSoyisim.equalsIgnoreCase(eachValuArr[1])){
               System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey, eachValuArr[0], eachValuArr[1],
                       eachValuArr[2], eachValuArr[3]);
           }
        }
        Thread.sleep(5000);








    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        System.out.println(ogretmenlerMap);
        Set<Map.Entry<String,String >> ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("=============== YILDIZ KOLEJİ ===================\n" +
                "=========== OGRETMEN LİSTESİ ============\n" +
              "Tckno     Isim  Soyisim  D.Yili   Brans");
        for (Map.Entry<String,String> each:ogretmenEntrySet
             ) {
            String eachKey = each.getKey();
            String eachValue=each.getValue();

           String eachValuArr[]=eachValue.split(", ");
            System.out.printf("%11s %-6s %-8s %4s %s \n" , eachKey,eachValuArr[0],eachValuArr[1],
                    eachValuArr[2],eachValuArr[3]);
        }
        Thread.sleep(5000);
    }
}
