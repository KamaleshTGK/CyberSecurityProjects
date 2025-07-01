# 🔐 Cyber Secure Login Logger (Java)

A simple Java-based secure login system that validates user credentials from a file and logs each login attempt.

---

## 📋 Features

- ✅ Reads users and passwords from an external file (`users.txt`)
- ⚠️ Tracks failed login attempts and warns after 3 failures
- 🗂️ Logs all login attempts (success or failure) to a file
- 💡 User can **specify their own file paths** for both user file and log file

---

## 🧠 Concepts Used

- File I/O (BufferedReader, BufferedWriter)
- HashMap for storing user data and failed attempts
- LocalDateTime for timestamps
- Exception handling
- Basic authentication logic

---

## 🗂️ Example users file (`users.txt`)

```bash
alice:password123
bob:qwerty
catherine:forlove
```

## ▶️ How to Run
1️⃣ **Compile the code**
```bash
javac SecureLoginSystem.java
```
2️⃣ **Run the program**
```bash
java SecureLoginSystem
```
3️⃣ **Provide file paths when prompted, e.g.:**
```bash
Enter path to users file (e.g., users.txt): users.txt
Enter path to log file (e.g., login_log.txt): login_log.txt
```
4️⃣ **Login attempts are logged to your specified log file**

## ⚠️ Notes
- The system issues a warning after 3 failed login attempts.
- You can edit the users.txt file to add or update user credentials.
- The log file will accumulate entries each time you run the program.

## 💻 Author: Kamalesh TGK<br>
Learning Java & Cybersecurity 💻🔐

