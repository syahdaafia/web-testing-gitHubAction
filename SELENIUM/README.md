# 🖥️ Selenium UI Testing - Saucedemo  

Repositori ini berisi pengujian otomatisasi UI untuk situs **Saucedemo** menggunakan **Selenium WebDriver** dan **Cucumber**.  

🔗 **Link Website:** [Saucedemo](https://www.saucedemo.com/)  

## 📌 Deskripsi Proyek  

Proyek ini bertujuan untuk mengotomatiskan pengujian UI pada situs **Saucedemo** menggunakan **Selenium WebDriver** dengan **Cucumber** sebagai kerangka kerja BDD. Pengujian ini mencakup:  
- **Login** dengan berbagai kombinasi kredensial.  
- **Menambahkan produk** ke keranjang belanja.  
- **Menghapus produk** dari keranjang belanja.  

## 📂 Struktur Proyek  

Proyek ini memiliki beberapa folder utama:  

```
📦 saucedemo-ui-testing-automation  
├── 📂 src  
│   ├── 📂 main  
│   │   ├── 📂 java  
│   │   │   ├── 📂 org.syahdaafia.pages  # Page Object Model (POM)
│   │   │   │   ├── 📄 LoginPage.java  # Halaman login, menangani input & tombol login
│   │   │   │   ├── 📄 InventoryPage.java  # Halaman produk & keranjang belanja
│   │   ├── 📂 resources  # Folder untuk menyimpan resource tambahan
│   │   │   ├── 📄 driver.exe  # WebDriver untuk menjalankan browser (misalnya, ChromeDriver)
│   ├── 📂 test  
│   │   ├── 📂 java  
│   │   │   ├── 📂 hooks  # Konfigurasi sebelum & sesudah pengujian
│   │   │   │   ├── 📄 Hooks.java  # Setup dan teardown WebDriver
│   │   │   ├── 📂 runners  # Eksekusi pengujian dengan Cucumber
│   │   │   │   ├── 📄 TestRunner.java  # Konfigurasi eksekusi Cucumber
│   │   │   ├── 📂 stepdefinitions  # Implementasi langkah-langkah dari file .feature
│   │   │   │   ├── 📄 LoginSteps.java  # Step definitions untuk login
│   │   │   │   ├── 📄 InventorySteps.java  # Step definitions untuk cart functionality
│   │   ├── 📂 resources  
│   │   │   ├── 📂 features  # File skenario pengujian Gherkin
│   │   │   │   ├── 📄 login.feature  # Skenario pengujian login
│   │   │   │   ├── 📄 inventory.feature  # Skenario pengujian cart
└── 📄 pom.xml  # Konfigurasi Maven untuk dependensi Selenium, Cucumber, JUnit, dll.
```

## 🚀 Cara Menjalankan Pengujian UI  

### 1️⃣ Persiapan  
Pastikan sudah menginstal:  
- **Java 8+**  
- **Maven**  
- **Google Chrome**  

### 2️⃣ Clone Repositori  
Clone repositori ke sistem lokal:  
```sh
git clone https://github.com/username/saucedemo-selenium.git
cd saucedemo-selenium
```

### 3️⃣ Konfigurasi WebDriver  
Pastikan `driver.exe` (misalnya, `chromedriver.exe`) tersedia di **src/main/resources**. Jika perlu, unduh versi terbaru dari [ChromeDriver](https://chromedriver.chromium.org/downloads) dan simpan di lokasi yang sesuai.

### 4️⃣ Build dan Jalankan Pengujian  
Jalankan perintah berikut untuk mengeksekusi pengujian dengan Maven:  
```sh
mvn clean test
```
Perintah ini akan menjalankan semua skenario pengujian dan menampilkan hasilnya di terminal.

## 📌 Tes yang Dilakukan  

### 🔹 **Login Tests**  
✅ Menguji login dengan kredensial yang valid.  
✅ Menguji login dengan kombinasi username dan password yang tidak valid.  

### 🔹 **Cart Functionality Tests**  
✅ Memverifikasi item pada cart bertambah ketika menekan tombol "add to cart".  
✅ Memverifikasi item pada cart bertambah ketika menekan tombol "add to cart" pada lebih dari satu barang.  
✅ Memverifikasi item pada cart berkurang ketika menekan tombol "remove".  

## 📌 Teknologi yang Digunakan  

- **Selenium WebDriver** → Mengontrol browser secara otomatis.  
- **Cucumber** → Menulis skenario pengujian dalam format BDD.  
- **JUnit** → Menjalankan pengujian dan validasi hasil.  
- **Java 8+** → Bahasa pemrograman utama dalam proyek ini.  
- **Maven** → Manajemen dependensi dan eksekusi pengujian.  
