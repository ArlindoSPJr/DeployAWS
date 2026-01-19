# 🚀 AWS Deploy with Terraform and Docker

This is a simple study project created to practice containerization with Docker, Infrastructure as Code using Terraform, and deployment on AWS. The goal of this project is to understand the basic workflow of building a Docker image, publishing it, provisioning cloud infrastructure, and deploying an application on AWS.

---

## 🛠️ Technologies Used

- **Docker**
- **Terraform**
- **AWS** (EC2, AMI, IAM)
- **AWS CLI**

---

## 📦 Project Structure

```
.
├── infra/
│   └── main.tf
├── Dockerfile
└── README.md
```

---

## 🧱 Step 1 – Build and Publish the Docker Image

**Build the Docker image:**

```bash
docker build . -t dockeruser/public-api-aws:latest
```

**Login to Docker Hub:**

```bash
docker login
```

**Push the image to Docker Hub:**

```bash
docker push dockeruser/public-api-aws:latest
```

**(Optional) Run the container locally to test:**

```bash
docker run -p 8080:8080 dockeruser/public-api-aws:latest
```

---

## 🏗️ Step 2 – Configure Terraform

1. Create a folder called `infra` inside the project.
2. Inside `infra`, create a file called `main.tf`.
3. Configure the EC2 instance using an AMI obtained from:
   - **AWS Console → EC2 → AMI Catalog**

---

## 👤 Step 3 – Create an AWS User

1. Create an IAM user in AWS
2. Grant the necessary permissions (EC2, VPC, etc.)
3. Generate **Access Key** and **Secret Key**

---

## 🔑 Step 4 – Install and Configure AWS CLI

**Install AWS CLI**

**Configure credentials:**

```bash
aws configure
```

Provide:
- Access Key
- Secret Key
- Region
- Output format

---

## ☁️ Step 5 – Provision Infrastructure with Terraform

Inside the `infra` folder:

**Initialize Terraform:**

```bash
terraform init
```

**Check planned changes:**

```bash
terraform plan
```

**Apply the infrastructure:**

```bash
terraform apply
```

**Destroy resources to avoid costs:**

```bash
terraform destroy
```

---

## ⚠️ Important Notes

- This project is for **learning purposes only**
- Always run `terraform destroy` after testing to avoid AWS charges
- Sensitive files should not be committed:
  - `.env`
  - `*.tfstate`
  - `*.tfstate.backup`
  - `.terraform/`

---

## 🎯 Learning Goals

- Practice Docker image creation and publishing
- Understand Terraform basics
- Learn how to deploy an application on AWS using IaC
- Gain confidence with cloud infrastructure workflows
