## Kaprekar Sabiti
[Java](https://github.com/marsliz/java/blob/master/Kaprekar_Sabiti.java) - [Python](https://github.com/marsliz/python/blob/master/kaprekar_sabiti.py)

Hint matematikçi Kaprekar (1905-1986) tarafından tanımlanan, dört basamaklı sayılara en fazlayedi kez aşağıdaki işlemler uygulandığında ortaya çıkan sabit 6174 sayısı.

İşlemler, tüm basamakları aynı sayıdan oluşmayan (2222 gibi - ilk adımda sıfır sonucunu verecektir) ve herhangi üç basamağındaki sayılar aynı olup kalan bir basamaktaki sayı bu sayıdan bir büyük ya da bir küçük olmayan (1112, 5565 veya 8788 gibi - ilk adımda 999 sayısını verecektir) dört basamaklı sayılara uygulandığında en fazla yedi adımda sıfır veya 6174 sabit sayısını verir.

1. Yukarıdaki şartlara uygun dört basamaklı bir sayı alınır.
2. Sayının basamaklarını büyükten küçüğe ve küçükten büyüğe doğru sıralayarak iki adet dört basamaklı sayı elde edilir.
3. Elden edilen sayılardan büyük olan küçük olandan çıkarılır.
4. İkinci adım tekrar edilir.

En fazla yedi adımda sıfır ya da 6174 sabit sayısı elde edilecek ve kısır döngüye girilecektir.

Örnek: 7811 sayısını ele alalım.
- 8711 - 1178 = 7533
- 7533 - 3357 = 4176
- 7641 - 1467 = 6174
- 7641 - 1467 = 6174

Kaynak : [Kaprekar sabiti](https://tr.wikipedia.org/wiki/Kaprekar_sabiti)
