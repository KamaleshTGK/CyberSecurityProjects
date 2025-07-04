# 🧂 Salted Password Hasher

This project demonstrates secure password hashing with a random salt using Java.

## 💡 Features

- Generates a random salt for each password.
- Hashes the salted password using SHA-256.
- Saves original password, salt, and hashed result to a file specified by the user.
- Helps understand the importance of salting in password security.

## 🚀 How to Run

1. **Compile and run:**

```bash
javac SaltedPasswordHasher.java
java Cybersecurity.Hashing.SaltedPasswordHashing.SaltedPasswordHasher
```
**2. Enter your password** when prompted.
**3. Enter file path** to save the hashed data, for example:

```bash
saltedpasswords.txt
```
## 🗂️ Output Example
```bash
🧂 Salt: pJ2l9g3.... (randomly generated)
🔒 Hashed Salted Password: 12ac34de...
```
A file will be created containing:

```bash
Original Password: mypassword
Salt: pJ2l9g3...
Hashed Salted Password: 12ac34de...
------------
```
## ⚠️ Important
- Always use a unique salt for each password.
- Do not store plaintext passwords in production systems.
- This example is for educational purposes.

## 📄 Author:Kamalesh TGK <br>
Learning Java & Cybersecurity 💻🔐
