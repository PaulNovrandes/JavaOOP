package com.tutorial;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // Constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
        // Main.test();
    }

    // tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // tanpa return dengan parameter
    void setNama(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // dengan return dan tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // dengan return dan denga parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah" + this.nama;
    }

}

class Oprator{

    int a;
    int b;

    Oprator(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println(a);
        System.out.println(b);
    }

    int penjumlahan(){
        int hasil;
        hasil = this.a + this.b;
        return hasil;
    }
}


public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "01");
        // System.out.println(mahasiswa1.nama);
        // test();
        mahasiswa1.show();
        mahasiswa1.setNama(" Andre","02");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Selamat Pagi");
        System.out.println(data);

        Oprator oprator1 = new Oprator(10, 5);
        System.out.println(oprator1);

        System.out.println(oprator1.penjumlahan());
        
    }

    // static void test() {
    // System.out.println("ini adalah methode test");
    // }

}
