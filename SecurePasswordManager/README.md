# 🔐 Secure Password Manager (Java)

This project is a simple **secure password manager** written in Java. It uses **encapsulation** and basic string-based encryption (reversing the string) to demonstrate how sensitive data can be stored and accessed securely.

---

## 📋 Features

- ✅ Store a password securely (encrypted)
- ✅ Retrieve and decrypt the password only with correct security answer
- 🔒 Uses **private fields** to protect internal data
- 🧠 Demonstrates encapsulation and access control

---

## 🧠 Concepts Used

- Java Encapsulation
- Access modifiers (`private`, `public`)
- Basic string encryption & decryption (reversing)
- Input handling with `Scanner`

---

## ▶️ How to Run

1️⃣ **Compile:**
```bash
javac SecurePasswordManager.java
```
2️⃣ **Run:**
```bash
java SecurePasswordManager
```

## 💡 Sample Flow
```bash
Enter password to store: mySecret123
Password stored securely.
Enter security answer to retrieve the password: 12345
Decrypted Password: mySecret123
```
If the wrong security answer is given: 
```bash
Decrypted Password: Access Denied!
```

## ⚠️ Note
```bash
This is a learning project only, and the string reversal technique is not secure encryption for 
real-world applications. Always use strong encryption libraries (e.g., AES) in production 
systems.
```

## 👨‍💻 Author: Kamalesh TGK
Learning Java & Cybersecurity 💻🔐

