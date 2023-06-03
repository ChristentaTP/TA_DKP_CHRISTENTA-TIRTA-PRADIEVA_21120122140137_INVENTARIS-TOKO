/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ta_inventaris_toko;

import java.util.ArrayList;

public class Database {
    private ArrayList<String> produk;
    private ArrayList<Integer> jumlahproduk;
    private ArrayList<Integer> hargaproduk;


    private String produkbaru;
    private int jumlahbaru;
    private int hargabaru;

    public Database() {
        produk = new ArrayList<>();
        jumlahproduk = new ArrayList<>();
        hargaproduk = new ArrayList<>();
        
    // Tambahkan produk ke dalam objek Database
    }

    public void addProduk(String nama, int jumlah, int harga) {
        if (!isProdukExists(nama)) {
            produk.add(nama);
            jumlahproduk.add(jumlah);
            hargaproduk.add(harga);

            produkbaru = nama;
            jumlahbaru = jumlah;
            hargabaru = harga;
        } else {
            System.out.println("Produk dengan nama " + nama + " sudah ada dalam database.");
        }
    
    }

    public String[] getProduk() {
        return produk.toArray(new String[0]);
    }

    public Integer[] getJumlahProduk() {
        return jumlahproduk.toArray(new Integer[0]);
    }

    public Integer[] getHargaProduk() {
        return hargaproduk.toArray(new Integer[0]);
    }
    
    public void deleteProduk(String productName) {
        int index = produk.indexOf(productName); // Find the index of the product in the produk ArrayList
        if (index != -1) {
        produk.remove(productName); // Remove the product from the ArrayList
        jumlahproduk.remove(index); // Remove the corresponding quantity
        hargaproduk.remove(index); // Remove the corresponding price
    }
}
    public String[] cariProduk(String kataKunci) {
        ArrayList<String> hasilPencarian = new ArrayList<>();

        for (int i = 0; i < produk.size(); i++) {
            String namaProduk = produk.get(i);
            if (namaProduk.toLowerCase().contains(kataKunci.toLowerCase())) {
                hasilPencarian.add(namaProduk);
            }
        }

        return hasilPencarian.toArray(new String[0]);
        }
    
    public boolean isProdukExists(String nama) {
        for (String produk : produk) {
            if (produk.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    
    
}
}

