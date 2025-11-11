# Todolist
# 🚀 Konsol Tabanlı Yapılacaklar Listesi Yöneticisi (Java)

## Proje Tanıtımı

Bu proje, temel Java programlama bilgimi, basit kullanıcı etkileşimini ve temel veri yapısı yönetimini sergilemek amacıyla, staj başvurusu sürecimde hazırladığım konsol (terminal) tabanlı basit bir Yapılacaklar Listesi (To-Do List) uygulamasıdır.

Uygulama, kullanıcıdan konsol üzerinden komutlar alarak görevleri ekleme, listeleme ve silme işlemlerini gerçekleştirir.

## ✨ Temel Özellikler

* **Görev Ekleme:** Yeni bir yapılacak maddeyi listeye ekleyebilme.
* **Görev Listeleme:** Mevcut tüm görevleri numaralandırılmış bir formatta ekrana basma.
* **Görev Silme:** Kullanıcının girdiği sıra numarasına göre listeden bir görevi çıkarma.
* **Hata Kontrolü:** Silme işleminde geçersiz veya sayısal olmayan girişleri yakalama (Try-Catch mantığı olmasa bile temel if/else kontrolü ile).

## 💻 Kullanılan Teknolojiler

* **Dil:** Java (JDK 17 veya üzeri önerilir)
* **Geliştirme Ortamı:** Eclipse IDE
* **Veri Yapısı:** `java.util.ArrayList` (Görevleri dinamik olarak depolamak için)
* **Girdi Yönetimi:** `java.util.Scanner` (Konsol girdisini okumak için)

## 🛠️ Nasıl Çalıştırılır?

Projenin yerel makinenizde çalıştırılması için aşağıdaki adımları takip edebilirsiniz:

1.  **Projeyi İndirme (Clone):**
    ```bash
    git clone [Sizin GitHub Proje URL'niz Buraya Gelecek]
    ```
2.  **Eclipse'te Açma:**
    * Eclipse IDE'yi açın.
    * `File (Dosya) > Import (İçe Aktar) > General > Existing Projects into Workspace (Çalışma Alanına Mevcut Projeler)` seçeneğini kullanın.
    * `Select root directory (Kök dizin seç)` kısmından indirdiğiniz `StajBasvuruTodoApp` klasörünü seçin.
3.  **Uygulamayı Başlatma:**
    * `Package Explorer` içinde `src/com.stajbasvuru.app/TodoListManager.java` dosyasını bulun.
    * Dosyaya sağ tıklayıp **Run As > Java Application** seçeneği ile çalıştırın.

## 📌 Lisans

Bu proje, herhangi bir resmi lisansa tabi değildir. Staj başvurusu amacıyla geliştirilmiştir ve kişisel portföyde kullanılabilir.

---
