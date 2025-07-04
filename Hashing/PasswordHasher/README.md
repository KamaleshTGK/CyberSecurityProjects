# 🔐 Password Hasher (SHA-256)

This project allows you to securely hash your passwords using the **SHA-256 algorithm** and save them into a file in a folder of your choice.

---

## 💡 Features

- Hashes passwords using SHA-256
- Lets the user choose their own folder to save the file
- Automatically creates folders if they don't exist
- Appends new passwords without overwriting old data

---

## 🚀 How It Works

1. The program asks you to enter a **password**.
2. It generates a **SHA-256 hash** for the password.
3. You then enter a **folder path** (for example:  
   - Windows: `C:\Users\YourName\Documents`
   - macOS/Linux: `/Users/yourname/Desktop`)
4. It creates a `passwords.txt` file in that folder and saves:
   - Original password
   - Hashed password
5. Prints the exact location of the saved file.

---

## 💻 Usage

```bash
javac PasswordHasher.java
java Cybersecurity.Hashing.PasswordHasher
```

## 📄 Example Output
```bash
🔐 Enter your password: mySecret123
✅ Hashed Password (SHA-256): e99a18c428cb38d5f260853678922e03...
📁 Enter folder path to save the file (e.g., C:\Users\YourName\Documents): C:\Users\Kamalesh\Documents
✅ Password and hashed password saved successfully in: C:\Users\Kamalesh\Documents\passwords.txt
```

## ⚠️ Notes
- Always store passwords securely and avoid sharing plain text passwords.
- You can open passwords.txt anytime to review saved data.

## 🛡️ Disclaimer
This tool is for **learning and demonstration purposes only**.
For real-world applications, always use secure password hashing and authentication libraries such as bcrypt, PBKDF2, or Argon2.

