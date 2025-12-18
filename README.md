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
