# Java OOP - Praktikum Semester 3

Kumpulan program Java untuk praktikum **Object-Oriented Programming (OOP)** semester 3.

**Author:** Aqla Harun Ramadhani Johananda — NIM: 20230801388

## Struktur Proyek

```
src/praktikum/
├── sesi1/         # Dasar Java — kalkulator sederhana
├── sesi2/         # Tipe data, operator, kontrol alur
├── sesi3/         # Operator aritmatika, relasi, logika
├── sesi4/         # Class & Object — Mahasiswa + revisi program sesi2
├── sesi5/         # Quiz — perulangan dan kondisi
├── sesi6/         # Encapsulation — BintangFilm, Mobil
├── sesi7/         # Access modifiers, getter/setter
├── sesi8/         # Inheritance — BangunDatar & Hewan
├── sesi9/         # Polymorphism — Animal, Vehicle, Pegawai
├── sesi10/        # Abstract class, Interface, Overloading/Overriding
├── sesi11/        # Final/Static, Multiple Interface, Game
├── sesi12/        # OOP Komprehensif — Dosen, Gojek, Phone, Animal
└── project/       # SimpleCalculator (GUI Swing)
```

## Topik per Sesi

| Sesi | Topik |
|------|-------|
| 1 | Input/output dasar, kalkulator CLI |
| 2 | Tipe data, if-else/switch, perulangan, array |
| 3 | Operator aritmatika, relasi, logika (short-circuit) |
| 4 | Pengenalan class, constructor, method |
| 5 | Latihan perulangan dan percabangan |
| 6 | Enkapsulasi — `private` fields, getter methods |
| 7 | Access modifier (`public`/`protected`/`private`), validasi |
| 8 | Inheritance — `extends`, `super`, method overriding |
| 9 | Polymorphism — `@Override`, dynamic method dispatch |
| 10 | Abstract class, Interface, overloading vs overriding |
| 11 | `final`, `static`, multiple interface, abstract + interface |
| 12 | Studi kasus OOP: universitas, ojek online, phone, animal |

## Cara Menjalankan

Program dapat dijalankan melalui **VS Code** (konfigurasi `launch.json` sudah tersedia) atau via terminal:

```bash
# Compile
javac -d bin src/praktikum/sesi<N>/<file>.java

# Run
java -cp bin praktikum.sesi<N>.<class>
```

Contoh:
```bash
javac -d bin src/praktikum/sesi12/Soal1.java
java -cp bin praktikum.sesi12.Soal1
```

## Tools

- **Java** — standar library (tanpa Maven/Gradle)
- **VS Code** — dengan Java Extension Pack
