# JavaEE 8 – Çok Modüllü Maven Projesi

Bu projede Maven ile iki modül geliştirildi:

1️⃣ **q1-exception-chain:** Exception zinciri oluşturulup `CustomException` ile sarılarak SLF4J ile `output/error.log` dosyasına yazılır.  
2️⃣ **q2-annotation-scan:** Özel `@Food` ve `@Time` anotasyonları tanımlanır, sınıflar yansıma (reflection) ile taranıp anotasyon bilgileri alınır.

Her modülde `MainClass` sınıfı çalıştırılabilir olarak tanımlanmıştır. Hibernate kullanılarak MySQL veritabanı her çalışmada yeniden oluşturulur.
