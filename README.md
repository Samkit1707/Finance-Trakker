Finance Trakker
A modern, responsive website designed to help everyone manage their finances effectively and start saving. The platform offers features like daily expense logging, categorized spending charts, and savings goal tracking. Built using a robust tech stack and best practices in web development.

Table of Contents
Features
Technologies Used
Installation
Usage
Screenshots
Contributors
Contact
Features
Responsive Design: Works seamlessly on devices of all sizes.
User Authentication: Secure login and signup system for personalized experiences.
Expense Tracking: Log daily expenses with categories like rent, travel, and food.
Savings Goal: Set and monitor custom savings goals.
Visual Insights: View categorized spending charts using bar graphs (powered by Chart.js).
Technologies Used
Frontend:
HTML, CSS, JavaScript
EJS for templating
Styling Frameworks: Tailwind CSS, Bootstrap, Material UI
Backend:
Java, Spring Boot
Database:
MySQL
Charts:
Chart.js
Hosting:
Frontend: Vercel
Backend: Heroku
Installation
Prerequisites
Make sure the following are installed on your system:

Java 17 or later
Spring Boot CLI
Node.js (v16 or later)
MySQL Database Server
Git
Steps to Run the Project
Clone the repository:

bash
Copy code
git clone https://github.com/<your-repo>/Finance-Trakker.git
cd Finance-Trakker
Set up the frontend:

Navigate to the frontend directory:
bash
Copy code
cd frontend
Install dependencies:
bash
Copy code
npm install
Run the development server:
bash
Copy code
npm run dev
Set up the backend:

Navigate to the backend directory:
bash
Copy code
cd backend
Set up MySQL database:
Create a database named finance_trakker.
Update database credentials in the application.properties file.
Build and run the Spring Boot server:
bash
Copy code
mvn spring-boot:run
Access the application:

Frontend: Visit https://<your-vercel-deployment-link>
Backend: API is hosted at https://<your-heroku-deployment-link>
Usage
Login/Signup: Start by creating an account or logging in.
Log Expenses: Navigate to the dashboard and log your daily expenses under the appropriate categories.
View Insights: Check the bar charts for a detailed breakdown of spending by category.
Set Savings Goals: Define a savings goal and track progress on the dashboard.
Demo Account Credentials (if applicable):

Username: demo_user
Password: demo_password
Screenshots
Login Page
[Add Screenshot]

Dashboard with Charts
[Add Screenshot]

Expense Logging Page
[Add Screenshot]

Contributors
We thank the following contributors for their efforts:

Samkit Jain: GitHub Profile
Satyam Dubey: GitHub Profile
Feel free to contribute and join the project!

Contact
For any inquiries or feedback, please reach out:

Samkit Jain
Email: samkit.jain@example.com
GitHub: Samkit1707

Satyam Dubey
Email: satyam.dubey@example.com
GitHub: satyam91s

