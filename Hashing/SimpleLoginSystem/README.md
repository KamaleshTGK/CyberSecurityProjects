# 🔐 Simple Login System with Salted Hashing

A basic Java login system that demonstrates secure user registration and login using **salted SHA-256 hashing**.

## 💡 Features

- Register new users with a username and password
- Generate a unique random salt for each user
- Hash salted passwords securely using SHA-256
- Store credentials in a file (`userdata.txt`)
- Validate user login by comparing salted hashes

---

## 🚀 How to Run

1️⃣ **Compile the code**

```bash
javac SimpleLoginSystem.java
```
2️⃣ **Run**
```bash
java SimpleLoginSystem
```
3️⃣ **Choose an option**
- Type register to create a new account.
- Type login to log in with an existing account.
4️⃣ **Follow the prompts**
- For registration, enter a username and password. A random salt is generated and saved along
   with the hash.
- For login, the system retrieves your salt and verifies your hashed password.

## 📄 Data Storage
By default, user data is stored in:
```bash
userdata.txt
```
Example file content:
```bash
alice:ab1cdEf...:a1b2c3d4... (salt and hash)
bob:qweRtYu...:12345678...
```
## ⚠️ Security Notes
- Never store plaintext passwords!
- Always use a unique salt per user to prevent rainbow table attacks.
- This example is for learning purposes; in real applications, use stronger libraries (e.g., bcrypt, Argon2).

## 💻 Author: Kamalesh TGK <br>
Building secure Java & Cybersecurity projects 💙🚀
