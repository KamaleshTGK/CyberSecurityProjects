# 💬 Chat App Using Sockets (Java)

This project implements a simple **two-way chat application** using Java Sockets. It demonstrates basic networking concepts and secure communication principles used in cybersecurity.

---

## 📋 Features

- Connects a client to a server over TCP (localhost)
- Real-time, two-way text message exchange
- Demonstrates blocking I/O with streams
- Simple command-line interface

---

## 🧠 Concepts Used

- Java **Socket** and **ServerSocket** classes
- Input/output streams (`BufferedReader`, `PrintWriter`)
- Basic client-server architecture
- Threading concepts (can be extended to support multiple clients)

---

## ▶️ How to Run

### 1️⃣ Compile the files
```bash
javac chatServer.java
javac chatClient.java
```
### 2️⃣ Start the server
```bash
java chatServer
```
You'll see:
```bash
Server started. Waiting for client...
```
### 3️⃣ Start the client (in another terminal or separate run)
```bash
java chatClient
```
You'll see:
```bash
Connected to server.
```
### 4️⃣ Start chatting
- The client types a message -> server receives and replies.
- The server types a message -> client receives and displays it.

## 💡 Example
```bash
Server side:
Server started. Waiting for client...
Client connected!
Client: Hello!
You: Hi there!

Client side:
Connected to server.
You: Hello!
Server: Hi there!
```

## ⚠️ Note
- Works on localhost, port 1234.
- Only supports one client at a time (single connection).
- For multi-client support, you would need to implement multithreading on the server side.

## 📚 Author: Kamalesh TGK <br>
Learning Java & Cybersecurity 💻🔐

