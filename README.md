A menu-driven ATM Command Line Interface (CLI) application built using Core Java, designed to demonstrate clean architecture, separation of concerns, and backend-style thinking without using any GUI or database.

This project simulates real-world ATM operations such as authentication, balance inquiry, deposit, and withdrawal using a layered design approach.

📌 Features

🔐 PIN-based Authentication

Fixed PIN authentication

Maximum of 3 failed attempts

Access blocked after exceeding attempts

💰 Account Operations

Check account balance

Deposit money with validation

Withdraw money with sufficient balance check

📋 Menu-Driven CLI

Clear and user-friendly text-based menu

Continuous operations until user exits

🧱 Clean Architecture

Proper separation of:

Controller (ATMApp)

Services (Authentication & Account logic)

Model (Account)

Utility (Menu display)
🧠 Architecture Overview
ATMApp
 ├── MenuUtil
 ├── AuthenticationService
 └── AccountService
        └── Account


ATMApp → Controls application flow and user interaction

AuthenticationService → Handles PIN validation and login attempts

AccountService → Manages business logic related to balance

Account → Represents account data

MenuUtil → Handles menu display and menu input

🛠️ Technologies Used

Java (Core Java)

OOP Principles

CLI (Command Line Interface)

No external libraries

No database

🚀 How to Run the Project

Clone the repository:

git clone https://github.com/Balaji-Karunakanti/atm-cli.git


Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)

Navigate to:

src/AtmCli/ATMApp.java


Run the ATMApp class

Follow the on-screen instructions in the terminal

🔑 Default Details (For Testing)

PIN: 1621

Initial Balance: ₹200

Account Number: Hardcoded (for simulation)

🎯 Learning Outcomes

Through this project, you will understand:

How real-world ATM systems work internally

Clean separation of concerns in Java applications

Service-layer vs controller-layer responsibilities

How authentication systems manage attempts

How backend logic can be written without frameworks

This project also serves as a foundation for future backend projects using:

Servlets

Spring Boot

REST APIs

📈 Future Enhancements

Support for multiple accounts

Persistent storage (File / Database)

Improved input validation

Conversion to Spring Boot REST API

Unit testing

👤 Author

Balaji Karunakanti
Aspiring Java Backend & Full Stack Developer

🔗 GitHub: Balaji-Karunakanti

⭐ If You Like This Project

Give it a ⭐ on GitHub — it motivates me to build more backend projects!
