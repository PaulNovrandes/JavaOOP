package com.tutorial;

// kelas dengan constructor
class mahasiswa {
    // data member
    String nama;
    int NIM;

    // constructor dengan parameter
    mahasiswa(String nama, int NIM){
        this.nama = nama;
        this.NIM = NIM;

        System.out.println(nama);
        System.out.println(NIM + "\n");
    }
}

public class Main {

    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("ucup", 130001);
        mahasiswa mahasiswa2 = new mahasiswa("toni", 130002);
    }
}

// kelas tanpa constructor
// class polos {
//     String dataString;
//     int dataInteger;
// }

    // constructor di panggil saat objek pertama kali dibuat
    // mahasiswa() {
    // System.out.println("ini adalah constructor");
    // }


// mahasiswa(String inputNama, String inputNIM, String inputJurusan) {

    //     nama = inputNama;
    //     NIM = inputNIM;
    //     jurusan = inputJurusan;

    //     System.out.println(nama);
    //     System.out.println(NIM);
    //     System.out.println(jurusan);
    // }

           
        // polos objekPolos = new polos();
        // objekPolos.dataString = "ucup";
        // objekPolos.dataInteger = 0;

        // System.out.println(objekPolos.dataString);
        // System.out.println(objekPolos.dataInteger);