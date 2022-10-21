--yorum satırı
--SQL veriyi sorgulama dilidir. Structured Query Language
--SELECT * FROM Customers; customerdan seç
--ANSII standartları
--sql case insensitive kdjdbv = KDjDbv
--statements or and 
-- <> o ifadeden farklı 


--ascending artan
--descending azalan

SELECT * FROM Customers; 
SELECT ContactName Adi, CompanyName SirketAdi, City Sehir from Customers;
select * from Customers where City = 'Berlin'
select * from products where categoryID = 1
select * from products where categoryID = 1 or categoryId = 3      
select * from products where categoryID= 1 and unitPrice <> 10

-- order by kendinden sonra gelene göre veriyi listeler.
select * from Products order by Product Name
select * from Products order bu unitPrice desc


Select count(*) from products where CategoryID = 2


select * from Products where category= 1 order by unitPrice desc

select count(*) Adet from products 
--Group by gruplama
--groupby yapıldığında her bir grup için arkada bir tablo oluşturulduğu düşünülebilir.
select from products group by CategoryID

--kaç sütun kaç column var?
select count(*) Adet from Products
Select categoryID, count(*) from products group by CategoryID

--Birim fiyatı 10 dan az ürünleri listele
-- görev gerçeleştirimi kümülatif data odaklı devam eder. bu yüzden "having count(*)<10
select categoryID , count(*) from products where unitPrice > 20 group by CategoryID having count(*)<10
-- ! where her zaman ilk çalışır.
-- Veri tabanı tasarımı yapılırken kendimizi tekrar etmemek için tablo ilişkilendirme kullanılır. bu yüzd4en birleştirmekte "join" kullanılır.
-- "on" neyin nesine göre sıralanacağı yapılır.
-- * tüm columns
--DTO data transformation object                                                                               

select* from products inner join Categories on Products.CategoryId = categories.categoryId
--inner join sadece eşleşenleri tabloya getirir.

select * from Products inner join [Order Details] on product.productID = [Order Details].productID
--Kısaltma kullanmak istersek tanıtmamı gerekir. 
select * from Products p inner join [Order Details] od on p.productID = od.productID
--! köşeli parantez arada boşluk olduğundan, tablo ismi olarak almasını istediğimizden kullanırız.

--"left" yazıma göre solda olup sağda olmayanları da getir. inner artı sadece sağda olanlar
select * from Products p left join [Order Details] od on p.productID = od.productID
select * from Customers c left join orders o on c.customerID = o.customerID where o.custemerID is null
-- primary key null olmayacağından customer.customerID kullanılır.
--left komutunu aynısı "right" komutu içinde kullanılır.

--ikiden fazla tabloyu join etmek istersek
select * from Products p left join [Order Details] od on p.productID = od.productID
inner join Orders
on o.orderID == od.orderID
--Notes
-- Bir manager sınıfın içinde başka bir manager sınıfı kullanılacaksa newlenmez. interface in constructer ını  kullan.