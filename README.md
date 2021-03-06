
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

<br><br>

# GÜN 2

<br>

### 2 farklı sınıf tanımlaması yapılabilir. 
###    - Özellik Sınıfı
###    - İş Sınıfı 
#### Başlangıçta iki adet Özellik sınıfı oluşturuyoruz ve bu sınıflara özelliklerini ekliyoruz.

```java
public class Product {
    
    int id;
    String name;
    double unit_price;
    String detail;
}
```

<br>

```java
public class Category {
    int id;
    String name;
}
```

#### Daha sonra klasik yöntem olarak bu sınıflardan istediğimiz kadar referans oluşturabiliyoruz.

<br>

```java

Product product1 = new Product(); // Referans oluşturma / instance
    product1.id = 1;
    product1.name = "Lenovo V14";
    product1.unit_price = 15000;
    product1.detail = "16 GB Ram";
    
    Product product2 = new Product();
    product2.id = 2;
    product2.name = "Lenovo V15";
    product2.unit_price = 20000;
    product2.detail = "32 GB Ram";
        
    Product product3 = new Product();
    product3.id = 3;
    product3.name = "Hp 5";
    product3.unit_price = 10000;
    product3.detail = "8 GB Ram";

    Category category1 = new Category();
    category1.id = 1;
    category1.name = "Bilgisayar";
    
    Category category2 = new Category();
    category2.id = 1;
    category2.name = "Ev/Bahçe";
}

```

<br>

#### Oluşturduğumuz bu referanslara biz nesne diyoruz artık bu nesnelerin özellikleri ile ilgili istediğimiz işlemi gerçekleştirebiliriz. Örneğin seçilen bir nesnenin özelliklerini ekrana yazdıralım.

<br>

```java
System.out.println(product.id + " -- " + product.name + " -- "+ product.unit_price + " -- "+ product.detail);

```

<br>

![image](https://user-images.githubusercontent.com/52778108/117725810-5f0dba00-b1ee-11eb-8279-7db095e956d1.png)

<br>

#### Oluşturulan tüm nesnelerin özelliklerini tek seferde yazdırmak için bütün nesneleri bir bütün halinde dolaşmamız gerekiyor bunun için dizi kullanacağız.

<br>

```java
Product[] products = {
    product1,  
    product2,  
    product3  
};


for(Product product : products){
    System.out.println(product.id + " -- " + product.name + " -- "+ product.unit_price + " -- "+ product.detail);
}

Category[] categorys = {category1,category2};

for(Category category : categorys){
    System.out.println(category.id + " -- " + category.name);
}

```
<br>

![image](https://user-images.githubusercontent.com/52778108/117727245-73eb4d00-b1f0-11eb-9e85-f0210af471a6.png)

<br>

#### Şimdi de nesnelerimizi parametre yardımı ile başlatcağız. Bunun için Özellik sınıflarımıza constructor metodlarını tanımlayacağız.

<br>

```java
public class Product {
    
    int id;
    String name;
    double unit_price;
    String detail;

    public Product() {
        System.out.println("Bu sınıf oluşturuldu");
    }
    
    public Product(int id, String name, double unit_price, String detail) {
        //this(); eğer bir sınıf başlatılırken birden fazla constructor çağırılmasını istersek bu yöntemi kullanabiliriz.
        this.id = id;
        this.name = name;
        this.unit_price = unit_price;
        this.detail = detail;
    }
}
```
<br>

```java
public class Category {
    int id;
    String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```
<br>

#### Eklediğimiz constructor metodları ile artık nesne oluşturma işlemlerimizi daha basit bir şekilde yapabileceğiz.

<br>

```java
Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram"); 
Product product2 = new Product(2,"Lenovo V15",20000,"32 GB Ram"); 
Product product3 = new Product(3,"Hp 5",10000,"8 GB Ram"); 

Category category1 = new Category(1,"Bilgisayar");
Category category2 = new Category(2,"Ev/Bahçe");
```
<br>

#### Şimdi de bir adet İş sınıfı oluşturuyoruz

<br>

```java
public class ProductManager {
    
    public void addToCart(Product product){
        System.out.println(product.name + " Sepete eklendi");
    }
    
}
```

<br>

```java
ProductManager manager = new ProductManager();
manager.addToCart(product1);
manager.addToCart(product2);
manager.addToCart(product3);
```
<br>

![image](https://user-images.githubusercontent.com/52778108/117737070-b8331900-b201-11eb-86e6-b2b8304da7fa.png)

