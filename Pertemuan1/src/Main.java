//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//////        int a;
//////        int b;
//////        int c;
////
////        int a, b , c;
//////        int a = 4;
//////        int b = 6;
//////        int c = a + b;
////        a = 4;
////        b = 6;
////        c = a + b;
////
//////        String result;
//////        result = "Hasil penjumlahan adalah ";
////        String result = "Hasil penjumlahan adalah ";
//
////        System.out.println(result + c);
//
////        int p, l, t, volume;
////        p = 58;
////        l = 88;
////        t = 7;
////        volume = p*l*t;
////
////        String result = "Hasil dari volume balok adalah ";
////        System.out.println(result + volume);
//
////        int pa,t,luassegitiga;
////        pa = 98;
////        t = 57;
////        luassegitiga = (pa*t/2);
////
////        String result = "Hasil dari luas segitiga adalah ";
////        System.out.println(result + luassegitiga);
////        int alas = 98;
////        int tinggi = 57;
////
////        double result = alas*tinggi*1/2; // karena berurutan maka hasil tidak 0
//////        double result = 1/2*alas*tinggi; // karena berurutan maka dihitung 1 dibagi 2 dulu
////
////        System.out.println(result);
//
////        int galon;
////        galon = 10;
////
////        double result = galon*3.7854;
//
//
////        System.out.println("Masukkan jumlah galon: ");
////        Scanner scan = new Scanner(System.in); // untuk input nilai
////        int galon = scan.nextInt(); //next Int karena yg dibutuhksn int kalo bool ya nextboll dll
////        float liter = 3.7854f;
////
//////        int galon = 10;
////        float result = liter*galon;
////        String keterangan = "Hasil konversinya adalah ";
////
//////        // perbedaan println dengan printf
//////        System.out.println(keterangan + "harus make tanda petik dua" + result); // harus menyertakan + dan "" untuk menambahkan inputan
//////        System.out.printf("%s bisa string bisa int  %.3f", keterangan, result); // inputan hanya disisipkan kedalam "" diawal perintah saja, apabila mau ngeprint dibawah printf harus ditambahkan \n agar hasilnya ke enter
////        System.out.println(keterangan + result);
//
//
////        Scanner scan = new Scanner(System.in); // cukup dengan scanner satu bisa untuk meng input beberapa nilai
//////
////        System.out.println("Input nama: ");
////        String Nama = scan.nextLine();
////
////        System.out.println("Input usia: ");
////        int usia = scan.nextInt();
////
////        System.out.println("Input IPK: ");
////        double IPK = scan.nextDouble();
////
////        System.out.println("Input Status Pernikahan: ");
////        boolean Status = scan.nextBoolean();
////
////
////        System.out.println("Nama: " + Nama);
////        System.out.println("Usia: " + usia);
////        System.out.println("IPK: " + IPK);
////        System.out.println("Status Pernikahan: " + Status);
////
////        if (usia < 13) {
////            System.out.println("Sdr " + Nama + " Anak-anak");
////        } else if (usia < 18) {
////            System.out.println("Sdr " + Nama + "Remaja ");
////        } else {
////            System.out.println("Sdr " + Nama + " Dewasa");
//
////         switch case hanya untuk membandingkan 1 kondisi
////        int a = 2, b = 1, c;
////
////        c = a + b;
////        switch (c){
////            case 1:
////                System.out.println("case 1");
////                break;
////            case 2:
////                System.out.println("case 2");
////                break;
////            case 3:
////                System.out.println("case 3");
////                break;
////            default:
////                System.out.println("default");
//// math as
////        int a = 5, b = 2;
////        int c = (a<=b) ? a:b; // a itu True nya dan b itu False nya
////        int d = (a==b) ? a:b;
////        System.out.println("c = " + c);
////        System.out.println("d = " + d);
//
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Nama Siswa: ");
////        String Nama = scan.nextLine();
////        System.out.println("Nilai Matematika: ");
////        int nilaimath = scan.nextInt();
////        System.out.println("Nilai IPA: ");
////        int nilaiipa = scan.nextInt();
////        System.out.println("Nilai Bahasa Indonesia: ");
////        int nilaibin = scan.nextInt();
////        System.out.println("Nilai Bahasa Inggris: ");
////        int nilaibing = scan.nextInt();
////
////        double result = (nilaimath+nilaiipa+nilaibin+nilaibing)/4;
////
////        System.out.println("Nama Siswa: " + Nama);
////        System.out.println("Nilai Matematika: " + nilaimath);
////        System.out.println("Nilai IPA: " + nilaiipa);
////        System.out.println("Nilai Bahasa Indonesia: " + nilaibin);
////        System.out.println("Nilai Bahasa Inggris: " + nilaibing);
////
////        if (result > 50){
////            System.out.println(Nama + " mendapatkan nilai rata-rata " + result + ", dan dinyatakan lulus" );
////        } else{
////            System.out.println(Nama + " mendapatkan nilai rata-rata " + result + ", dan dinyatakan tidak lulus" );
////        }
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Masukkan Angka 1: ");
////        int angka1 = scan.nextInt();
////        System.out.println("Masukkan Angka 2: ");
////        int angka2 = scan.nextInt();
////
////        if (angka1 % 2 == 0){
////            System.out.println(angka1 + " merupakan angka genap ");
////        } else {
////            System.out.println(angka1 + " merupakan angka ganjil ");
////        }
////        if (angka2 % 2 == 0){
////            System.out.println(angka2 + " merupakan angka genap ");
////        } else {
////            System.out.println(angka2 + " merupakan angka ganjil ");
////        }
////
////        if (angka1 >= 0){
////            System.out.println(angka1 + " merupakan angka positif ");
////        } else {
////            System.out.println(angka1 + " merupakan angka negatif ");
////        }
////        if (angka2 >= 0){
////            System.out.println(angka2 + " merupakan angka positif ");
////        } else {
////            System.out.println(angka2 + " merupakan angka negatif ");
////        }
////        System.out.println("Jumlah digit angka pertama: " + String.valueOf(angka1).length());
////        System.out.println("Jumlah digit angka kedua: " + String.valueOf(angka2).length());
////
////        int selisih = Math.abs(angka1 - angka2);
////        System.out.println("Selisih kedua angka: " + selisih);
////        Scanner scan = new Scanner(System.in){
////            System.out.println("Masukkan Angka 1: ");
////            int angka1 = scan.nextInt()
////        }
////        }
//
//// Pertemuan 3
////        int[] numbers = new int[5];
////        numbers[0] = 1;
////        numbers[1] = 2;
////        numbers[2] = 3;
////        numbers[3] = 4;
////        numbers[4] = 5;
////
////        int total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
////        System.out.println(total);
////
////        char[] nama = new char [5];
////        nama[0] = 'B';
////        nama[1] = 'e';
////        nama[2] = 'l';
////        nama[3] = 'd';
////        nama[4] = 'a';
////
////        System.out.println("" + nama[0] + nama[1] + nama[2] + nama[3] + nama[4]);
////
////        ArrayList<Integer> number = new ArrayList<Integer>();
////        number.add(10);
////        number.add(4);
////        number.add(3);
////        number.remove(1);
////        number.remove(Integer.valueOf(4));
////        System.out.println(number.get(0));
////        System.out.println(number.get(0));
////
//
////        ArrayList<String> students = new ArrayList<String>();
////        students.add("Belda");
////        students.add("Pramono");
////        students.add("Putri");
////        students.remove(1);
////        System.out.println(students.get(1));
////
//
////// batasan array menggunakan size
////
////        System.out.println("Pertama");
////        for (int a = 0; a<5; a+=3){
////            System.out.println(a);
////        }
////
////        System.out.println("Kedua");
////        int a = 0;
////        while (a<5){
////            System.out.println(a);
////            a+=2;
////        }
////
////        System.out.println("Ketiga");
////        for (int i = 2; i<=10; i+=2){
////            System.out.println(i);
////        }
//
////
////        System.out.println("Keempat");
////        int i = 2;
////        while (i<=10){
////            System.out.println(i);
////            i+=2;
////        }
//
////        int index = 0;
////        for (int i = 2; i<=10; i+=2){
////            angka[index] = i+2;
////            System.out.println(angka[index]);
////            index++;
////        }
//
////        int i = 2;
////        while(i<10){
////            System.out.println(i);
////            i+=2;
////        }
//
////// Yang ini di print dulu
////        do{
////            System.out.println(i);
////            i+=2;
////        }while (i<10);
////
////        int[] angka = new int[5];
////        for (int i = 0; i<5; i++){
////            angka[i] = (i+1)*2
////        }
////        for (int i=0; i<5; i++){
////
////        }
//
////        char[] characters = {'B','e','l','d','a'};
////        System.out.println(characters);
////        char[] bakso = {'B','a', 'k','S','o','o'};
////        System.out.println(bakso);
//
//
////        int i,factorial=1;
////        int number = 8;
////        for(i=1;i<=number;i++){
////            factorial = factorial*i;
////        }
////        Latihan Soal Nomor 1
////        for(int j=1;j<=5;j++){
////            System.out.println(j);
////        }
////
////        int i = 1;
////        while (i<=5){
////            System.out.println(i);
////            i++;
////        }
////
////        do {
////            System.out.println(i);
////            i++;
////        }while(i<5);
////        Latihan Nomor 2
//
////        Latihan Nomor 3
////        String name = "baKSoo";
////        String name = "baKSoo";
////        char array1[] = new char[name.length()]; // Mendeklarasikan array karakter dengan panjang yang sama dengan panjang string 'name'
////        for(int b = 0; b < name.length(); b++){ // Melakukan iterasi sepanjang panjang string 'name'
////            array1[b] = name.charAt(b); // Menyimpan setiap karakter dari string 'name' ke dalam array 'array1'
////        }
////        System.out.println(Arrays.toString(array1)); // Mencetak array 'array1' ke dalam bentuk string
////
////        String nama = "";
////        for(int b = 0; b < name.length(); b++){ // Melakukan iterasi sepanjang panjang string 'name'
////            nama = nama + array1[b]; // Menggabungkan setiap karakter dari array 'array1' ke dalam string 'nama'
////        }
////        System.out.println(nama); // Mencetak string 'nama'
//
//////        Latihan Nomor 4
////        for(int i=0;i<=20;i++){
////            double akar = Math.sqrt(i);
////            double error = i-(akar*akar);
////            System.out.println("akar dari: " + akar + " adalah ");
////            System.out.println("error: " + error);
////            }
////        }
////        Latihan Nomor 5