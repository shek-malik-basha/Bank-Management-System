# 🏦 Bank Management System

<p align="center">
  <b>A Java-based desktop banking management application powered by MySQL.</b>
</p>

<p align="center">
  Manage accounts, transactions, banking services, branches and employees through a unified desktop interface.
</p>

<p align="center">

![Java](https://img.shields.io/badge/Java-8-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-Desktop_UI-007396?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Database_Connectivity-2C2255?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/NetBeans-Java_IDE-1B6AC6?style=for-the-badge&logo=apachenetbeanside&logoColor=white)

</p>

---

## 📌 Overview

**Bank Management System** is a desktop application developed using **Java, JavaFX, JDBC and MySQL** for managing core banking operations.

The system provides separate modules for managing:

- Account holders
- Banking transactions
- Banking services
- Branches
- Employees

The application uses **JDBC** to communicate with a relational MySQL database and provides a graphical JavaFX interface for performing and viewing banking operations.

---

## ✨ Features

### 👤 Account Holder Management

- Add new account holders
- Update customer information
- Search existing accounts
- View account details
- Delete account records
- Manage account types and balances

### 💳 Transaction Management

- Record banking transactions
- Maintain transaction history
- Associate transactions with customer accounts
- View transaction information

### 🏦 Banking Services

Manage different services provided by the bank and associate them with relevant banking operations.

### 🏢 Branch & Employee Management

- Maintain branch information
- Store employee records
- Manage employee and branch relationships

### 🔎 Database Search

Search and retrieve banking records directly from the MySQL database through the JavaFX interface.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Java 8** | Core application logic |
| **JavaFX** | Desktop graphical interface |
| **FXML** | UI structure |
| **CSS** | Application styling |
| **JDBC** | Java–database connectivity |
| **MySQL** | Relational database |
| **Apache Ant** | Project build system |
| **NetBeans** | Project development/build environment |

---

## 🏗️ Architecture

```text
┌───────────────────────────────┐
│         JavaFX UI             │
│       FXML + CSS              │
└──────────────┬────────────────┘
               │
               ▼
┌───────────────────────────────┐
│      Java Controllers         │
│                               │
│  Account │ Transaction │ etc. │
└──────────────┬────────────────┘
               │
               ▼
┌───────────────────────────────┐
│            JDBC               │
│   Java Database Connectivity  │
└──────────────┬────────────────┘
               │
               ▼
┌───────────────────────────────┐
│            MySQL              │
│                               │
│ Accounts      Transactions    │
│ Branches      Employees       │
│ Services                      │
└───────────────────────────────┘
```

---

## 🗄️ Database Design

The application uses the `bank` MySQL database with five primary tables:

```text
bank
│
├── accounttable
├── transactiontable
├── branchtable
├── employeetable
└── servicetable
```

The repository also includes:

```text
bank.sql
EERDiagram_Bank.PNG
```

for database setup and schema visualization.

---

## 📁 Project Structure

```text
Bank-Management-System/
│
├── src/
│   ├── bankmanagement/
│   │   ├── BankMain.fxml
│   │   ├── AccountHolderScene.fxml
│   │   ├── BranchEmployeeScene.fxml
│   │   ├── ServiceScene.fxml
│   │   ├── TransactoinScene.fxml
│   │   └── style.css
│   │
│   └── DB/
│       └── DBConnection.java
│
├── lib/
├── nbproject/
├── bank.sql
├── EERDiagram_Bank.PNG
├── build.xml
└── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

Make sure you have:

- Java JDK 8
- MySQL Server
- MySQL Connector/J
- Apache NetBeans or another compatible Java IDE

### 1. Clone the repository

```bash
git clone https://github.com/shek-malik-basha/Bank-Management-System.git
```

```bash
cd Bank-Management-System
```

### 2. Create the database

Open MySQL:

```sql
CREATE DATABASE bank;
USE bank;
```

Import:

```text
bank.sql
```

Verify the tables:

```sql
SHOW TABLES;
```

### 3. Configure database connection

Configure your local MySQL credentials in the database connection configuration before running the project.

> **Security:** Never commit database passwords or other credentials to a public repository.

### 4. Run the application

Open the project in **Apache NetBeans**, configure **JDK 8**, clean/build the project and run:

```text
BankManagement
```

---

## 🎨 UI Customization

The interface has been customized with a navy/blue banking theme and updated JavaFX styling.

The application styling can be modified through:

```text
src/bankmanagement/style.css
```

along with the corresponding FXML scene files.

---

## 🧠 Concepts Demonstrated

This project demonstrates practical implementation of:

- Object-Oriented Programming in Java
- JavaFX desktop development
- Event-driven programming
- JDBC connectivity
- Relational database design
- SQL CRUD operations
- Primary and foreign keys
- Database relationships
- Exception handling
- FXML-based UI development
- Separation of UI, application logic and persistence

---

## 🚀 Future Improvements

Potential improvements include:

- User authentication and role-based access
- Dashboard analytics
- Transaction reporting
- Improved form validation
- Password hashing
- Audit logging
- Exportable account statements
- Additional UI animations
- Migration to a modern Java version
- REST API architecture

---

## 🤝 Acknowledgements

This project is based on the open-source **Bank Management System** originally developed by **chandandas27**.

The project has been adapted and customized for learning and portfolio purposes, including environment configuration, database integration and UI customization.

Original repository:

https://github.com/chandandas27/Bank-Management-System

---

## 👨‍💻 Author

**Shek Malik Basha**

Computer Science & Engineering — Data Science

<p>
  <a href="https://github.com/shek-malik-basha">
    <img src="https://img.shields.io/badge/GitHub-shek--malik--basha-181717?style=for-the-badge&logo=github">
  </a>
</p>

---

<p align="center">
  <b>Built with Java ☕ • JavaFX • MySQL 🐬</b>
</p>
