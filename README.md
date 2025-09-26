# 🎓 Student Management System (Java + SQLite)

A **Java project** that works like a mini-DBMS using **SQLite + JDBC**.  
It supports full **CRUD operations** (Create, Read, Update, Delete) on student records.  
Perfect for learning **DBMS concepts, JDBC, and Java OOP**.

---

## 🚀 Features
- ➕ **Add Student** → Insert a new student record  
- 📋 **View All Students** → Display all stored records  
- 🔍 **Search Student** → Find a student by ID  
- ✏️ **Update Student** → Modify existing student details  
- ❌ **Delete Student** → Remove a student record  

---

## 📂 Project Structure
<img width="554" height="412" alt="image" src="https://github.com/user-attachments/assets/15a78e4d-fe52-4d72-99e6-75617a7b942c" />

---

## 🛠️ Setup & Run

```bash
# 1️⃣ Clone the repository
git clone https://github.com/Abhyudaya7781/student-management-system.git
cd student-management-system

# 2️⃣ Download SQLite JDBC driver
wget https://github.com/xerial/sqlite-jdbc/releases/download/3.43.0.0/sqlite-jdbc-3.43.0.0.jar -P lib/

# 3️⃣ Compile the project
# Linux / WSL / MacOS:
javac -cp ".:lib/sqlite-jdbc-3.43.0.0.jar" src/*.java -d bin

# Windows (PowerShell / CMD):
javac -cp ".;lib/sqlite-jdbc-3.43.0.0.jar" src/*.java -d bin

# 4️⃣ Run the project
# Linux / WSL / MacOS:
java -cp ".:bin:lib/sqlite-jdbc-3.43.0.0.jar" Main

# Windows:
java -cp ".;bin;lib/sqlite-jdbc-3.43.0.0.jar" Main
