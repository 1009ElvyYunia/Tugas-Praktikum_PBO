# Tugas-Praktikum_PBO
Elvy Yunia 222410101009_ Kelas B
//1
 Ryzen ryzen = new Ryzen("RAYZEN");
 Amd amd = new Amd("AMD");
 Laptop laptop2 = new IdeaPad(amd, ryzen);
 Console.WriteLine("\n ========== laptop2 ==========");
 laptop2.LaptopDinyalakan();
 laptop2.LaptopDimatikan();
 //2

 Nvidia nvdia = new Nvidia("Nvidia");
 Corei5 core5 = new Corei5("Core i5");
 Laptop laptop1 = new Vivobook(nvdia, core5);
 Console.WriteLine("========== laptop1 ==========");
 //laptop1.Ngoding();

 //soal 3
 
 Console.WriteLine("========== laptop1 ==========");
 Console.WriteLine($"Merk VGA : {laptop1.vga} ");
 Console.WriteLine($"Processor : {laptop1.processor.merk}");
 Console.WriteLine($"Tipe : {laptop1.processor} ");

 //soal 4
Corei7 core7 = new Corei7("Core i7");
 Predator predator = new Predator(amd, core7);
 Console.WriteLine("\n ========== predator ==========");
 predator.BermainGame();

 //soal5
 ACER acer = new Predator(amd, ryzen);
 //acer.BermainGame();
