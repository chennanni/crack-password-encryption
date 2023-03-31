package org.example;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    @Value("${my.password}")
    private String password;

    @Value("${my.password.with.encryption}")
    private String passwordWithEncryption;

    @Qualifier("jasyptStringEncryptor")
    @Autowired
    private StringEncryptor encryptor;

    public void doTryEncryption() {
        System.out.println("1. doTryEncryption");
        String encryptedWord = encryptor.encrypt("hello");
        String decryptedWord = encryptor.decrypt(encryptedWord);
        System.out.println("encryptedWord: " + encryptedWord);
        System.out.println("decryptedWord: " + decryptedWord);
    }

    public void doGetEncryptedProperties() {
        System.out.println("2. doGetEncryptedProperties");
        System.out.println("password: " + password);
        System.out.println("passwordWithEncryption: " + passwordWithEncryption);
    }

}
