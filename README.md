# PDF Özgeçmiş Oluşturucu (Java + iText 7)

Bu proje, Java dili ve iText 7 kütüphanesi kullanılarak geliştirilen basit bir PDF özgeçmiş oluşturma uygulamasıdır. Amaç, kullanıcıların manuel olarak hazırlamak yerine, Java kodu aracılığıyla profesyonel görünümlü bir özgeçmiş (CV) dosyası oluşturmasını sağlamaktır.

## Proje Amacı
Uygulama, PDF dosyası oluşturmayı ve biçimlendirmeyi öğretmekle birlikte, iText kütüphanesinin temel yeteneklerini göstermeyi amaçlar. Kullanıcı bilgileri, iş deneyimleri ve yetenekler düzenli bir formatta PDF çıktısı olarak kaydedilir.

## Kullanılan Teknolojiler
- Java 17 veya üzeri  
- iText 7 (PDF oluşturma kütüphanesi)  
- Maven (bağımlılık yönetimi aracı)

## Kurulum ve Çalıştırma
1. Projeyi IntelliJ IDEA veya benzeri bir IDE ile açın.  
2. `resources` klasörüne `profil.jpg` adında bir fotoğraf ekleyin. (Fotoğraf bulunmazsa uygulama hata vermez, sadece boş geçer.)  
3. `OzGecmisPdfGenerator.java` dosyasını çalıştırın.  
4. Çalıştırma tamamlandığında proje dizininde `Burhan_Kocak_CV.pdf` adlı bir PDF dosyası oluşacaktır.

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
```
## Özellikler

Başlık kısmında isim, unvan ve fotoğraf bölümü bulunur.

Profil özeti, iletişim bilgileri, eğitim, iş deneyimleri ve yetenekler düzenli bir biçimde eklenmiştir.

Tablo yapısı kullanılarak profesyonel bir düzen sağlanmıştır.

Hata durumlarında kullanıcıyı bilgilendiren mesajlar gösterilir.

Kod yapısı sade, okunabilir ve geliştirilebilir olacak şekilde düzenlenmiştir.

## Geliştirme Önerileri

Kullanıcıdan bilgileri terminal veya bir arayüz aracılığıyla alıp dinamik olarak PDF’e ekleme.

CV’ye renkli tasarım, kenarlık veya ikonlar ekleme.

Birden fazla dil seçeneği (örneğin Türkçe ve İngilizce) desteği ekleme.

Tarih, imza veya QR kod alanı gibi ek bilgiler ekleme.

## Geliştirici

Burhan Koçak
E-posta: burhankocakym@gmail.com

GitHub: github.com/burhankocak

