# miniproject

--Design ERD dari miniproject

![erd](https://user-images.githubusercontent.com/59810881/171332778-d5abc5ce-4e7e-4f9c-8648-1a4fb26a977d.jpeg)

--1. Save API (INSERT DATA)

![save_api](https://user-images.githubusercontent.com/59810881/171332961-bb34ade3-fef5-4ab9-87cd-8237a356fc9e.jpeg)

Save API berfungsi untuk menambahkan data dengan menggunakan methode POST
Pertama pilih "POST" karena API ini akan digunakan untuk mem-post/ menambahkan data ke server
Kemudian isi url dengan value yang diberikan pada controller

![save_controller](https://user-images.githubusercontent.com/59810881/171333964-25284c35-edcd-4da9-b170-025897201b05.jpeg)

Kemudian isi data, pada kasus ini menggunakan Body. Akan ada pesan berhasil jika sukses menambahkan.
![image](https://user-images.githubusercontent.com/59810881/171334854-a8cf0e19-4538-4397-ad2f-af254bfd45e6.png)

Tampilan data Di Database
![image](https://user-images.githubusercontent.com/59810881/171339381-b8a0812d-fa71-45f6-8a21-9aacbf67a150.png)



--2. Show data per page API

API ini berfungsi untuk menampilkan data per 10 pages atau sesuai ukuran yang kita inginkan
Pertama pilih "GET", kemudian isi url dengan value yang diberikan pada controller.

![image](https://user-images.githubusercontent.com/59810881/171335861-27fd086f-4405-4ee5-86be-5ad04d801a68.png)

Kemudian isi data, pada kasus ini pilih param karena codingan me-request param,
centang pada bagian page dan size, kemudian isi page dimulai dari page berapa dan jumlah data yang diinginkan.
![image](https://user-images.githubusercontent.com/59810881/171335991-bd885957-271c-4c56-90af-4d695fefc155.png)

Contohnya seperti dibawah, Total Pages ada 2 dan data ada 11
![image](https://user-images.githubusercontent.com/59810881/171336529-d7a04d52-3b0f-4ccf-838e-232cffc74d80.png)

--3. Show data filtered by Skill
API ini berfungsi untuk menampilkan data berdasarkan skill yang kita inginkan.
Sama seperti diatas yang membedakannya adalah pada kasus ini kita mencentang skill,
kemudian masukkan value sesuai skill yang ingin kita filter.
Contohnya seperti dibawah.
Pada contoh saya memfilter yang memiliki skill Ruby.
![image](https://user-images.githubusercontent.com/59810881/171337070-e1bbcecc-6a64-4657-8013-e0de5fbf9daf.png)

Akan menampilkan data yang memiliki skill Ruby, pada data ini ada total 3 data.
![image](https://user-images.githubusercontent.com/59810881/171337144-a3f7a433-89ba-4f3a-8159-068f07f367f4.png)


--4. Edit/ Update data per orang
Berfungsi untuk mengedit/meng-update data per orang.
Pilih POST, kemudian isi url dengan value yang diberikan pada controller

![image](https://user-images.githubusercontent.com/59810881/171337775-18606d39-f2a6-4521-b51d-c5c704cd6e1d.png)

Pada Contoh kali ini saya akan mencoba meng-update data Matthew.

(BEFORE)
![image](https://user-images.githubusercontent.com/59810881/171338435-3cc1dbb4-0097-4e12-9ae7-433fb31907c2.png)

Pada gambar dibawah saya mencoba mengganti nomor handphone matthew dan mendelete skill php,
Setelah berhasil akan keluar pesan Update berhasil.
(AFTER)
![image](https://user-images.githubusercontent.com/59810881/171338884-7d6258fb-d6eb-41e6-8335-635a19de7c90.png)

Tampilan di Database.
![image](https://user-images.githubusercontent.com/59810881/171339030-1f3098dc-73e7-48c9-9598-9d5ffceaa928.png)

--5. API DELETE
Berrfungsi untuk mendelete data per orang.
Pilih "DELETE", kemudian isi url dengan value yang diberikan pada controller

![image](https://user-images.githubusercontent.com/59810881/171339812-2859a349-30b4-48fb-9b4d-8db3e4861f4d.png)

Pada Postman akan seperti ini
![image](https://user-images.githubusercontent.com/59810881/171339891-cc2c941e-06d9-4def-a0fd-c40c9b707265.png)


Untuk Contoh ini saya menambahkan data baru yang nantinya akan di delete.

![image](https://user-images.githubusercontent.com/59810881/171340200-144f07d5-dcdb-4609-9fc3-a565f5a08707.png)

Tampilan di database (BEFORE)
![image](https://user-images.githubusercontent.com/59810881/171340556-ed0079cc-f030-4cbd-8a80-8240f0209751.png)

Tampilan di POSTMAN(BEFORE)
![image](https://user-images.githubusercontent.com/59810881/171340784-f78d0e2a-450c-4697-9cab-b65d91878eec.png)


Untuk mendelete data tambahkan /(id profile) yang ingin di delete pada contoh ini id nya 45.
Jika sukses akan muncul pesan "Delete Berhasil".
![image](https://user-images.githubusercontent.com/59810881/171340942-bc5aaed8-992a-4ec5-b665-0ba995a8bf92.png)

Tampilan di database(AFTER)
![image](https://user-images.githubusercontent.com/59810881/171341222-7bddb732-b76d-4cb7-89a2-340b08c209dd.png)

Tampilan di POSTMAN(AFTER)
![image](https://user-images.githubusercontent.com/59810881/171341367-26285d40-0424-4791-bffe-b77aa7f15f06.png)
Tidak ada data Bad Guy di page ke 2 di postman.





