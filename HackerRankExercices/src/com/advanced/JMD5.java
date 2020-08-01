package com.advanced;
/*
MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Here are some
common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file has arrived intact.
MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT; however,
the security of MD5 has been severely compromised, most infamously by the Flame malware in 2012. The CMU Software
Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".

Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
 */

import java.util.*;
import java.security.*;

public class JMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String entrada;
        Scanner sc = new Scanner(System.in);
        entrada = sc.next();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(entrada.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
