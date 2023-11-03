package com.me.calculator;

import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testAddSucces(){

        int result = calculator.add(10, 10);
    }
}
//Buat kelas uji JUnit untuk menguji kelas "Calculator". Nama kelas uji harus mengikuti konvensi dengan akhiran "Test".
//Kelas di atas mendefinisikan satu metode pengujian "testAddSucces"
// setlah itu uji project yang telah dibuat.