# RTp0: Java EE Web Application (Servlet/JSP)

## Project Description

**RTp0** is an introductory practical project designed to introduce the fundamentals of web application development in **Java EE** (Enterprise Edition), using the **Model-View-Controller** (**MVC**) architecture based on **Servlets** and **JSPs** (**JavaServer Pages**).

The main objective is to model a simple product management application, implementing:
- A data persistence (DAO) layer for data (simulated or not).
- A business logic (```ProductMetier```) layer for application logic.
- A presentation layer (Controller/View) for user interaction.

This project is a demonstration of a traditional Java web application, without the use of heavy frameworks like Spring or full Jakarta EE, focusing on Servlets and JSPs.

## Key Concepts and Features

- **MVC Architecture:** Clear separation of responsibilities (Model: ```Product```, View: ```products.jsp```, Controller: ```ProductController```).
- **Servlets:** Use of ```HttpServlet``` to handle HTTP requests.
- **JSP and JSTL:** Use of JavaServer Pages and JSTL (JSP Standard Tag Library) for dynamic view generation.
- **DAO/Business Logic Layer:** Implementation of classes for data access (```ProductDao```) and business logic (```ProductMetier```).
- **Product Entity:** Modeling of the ```Product``` entity (likely using Lombok for conciseness).

## Technologies Used

| **Technology**          | **Role in the Project** |
|-------------------------|-------------------------|
| **Language**            | Java.                   |
| **Build Tool**          | Maven.                  |
| **Web Architecture**    | Servlets (Java EE).     |
| **View**                | JSP (JavaServer Pages). |
| **View Libraries**      | JSTL, Standard Taglibs. |
| **Utilities**           | Lombok.                 |
| **Web Server**          | Servlet API (4.0.1).    |

## Installation and Execution

### Prerequisites

- JDK (Java Development Kit).
- Apache Maven.
- A Java application server compatible with Servlets (e.g., Apache Tomcat, WildFly).

### Steps

1. **Clone the Repository:**
```bash
git clone https://github.com/morning-dark/RTp0.git
cd RTp0
```
2. **Build the Project:** Use Maven to compile the project and generate the WAR file.
3. **Deploy:** Deploy the generated ```.war``` file (in the ```target/``` folder) to your application server (e.g., Tomcat).
4. **Access:** Access the application via your server's URL (e.g., ```http://localhost:8080/RTp0/```).
