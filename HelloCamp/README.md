
# GÜN 1

<br>

#### ÖRNEK 1-1
```java

    String internetBranch = "İnternet Şubeye gir";

    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
    System.out.println(internetSubesi);
```

<br><br>

#### ÖRNEK 1-2
```java
    double dlrYesterday = 8.20;
    double dlrToday = 8.20;
    int maturity = 36;
    boolean dlrFell = true;

    if(dlrYesterday < dlrToday){
        System.out.println("Dolar Yükseldi");
    }else if(dlrYesterday > dlrToday){
        System.out.println("Dolar Düştü");
    }
    else{
        System.out.println("Dolar Aynı");
    }
```

<br><br>


#### ÖRNEK 1-3
```java
    String kredit1 = "hızlı Kredi";
    String kredit2 = "Mıtlu Emekli Kredisi";
    String kredit3 = "Konut Kredisi";
    String kredit4 = "Çiftçi Kredisi";
    String kredit5 = "Msb Kredisi";
    
    
    System.out.println(kredit1);
    System.out.println(kredit2);
    System.out.println(kredit3);
    System.out.println(kredit4);
    System.out.println(kredit5);
    
    
    String[] allKredits = 
    {
        "hızlı Kredi",
        "Mıtlu Emekli Kredisi",
        "Konut Kredisi",
        "Çiftçi Kredisi",
        "Msb Kredisi"
    }; 
    
    for(String kredit : allKredits){
        System.out.println(kredit);
    }
    
    for(int i = 0 ; i < allKredits.length ; i++){
        System.out.println(allKredits[i]);
    }
```

<br><br>

#### ÖRNEK 1-4

```java
    int value1 = 10;
    int value2 = 20;
    value1 = value2;
    value2 = 100;
    System.out.println(value1);
    
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {10,20,30,40,50};
    array1 = array2;
    array2[0] = 100;
    System.out.println(array1[0]);
```
<br>

### Değişkenlerimiz bellekte 2 farklı şekilde tutulur 
1. Değer tipleri : örnek int string boolean float ...
    Değer tipleri ataram yapılırken değişkenin o anlık değeri atama esnasında aktarılır ardından hiçbir işlem yapılmaz
2. Referans tipleri : örnek dizi, sınıf, interface abstract class...
    Referans tipleri atama yapılırken o değişken tanımlamasının bellekteki adresi aktarılır bu nedenle Atama yapılan değişkenlerdeki değişiklik değişkenin bellek adresinde yapıldığı için atama yapılan de yapılan değişiklik aktarılır.

##### Stringler istisnai durum içerir Stringler arka planda karakter dizisi olarak tutulsa da Yeni geliştirilen java sürümlerinde bu işlemler için String özel olarak değer tip kapsamına alınmıştır.
