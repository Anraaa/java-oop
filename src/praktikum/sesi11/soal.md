# Soal Praktikum Java

## Soal 1: Interface (Game)

**Soal:**
Buatlah sebuah interface bernama `Playable` yang memiliki metode `play()` dan `pause()`. Kemudian, buatlah dua kelas yang mengimplementasikan interface tersebut, yaitu `VideoGame` dan `BoardGame`. Kelas `VideoGame` memiliki atribut `title` dan `platform`, sedangkan kelas `BoardGame` memiliki atribut `name` dan `numberOfPlayers`. Tampilkan informasi saat permainan dimulai dan dijeda.

---

## Soal 2: Abstract Class (Game)

**Soal:**
Buatlah sebuah abstract class bernama `Game` yang memiliki atribut `title` dan metode abstract `startGame()`. Kemudian, buatlah dua kelas turunan yaitu `RPGGame` dan `FPSGame`. Kelas `RPGGame` memiliki atribut `level`, sedangkan kelas `FPSGame` memiliki atribut `weapons`. Tampilkan informasi saat permainan dimulai untuk masing-masing jenis game.

---

## Soal 3: Final Static

**Soal:**
Buatlah sebuah kelas bernama `GameSettings` yang memiliki variabel `MAX_PLAYERS` yang bertipe `final static`. Tampilkan nilai dari `MAX_PLAYERS` dan coba untuk mengubah nilainya (akan menghasilkan error).