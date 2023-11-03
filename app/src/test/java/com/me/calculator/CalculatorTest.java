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

//Buat kelas uji JUnit untuk menguji kelas "Calculator". Nama kelas uji harus mengikuti konvensi dengan akhiran "Test".
//Kelas di atas mendefinisikan satu metode pengujian "testAddSucces"
// setelah itu uji project yang telah dibuat.