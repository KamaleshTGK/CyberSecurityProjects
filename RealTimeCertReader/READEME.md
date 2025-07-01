# 🌐 Real-Time SSL Certificate Reader (Java)

This project is a simple Java tool that connects to an HTTPS URL, retrieves its SSL/TLS certificate, and displays important details like the subject, issuer, validity dates, and validity status.

---

## 📋 Features

- ✅ Connect to any HTTPS URL
- 🔎 Retrieve and display certificate subject and issuer
- 🗓️ Check certificate validity dates
- 🚨 Detect expired or invalid certificates

---

## 💡 Concepts Used

- Java Networking (`HttpsURLConnection`)
- Java Security (`Certificate`, `X509Certificate`)
- Input handling with `Scanner`
- Certificate validity checks

---

## ▶️ How to Run

1️⃣ **Compile the program:**
```bash
javac RealTimeCertReader.java
```
2️⃣ **Run the program:**
```bash
java RealTimeCertReader
```
## 3️⃣ Sample input & output:
```bash
Enter HTTPS URL (e.g., https://www.example.com): https://www.google.com

Connected to: https://www.google.com

Certificate Info:
Subject: CN=*.google.com, O=Google LLC, L=Mountain View, ST=California, C=US
Issuer: CN=GTS CA 1C3, O=Google Trust Services LLC, C=US
Valid from: Tue May 23 12:25:04 IST 2023
Valid to: Tue Aug 15 12:25:03 IST 2023
✅ Certificate is VALID.
```
# **⚠️ Note**
-> Make sure you have an internet connection to test the tool.

This is a beginner-level demonstration for educational purposes and does not handle advanced trust validation.
