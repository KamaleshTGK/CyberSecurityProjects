# 🛡️ Security Log System (Java Collections)

This project demonstrates how to manage security logs using Java's **ArrayList** and **LinkedList** from the Collections Framework. It simulates logging events like login attempts, file accesses, and system actions — common in cybersecurity monitoring systems.

---

## 📋 Features

- 📄 Record security events using `ArrayList` (for fast indexed access)
- 📜 Maintain logs using `LinkedList` (flexible insertion/removal)
- 🖨️ Print and review all logs clearly
- 🧑‍💻 Simple CLI-based simulation

---

## 🧠 Concepts Used

- Java `ArrayList` and `LinkedList`
- Iteration using enhanced `for` loop
- Simulating log events
- Basic data structure selection

---

## ▶️ How to Run

### 1️⃣ Compile

```bash
javac SecurityLog.java
```

### 2️⃣ Run
```
java SecurityLog
```

## 💡 Example Output
```bash
Security Logs: 
Login attempt by user: admin
File accessed: secret.txt
User logout: admin
--------------
Security Logs (LinkedList):
System booted
User1 logged in
User2 failed login
User1 performed data export
```
## ✅ When to Use Each
- ArrayList: When you need fast random access (index-based).
- LinkedList: When frequent insertions/deletions are needed (especially at start/end).

## 📚 Author: Kamalesh TGK <br>
Learning Java & Cybersecurity 💻🔐
