# 🧮 Calculator App – Spring Boot Backend

A simple RESTful calculator application built with **Java** and **Spring Boot**. It provides a single `/api/calculate` endpoint that performs basic arithmetic operations using query parameters.

---

## 📌 Features

- ➕ Addition (`add`)
- ➖ Subtraction (`sub`)
- ✖️ Multiplication (`mul`)
- ➗ Division (`div`) with divide-by-zero handling
- 🌐 Clean and extensible RESTful API design

---

## 🌐 API Endpoint

### `GET /api/calculate`

| Parameter    | Type   | Required | Description                                                           |
|--------------|--------|----------|-----------------------------------------------------------------------|
| `num1`       | double | ✅       | First number (e.g., `10` or `10.5`)                                   |
| `num2`       | double | ✅       | Second number (e.g., `5` or `5.3`)                                    |
| `operation`  | string | ✅       | Operation to perform: `add`, `sub`, `mul`, or `div`                   |

---

## 🔄 Example Usage

```http
GET http://localhost:8080/api/calculate?num1=10&num2=5&operation=div
