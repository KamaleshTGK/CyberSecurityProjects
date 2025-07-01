# 🔐 File Permission Checker (Java)

This is a simple Java tool that helps you **check and create files** on your system, and view their permissions (read, write, execute).  

It can be useful for verifying file security settings or quickly creating test files.

---

## 📄 Features

- ✅ Check if a file exists
- ✨ Automatically create a file and its parent directories if missing
- 🔍 Show file permissions:
  - Readable
  - Writable
  - Executable
- 💬 Simple console-based interaction

---

## 🚀 How to Run

1️⃣ **Compile the program:**
```bash
javac FilePermissionChecker.java
```
2️⃣ **Run the program:**
```bash
java FilePermissionChecker
```
3️⃣ **When prompted**, enter the full path where you want to check or create a file.
Example:
```bash
Enter the file path to check or create: /Users/yourname/Documents/testfile.txt
```

## 🛡️ Example Output
```bash
Enter the file path to check or create: /Users/kamal/testfile.txt
✅ File created successfully at: /Users/kamal/testfile.txt
🔍 Readable: true
🔍 Writable: true
🔍 Executable: false
```

## 💡 Note
- The program will create all necessary folders automatically if they don’t exist.
- File permissions shown depend on your operating system and folder settings.

## 👨‍💻 Author: Kamalesh TGK<br>
Learning Java & Cybersecurity 💻🔐
