package com.tutorial;

// Membuat class
class mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

}

class pelajar{
    String name;
    
}

public class Main {

    public static void main(String[] args) {

        pelajar pelajar1 = new pelajar();
        pelajar1.name = "Handrian";

        System.out.println(pelajar1.name);

        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "31110001";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "abi";
        mahasiswa2.NIM = "31110002";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }

}
