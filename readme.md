# Crack Password Encryption

This is a sample project to demonstrate how to encrypt passwords in a Java application.

## What does it do?

1. It encrypts & decrypts a password demonstrated in the `doTryEncryption` method.
2. It uses the encrypted property defined in application.properties demonstrated in the `doGetEncryptedProperties` method.

## How to run

1. Clone the project
2. Run `mvn clean install`
3. Run `mvn exec:java`
4. You should see the following output:

~~~
1. doTryEncryption
encryptedWord: Y6emj4kAJW8w77zlXGFlkQ==
decryptedWord: hello
2. doGetEncryptedProperties
password: hello
passwordWithEncryption: hello
~~~
