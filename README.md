
# Employee Skills Tracker - Optimisation Task

## Overview
This project is an **Employee Skills Tracker** application designed to manage employees and their skills. It consists of:  
1. **Backend:** A Java Spring Boot REST API using in-memory mock data.  
2. **Frontend:** An Angular application utilising Angular Material for UI components.

The application was initially created by a Junior Engineer. Your task is to **analyse and propose optimisations** to the codebase to make it production-ready, scalable, and maintainable.

---

## Task Description
Your goal is to assess the current implementation and propose improvements to ensure the project can:
- Scale effectively to handle **millions of users**.  
- Follow **industry best practices** for maintainable and testable code.  
- Meet the requirements for a **production-ready application**, including performance, security, and modularity.

---

## Deliverables
1. **Optimisation Proposal Document**:  
   - Identify key areas for improvement in both the backend and frontend.
   - Propose specific optimisations with justifications (e.g., performance, scalability, security).
   - Be prepared to discuss your recommendations during the interview.
2. **Implementation Plan (Optional)**:  
   - Provide a high-level plan for implementing your proposed changes.

---

## Instructions
1. **Analyse the Codebase**:  
   - Review both the backend and frontend code to identify issues or inefficiencies.  
   - Focus on areas such as architecture, scalability, performance, and security.
2. **Propose Optimisations**:  
   - Document your findings and recommendations in a concise, structured format.
   - Address backend and frontend improvements separately.
3. **Prepare for Discussion**:  
   - Be ready to explain your proposals during the interview.
   - Highlight how your optimisations align with the requirements for a production-grade application.

---

## Areas to Consider
While conducting your analysis, consider the following aspects of the application:
- **Backend**:
  - Data persistence: Consider replacing in-memory data with a scalable database solution.
  - API structure: Ensure RESTful design and compliance with best practices.
  - Security: Evaluate for potential vulnerabilities (e.g., authentication, input validation).
  - Performance: Optimise for low latency and high throughput.

- **Frontend**:
  - Component structure: Ensure modularity and maintainability.
  - UI/UX: Propose improvements for a more intuitive and responsive interface.
  - Error handling: Ensure robust handling of API errors and user feedback.
  - Testing: Identify gaps in test coverage and suggest improvements.

---

## Notes
- The current application is a prototype and lacks several production-ready features.
- You are not required to implement the proposed changes, but your recommendations should demonstrate an understanding of scalability, clean architecture, and best practices.

---

## Evaluation Criteria
- **Analytical Skills**: Ability to identify weaknesses and propose practical solutions.
- **Clarity**: Clearly document and explain your recommendations.
- **Technical Knowledge**: Demonstrate a solid understanding of software design, performance optimisation, and scalability.
- **Communication**: Effectively present your ideas during the discussion.

---

## Setup Instructions

### Prerequisites
- **Java 17+** and **Maven** (for backend)
- **Node.js 16** and **Angular CLI** (for frontend)

### Backend Setup (Spring Boot)
1. Navigate to the backend folder:
   ```bash
   cd backend
   ```
2. Build and run the backend:
   ```bash
   mvn spring-boot:run
   ```
3. Verify that the backend runs on `http://localhost:8080`.

### Frontend Setup (Angular)
1. Navigate to the frontend folder:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm run start
   ```
4. Open the app in your browser at `http://localhost:4200`.
