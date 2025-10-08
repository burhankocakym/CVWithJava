# Özgeçmiş PDF Oluşturucu (Java + iText 7)

Bu proje, Java dili ve iText 7 kütüphanesi kullanılarak hazırlanan basit bir PDF özgeçmiş oluşturucu uygulamasıdır.  
Amaç, yazılım mühendisliği öğrencilerinin kodlama yoluyla kendi profesyonel özgeçmişlerini oluşturabilmesini sağlamaktır.

---

## Proje Amacı
Bu uygulama, manuel olarak CV hazırlamak yerine Java kullanarak dinamik bir PDF dosyası oluşturmayı öğretir.  
Ayrıca iText kütüphanesiyle PDF oluşturma, tablo ve paragraf biçimlendirme konularında temel deneyim kazandırır.

---

## Kullanılan Teknolojiler
- Java 17+
- iText 7 (PDF oluşturma)
- Maven (bağımlılık yönetimi)

---

## Kurulum ve Çalıştırma

1. Projeyi IntelliJ IDEA veya benzeri bir IDE’ye açın.  
2. `resources` klasörüne `profil.jpg` isimli bir fotoğraf ekleyin. (Fotoğraf eklemezseniz kod uyarı verir ama hata vermez şekilde düzenlenmiştir.)  
3. `OzGecmisPdfGenerator.java` dosyasını çalıştırın.  
4. Çalıştırma tamamlandığında proje dizininde `Burhan_Kocak_CV.pdf` adlı dosya oluşacaktır.

---

## Gerekli Maven Bağımlılıkları
```xml
<dependencies>
    <dependency>
        <groupId>com.itextpdf</groupId>
        <artifactId>kernel</artifactId>
        <version>7.1.15</version>
    </dependency>

    <dependency>
        <groupId>com.itextpdf</groupId>
        <artifactId>layout</artifactId>
        <version>7.1.15</version>
    </dependency>
</dependencies>

## Özellikler

Başlık kısmında isim, unvan ve fotoğraf bulunur.

Profil özeti, iletişim bilgileri, eğitim, iş deneyimi ve yetenek bölümleri eklenmiştir.

Tablo düzeniyle profesyonel bir görünüm sağlanmıştır.

Hata durumlarında açıklayıcı mesajlar verilmiştir.

Geliştirme Fikirleri

Kullanıcıdan terminal aracılığıyla bilgileri alıp dinamik olarak PDF’e ekleme.

CV’ye renkli tema veya ikonlar ekleme.

Türkçe ve İngilizce olarak iki dilde PDF üretme.

## Geliştirici

Burhan Koçak
Yazılım Mühendisliği Öğrencisi - Kırklareli Üniversitesi
E-posta: kcakburhan@gmail.com

GitHub: github.com/burhankocak

Bu proje eğitim amaçlı hazırlanmıştır. Geliştirmeye ve kişisel kullanım için uyarlamaya açıktır.
