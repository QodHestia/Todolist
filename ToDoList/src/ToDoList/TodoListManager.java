package ToDoList;

import java.util.ArrayList; 
import java.util.Scanner;   

public class TodoListManager { // <-- 1. Sınıf açılış parantezi

    // Global listeleri ve Scanner'ı tanımlıyoruz.
    private static ArrayList<String> gorevListesi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // <-- 2. main metodu açılış parantezi
        System.out.println("--- Yapılacaklar Listesi Yönetimine Hoş Geldiniz! ---");
        boolean calisiyor = true;
        
        while (calisiyor) {
            System.out.println("\nLütfen bir işlem seçin:");
            System.out.println("1. Görevleri Listele");
            System.out.println("2. Yeni Görev Ekle");
            System.out.println("3. Görev Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            String secim = scanner.nextLine(); 

            switch (secim) {
                case "1":
                    gorevleriListele();
                    break;
                case "2":
                    gorevEkle();
                    break;
                case "3":
                    gorevSil();
                    break;
                case "4":
                    calisiyor = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen 1 ile 4 arasında bir numara girin.");
            }
        }
        
        System.out.println("Uygulamadan çıkılıyor. İyi günler dileriz!");
        scanner.close(); 
    } // <-- 2. main metodu kapanış parantezi

    /**
     * Mevcut görev listesini ekrana basar.
     */
    private static void gorevleriListele() { // <-- 3. gorevleriListele açılış parantezi
        if (gorevListesi.isEmpty()) {
            System.out.println("--- Görev listeniz boş. Hiçbir şey yapmadan durmak harika! ---");
            return;
        }
        
        System.out.println("\n--- YAPILACAKLAR LİSTESİ ---");
        for (int i = 0; i < gorevListesi.size(); i++) {
            System.out.println((i + 1) + ". " + gorevListesi.get(i));
        }
        System.out.println("----------------------------\n");
    } // <-- 3. gorevleriListele kapanış parantezi

    /**
     * Kullanıcıdan yeni görev alır ve listeye ekler.
     */
    private static void gorevEkle() { // <-- 4. gorevEkle açılış parantezi
        System.out.print("Lütfen eklenecek görevi yazın: ");
        String yeniGorev = scanner.nextLine(); 
        gorevListesi.add(yeniGorev); 
        System.out.println("'" + yeniGorev + "' listeye eklendi!");
    } // <-- 4. gorevEkle kapanış parantezi

    /**
     * Kullanıcıdan silinecek görevin numarasını alır ve listeden siler.
     */
    private static void gorevSil() { // <-- 5. gorevSil açılış parantezi
        gorevleriListele();
        
        if (gorevListesi.isEmpty()) {
            return;
        }

        System.out.print("Silmek istediğiniz görevin numarasını girin: ");
        
        if (scanner.hasNextInt()) {
            int silinecekNo = scanner.nextInt();
            scanner.nextLine();
            
            int index = silinecekNo - 1;
            
            if (index >= 0 && index < gorevListesi.size()) {
                String silinenGorev = gorevListesi.remove(index);
                System.out.println("'" + silinenGorev + "' listeden silindi!");
            } else {
                System.out.println("Hata: Geçersiz görev numarası girdiniz.");
            }
        } else {
            System.out.println("Hata: Lütfen sadece bir sayı girin.");
            scanner.nextLine();
        }
    } // <-- 5. gorevSil kapanış parantezi
    
} // <-- 1. Sınıf kapanış parantezi