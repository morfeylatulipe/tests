package com.company.untitled;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class UntitledApplicationTest {

    @Test
    public void constructorTest() {
//        UntitledApplication.main(new String[0]);

        PrintStream old = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);
        UntitledApplication.main(new String[]{"hello"});
        System.out.flush();
        System.setOut(old);
        String s = new String(baos.toByteArray(), Charset.defaultCharset());
        assertEquals("hello\r\n", s);
    }
}