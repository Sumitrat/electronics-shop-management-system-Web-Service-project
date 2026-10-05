# Electronics Shop Management System

A college **Web Services** project for managing electronics/appliance product records and stock information.

## Project details
- Student: Sumit Rathod
- Roll No.: 8953
- Subject: Web Services
- Guide: Prof. Abhijeet Salvi
- College: Pillai College of Arts, Commerce & Science, New Panvel
- University: University of Mumbai
- Academic Year: 2023–2024

The report describes the project as a system for managing sales, distribution and stock records of products and making the work accessible over the internet. It lists goals such as simplifying the work, making it accessible online and putting information together in one place. fileciteturn7file0L53-L67

## Technologies shown in the report
- Java
- JavaServer Faces (JSF / Facelets)
- JPA / EntityManager
- EJB
- XHTML
- JPQL named queries

## CRUD functionality
The report documents Create, Edit, List and View JSF pages for an `Appliance` entity. The Create page includes product ID, name, type, company, price, discount price, description, stock available, manufacturer and product code. fileciteturn7file0L68-L106 fileciteturn7file0L109-L150

The List page displays appliance records and provides View, Edit and Delete actions. fileciteturn7file0L267-L320 fileciteturn7file0L323-L374

The Java source documented in the report uses a JPA `Appliance` entity mapped to an `appliance` table, with named queries for the product fields. fileciteturn7file0L557-L576 fileciteturn7file0L578-L631

## Repository structure
```text
electronics-shop-management-system/
├── README.md
├── .gitignore
├── src/main/java/
│   ├── controller/
│   └── product/
├── src/main/webapp/
│   ├── index.xhtml
│   ├── template.xhtml
│   └── product/appliance/
│       ├── Create.xhtml
│       ├── Edit.xhtml
│       ├── List.xhtml
│       └── View.xhtml
├── screenshots/
└── docs/
    └── 8953 Web Services Project.docx
```

## Important
This ZIP is a **GitHub-ready reconstruction based on the submitted report**. The report does not include the complete original NetBeans project configuration, database connection, dependencies or server setup, so this should not be represented as the original complete application.
