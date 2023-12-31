package GUI;

import javax.swing.*;

public class metroGUI {
    static double bakiye = 0.0;

    public static void main(String[] args) {

        int secim = 0;

        do {
            String strSecim = JOptionPane.showInputDialog("1- Kart bakiyesini göster"
                    + "\n2- Karta para yükle"
                    + "\n3- Metroya bin"
                    + "\n4- Sistemden çıkış");

            secim = Integer.valueOf(strSecim);

            switch (secim) {
                case 1:
                    bakiyeGoster();
                    break;
                case 2:
                    kartaBakiyeYukle();
                    break;
                case 3:
                    metroyaBin();
                    break;
                case 4:
                    sistemdenCikis();
                    break;
                default:
                    System.out.println("Seçim yanlış. Tekrar seçiniz!");
            }
        } while (secim != 4);
    }

    private static void sistemdenCikis() {
        JOptionPane.showMessageDialog(null, "Güle Güle");
        System.exit(0);
    }

    private static void metroyaBin() {

        String aboneSecimSTR = JOptionPane.showInputDialog("Abone durumuzunu seçiniz: \t\n1- İndirimli Bilet \t\n2- Tam Bilet");
        int aboneSecim = Integer.valueOf(aboneSecimSTR);

        if (aboneSecim == 1) {
            JOptionPane.showMessageDialog(null, "İndirimli Bilet! Metroya Hoşgeldiniz!");

            if (bakiye < 7.50) {
                JOptionPane.showMessageDialog(null, "Yetersiz bakiye! Öncelikle bakiye yükleyiniz!");
            } else {
                bakiye -= 7.50;
            }
        } else if (aboneSecim == 2) {

            if (bakiye < 15.00) {
                JOptionPane.showMessageDialog(null, "Yetersiz bakiye! Öncelikle para yükleyiniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Tam Bilet! Metroya Hoşgeldiniz!");
                bakiye -= 15.00;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hatalı seçim. Tekrar deneyiniz!");
            metroyaBin();
        }
    }

    private static void kartaBakiyeYukle() {

        String yuklenecekBakiye = JOptionPane.showInputDialog("Yüklemek istediğiniz miktarı giriniz: ");
        bakiye += Double.valueOf(yuklenecekBakiye);
        bakiyeGoster();
    }

    private static String bakiyeGoster() {

        String bakiyeStr = "Bakiyeniz: " + bakiye + " TL";
        JOptionPane.showMessageDialog(null, bakiyeStr);
        return bakiyeStr;
    }
}