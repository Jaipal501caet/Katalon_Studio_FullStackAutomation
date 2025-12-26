# 🚀 Unified Full-Stack Automation Framework (Katalon Studio)

## 📋 Project Overview
This project is a **Hybrid Test Automation Framework** developed in **Katalon Studio**. It demonstrates a robust regression strategy by orchestrating tests across three distinct layers: **Web UI**, **REST API**, and **Android Mobile** apps.

The framework is designed to support **Parallel Execution** and includes advanced handling for browser security profiles and real-device mobile configurations.

## 🛠️ Tech Stack
* **Tool:** Katalon Studio (Groovy/Java)
* **Web:** Selenium WebDriver (Chrome Custom Profiles)
* **Mobile:** Appium (Android Real Device Automation)
* **API:** RESTful Services (Header Injection & Validation)
* **Orchestration:** Test Suite Collections

## ✨ Key Features

### 1. 🖥️ Web UI Automation
* **Target:** CURA Healthcare Service.
* **Advanced Handling:**
    * Bypassed "Chrome Data Breach" and "Save Password" popups using `Desired Capabilities` (`prefs` dictionary & `args` list).
    * Implemented `Incognito` mode execution for clean session testing.
    * Dynamic browser selection logic handled within Test Cases.

### 2. 📱 Mobile Automation (Android)
* **Target:** API Demos APK (Native Android App).
* **Infrastructure:** Real Device Testing (Realme/Android 13).
* **Stability:**
    * Implemented **Device Connectivity Checks** (Guard Clauses) to prevent script crashes if the device is offline.
    * Used `RunConfiguration` to dynamically inject Device IDs (`JB9PLZK7JNLVONFI`).
    * Handled permission security exceptions via `appium:disableWindowAnimation`.

### 3. 🔗 API Testing
* **Target:** Reqres.in / JSONPlaceholder.
* **Security Bypass:** Implemented custom `User-Agent` headers to bypass `403 Forbidden` bot detection.
* **Validation:** Automated assertions for Status Code 200 and JSON body verification.

## ⚙️ Architecture: The Master Collection
The project utilizes a **Test Suite Collection** (`Master_E2E_Collection`) to manage environment constraints:
* **Suite 1 (Web):** Forced execution on **Chrome**.
* **Suite 2 (Mobile):** Forced execution on **Android**.
* **Execution Mode:** Configured for **Parallel Execution** to reduce regression time.

## 🚀 How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/Katalon-FullStack-Demo.git](https://github.com/YOUR_USERNAME/Katalon-FullStack-Demo.git)
    ```
2.  **Open in Katalon Studio.**
3.  **Mobile Setup:**
    * Enable USB Debugging on your Android device.
    * Update the `deviceId` in `Mobile_Nav_Test` if using a different phone.
4.  **Execute:**
    * Open `Test Suites/Master_E2E_Collection`.
    * Click **Execute**.

## 📊 Reporting
The framework generates consolidated HTML/PDF reports located in the `Reports/` folder, providing a single view of pass/fail status across all platforms.

---
*Created by Jaipal S Chaudhary | Senior QA Professional*
