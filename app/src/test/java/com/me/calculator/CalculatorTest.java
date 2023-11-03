package com.me.calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}

//Kelas di atas mendefinisikan dua metode pengujian: testAdd dan testSubtract.
// setelah itu uji project yang telah dibuat.
//Setelah dijalankan, JUnit akan menjalankan semua metode pengujian yang ditemukan dalam kelas "CalculatorTest"
// dan memberikan laporan tentang apakah pengujian berhasil atau gagal. Jika semua pengujian berhasil, Anda akan mendapatkan keluaran yang
// mengkonfirmasi bahwa kelas "Calculator" berfungsi dengan benar.