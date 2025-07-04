# 🆕 Simple User Registration System

A basic Java console application to register new users and save their credentials in a file.

---

## 💡 Features

- Register new users by entering username and password
- Store data in a local file (`userdata.txt`)
- Automatically creates file and folders if they don't exist
- Prints full file path for clarity

---

## 🚀 How to Run

1️⃣ **Compile the code**

```bash
javac UserRegistration.java
```
2️⃣ **Run**
```bash
java UserRegistration
```
3️⃣ **Follow prompts**
- Enter username
- Enter password
The data will be stored in:

```bash
src/userdata.txt
```

## ⚠️ Important Security Note
```bash
🚨 Currently, this example stores plain text passwords, which is insecure for real applications.
```
✅ **Suggestion:** Hash the password before storing, for example using SHA-256 or bcrypt.

## 💻 Example file content
```bash
Username: alice
Password: mySecretPass123
------------
Username: bob
Password: admin123
------------
```

## ✨ Improvements
- Add password hashing (SHA-256 or salted hashing) to protect user data
- Add login and authentication verification
- Track failed login attempts

## 💙 Author: Kamalesh TGK<br>
Java & Cybersecurity enthusiast
