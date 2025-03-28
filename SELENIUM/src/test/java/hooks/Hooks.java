ChromeOptions options = new ChromeOptions();
options.addArguments("--headless"); // Menjalankan tanpa GUI
options.addArguments("--disable-gpu"); // Opsional, untuk beberapa sistem operasi
options.addArguments("--window-size=1920,1080"); // Opsional, agar resolusi tetap stabil

driver = new ChromeDriver(options);
