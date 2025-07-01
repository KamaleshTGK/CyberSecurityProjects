# ⌨️ Keystroke Logger (Java)

This project implements a simple **keystroke logger** using Java Swing and file handling. The application captures typed keys in a text area and logs them to a file. It also flags suspicious patterns (like default passwords or "admin").

---

## 📋 Features

- ✅ Real-time logging of typed keys
- ⚠️ Detects suspicious keywords (e.g., `123456`, `admin`)
- 💾 Saves logs to a file (`keystroke_log.txt`) in the project directory
- 🪟 GUI interface using `JTextArea`

---

## 💡 How It Works

- The app opens a text area where the user can type.
- Each keystroke is captured and saved to `keystroke_log.txt`.
- If suspicious patterns are detected, an alert line is added in the log file.

---

## ▶️ How to Run

1️⃣ **Compile the program**

```bash
javac KeyLoggerApp.java
```

2️⃣ **Run the program**
```bash
java KeyLoggerApp
```

3️⃣ **Check the logs**
- After typing, open keystroke_log.txt in your project directory to see all captured keys.

## ⚠️ Disclaimer
```bash
🚨 Important:
This code is for educational purposes only.
Keystroke logging can be considered malicious behavior if used without user consent.
Do not use it to invade others' privacy or violate any laws.
```

## 💻 Author: Kamalesh TGK<br>
Learning Java & Cybersecurity

