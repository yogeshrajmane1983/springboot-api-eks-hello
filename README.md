# 🚀 Spring Boot CI Pipeline with SonarCloud + Snyk

A production-grade **CI pipeline** built using GitHub Actions integrating:
- Code Quality Analysis
- Test Coverage
- Security Scanning

---

## 🔧 Tech Stack

- **Java 17**
- **Spring Boot**
- **Maven**
- **GitHub Actions**
- **SonarCloud** (Code Quality & Quality Gates)
- **JaCoCo** (Code Coverage)
- **Snyk** (Security & Vulnerability Scanning)

---

## ⚙️ CI Pipeline Workflow

Code Push → GitHub Actions → Build & Test (Maven)
→ Coverage (JaCoCo) → Code Analysis (SonarCloud)
→ Security Scan (Snyk) → Quality Gate

---

## 📊 Key Metrics

| Metric | Value |
|------|------|
| Code Coverage | ~66% |
| Bugs | 0 |
| Vulnerabilities | 0 (High/Critical) |
| Maintainability | A |
| Reliability | A |

---

## 💡 Features

- ✅ Automated build & test execution
- ✅ Code coverage reporting with JaCoCo
- ✅ Static code analysis with SonarCloud
- ✅ Security scanning with Snyk
- ✅ Quality Gate enforcement ready
- ✅ Fully automated GitHub Actions pipeline

---

## 🗂️ Project Structure

springboot-api-eks-hello/
├── src/ 
│ ├── main/java 
│ └── test/java 
├── .github/workflows/ 
│ └── ci.yml 
├── pom.xml 
└── README.md 

---

**🔐 Security**
Integrated Snyk for dependency vulnerability scanning
Enables shift-left security in CI pipeline

---

**📈 Code Quality**
Integrated SonarCloud
Tracks:
Code smells
Bugs
Coverage
Maintainability

---

**🚀 Future Improvements**
Add Quality Gate enforcement (fail build on low coverage)
PR-based Sonar checks
Deployment to AWS EKS
Multi-stage CI/CD pipeline

---

## ▶️ How to Run Locally

```bash
# Clone repo
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git

cd springboot-api-eks-hello

# Build & test with coverage
mvn clean verify

# Run application
mvn spring-boot:run


