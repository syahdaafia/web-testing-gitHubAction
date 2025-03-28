@Inventory
Feature: Cart Functionality
  Background:
    Given user membuka halaman login
    When user memasukkan "standard_user" dan "secret_sauce"
    And user menekkan tombol login
    Then user mendapatkan "login success"

    Scenario: Verifikasi item pada cart bertambah ketika menekan tombol "add to cart"
      When user menekan tombol add to cart pada satu produk
      Then item pada cart bertambah 1

    Scenario: Verifikasi item pada cart bertambah ketika menekan tombol "add to cart" pada lebih dari satu barang
      When user menekan tombol add to cart pada dua produk
      Then item pada cart bertambah 2

    Scenario: Verifikasi item pada cart berkurang ketika menekan tombol "remove"
      When user menekan tombol add to cart pada satu produk
      Then item pada cart bertambah 1
      And user menekan tombol remove
      Then item pada cart kosong
