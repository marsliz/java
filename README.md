## Armstrong Sayısı
[Java](https://github.com/marsliz/java/blob/master/ArmstrongSayisi.java) - [Python](https://github.com/marsliz/python/blob/master/armstrong_sayisi.py)

Bir sayının her bir basamağının, sayının basamak sayısı kadar kuvvetinin alınıp toplanmasıyla elde edilen sonuç kendisine eşitse bu sayı bir Armstrong sayısıdır.

Örnek:
- abc = a^3 + b^3 + c^3
- abcd = a^4 + b^4 + c^4 + d^4
- 407 = 4^3 + 0^3 + 7^3 = 407

## Kaprekar Sayıları
[Java](https://github.com/marsliz/java/blob/master/KaprekarSayilari.java) - [Python](https://github.com/marsliz/python/blob/master/kaprekar_sayilari.py)

Kaprekar sayıları, 1949 yılında Hint matematikçi Kaprekar (1905-1986) tarafından tariflenen sayılardır. 

n basamaklı bir t sayısının karesi alınıp sağdaki n basamağı solda kalan n veya n-1 basamağa ekleyince sonuç yine t sayısını verir. Bu sayılara kaprekar sayıları denir.

Örnek: 
- 55, iki basamaklı bir sayıdır.
- 55x55=3025, sağdan iki basamak 25, soldan iki basamak 30.
- Bu iki sayının toplamı 30+25=55 yani sayının kendisidir.

1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4879 sayıları da diğer bazı Kaprekar sayılarıdır.

Kaynak : [Kaprekar sayıları](https://tr.wikipedia.org/wiki/Kaprekar_sayıları)

## Kaprekar Sabiti
[Java](https://github.com/marsliz/java/blob/master/Kaprekar_Sabiti.java) - [Python](https://github.com/marsliz/python/blob/master/kaprekar_sabiti.py)

Kaprekar tarafından tanımlanan, dört basamaklı sayılara en fazla yedi kez aşağıdaki işlemler uygulandığında ortaya çıkan sabit 6174 sayısı.

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
