# 🛡️ Keylogger Detector (Java)

This project implements a simple **keylogger detection tool** in Java. It scans a specified folder for files that potentially belong to a keylogger, based on suspicious naming patterns.

---

## 📋 Features

- 🔍 Scans any specified folder on your system
- ⚠️ Detects suspicious files containing keywords like `keylog`, `inputlogger`, or `keystroke`
- ✅ Displays a summary of found threats
- 💬 Simple command-line interface

---

## 💡 How It Works

- The program prompts the user to enter a **folder path**.
- It lists all files in that folder and checks their names for suspicious keywords.
- If any suspicious file is found, it is reported as a potential keylogger.

---

## ▶️ How to Run

1️⃣ **Compile the program**

```bash
javac KeyloggerDetector.java
```
2️⃣ **Run the program**
```bash
java KeyloggerDetector
```
3️⃣ **Example flow**
```bash
Enter the path of the folder to scan: C:\Users\YourName\Documents\testfolder

🔍 Scanning files for suspicious keylogger patterns...

⚠️  Suspicious file detected: keylog_data.txt
✅ No suspicious keylogger files detected.
```

## ⚠️ Disclaimer
```bash
🚨 Important:
This tool is a basic heuristic scanner, intended for learning and educational purposes only.
It checks filenames only — it does not perform deep content scanning or malware analysis.
```

## 💻 Author: Kamalesh TGK<br>
Learning Java & Cybersecurity 💻🔐
