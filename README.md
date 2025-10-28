🏦 BankApp – Simple Java Banking System
📘 Overview

BankApp is a simple console-based Java project that simulates a bank account system.
It allows users to create an account, deposit money, withdraw funds, check balance, and view transaction history — all through an interactive command-line interface.

This project demonstrates the use of:

Object-Oriented Programming (OOP)

Encapsulation

ArrayList for transaction history

Input validation using Java Scanner class

✨ Features

✅ Create a new bank account with an initial balance
✅ Deposit money with validation
✅ Withdraw money (with insufficient balance check)
✅ View current balance
✅ View full transaction history
✅ User input validation (for safe and correct entries)
✅ Simple and clean console interface

🧠 Concepts Covered

Classes & Objects

Constructors

Methods

Encapsulation (private fields + public getters)

ArrayList (for storing transaction history)

Conditional logic & input handling

📂 Project Structure
bankapp/
│
├── Account.java      # Handles account details and operations
├── BankApp.java      # Main class with user interaction (console-based)
└── README.md         # Project documentation

⚙️ How to Run the Project
1️⃣ Prerequisites

Java JDK 8 or higher

Any IDE (Eclipse, IntelliJ, VS Code) or Command Line setup

2️⃣ Clone the Repository
git clone https://github.com/<your-username>/BankApp.git

3️⃣ Navigate to Project Folder
cd BankApp

4️⃣ Compile the Code
javac bankapp/*.java

5️⃣ Run the Application
java bankapp.BankApp

💡 Example Run
Enter account holder name: Kunal Kumar
Enter account number: 12345
Enter initial deposit amount: ₹5000

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit

1
Enter deposit amount: ₹1000
Deposited: ₹1000

3
Current Balance: ₹6000.00

4
Transaction History for Kunal Kumar:
Account created with initial balance: ₹5000
Deposited: ₹1000

5
Thank you for using the Bank App!

🧾 Sample Output (Console Screenshot)
Transaction History for Kunal Kumar:
Account created with initial balance: ₹5000
Deposited: ₹1000
Withdrew: ₹500
Current Balance: ₹5500.00

🛠️ Technologies Used

Language: Java

JDK Version: 8+

Tool: Scanner for user input

Collection Used: ArrayList

📘 Learning Purpose

This project is ideal for:

Java beginners learning OOP concepts

Students practicing console-based Java applications

Anyone learning account management and transaction logic in Java

Feel free to modify and use it for learning or development purposes.

👨‍💻 Author

Kunal Kumar
