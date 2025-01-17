# Effortless Cloud-Native App Development Using Skaffold

<a href="https://www.packtpub.com/product/effortless-cloud-native-app-development-using-skaffold/9781801077118"><img src="https://static.packt-cdn.com/products/9781801077118/cover/smaller" alt="Effortless Cloud-Native App Development Using Skaffold" height="256px" align="right"></a>

This is the code repository for [Effortless Cloud-Native App Development using Skaffold](https://www.packtpub.com/product/effortless-cloud-native-app-development-using-skaffold/9781801077118), published by Packt.

**Simplify the development and deployment of cloud-native Spring Boot applications on Kubernetes with Skaffold**

## What is this book about?
Kubernetes has become the de facto standard for container orchestration, drastically improving how we deploy and manage cloud-native apps. Although it has simplified the lives of support professionals, we cannot say the same for developers who need to be equipped with better tools to increase productivity. An automated workflow that solves a wide variety of problems that every developer faces can make all the difference!.

Enter Skaffold – a command-line tool that automates the build, push, and deploy steps for Kubernetes applications.

This book is divided into three parts, starting with common challenges encountered by developers in building apps with Kubernetes. The second part covers Skaffold features, its architecture, supported container image builders, and more. In the last part, you'll focus on practical implementation, learning how to deploy Spring Boot apps to cloud platforms such as Google Cloud Platform (GCP) using Skaffold. You'll also create CI/CD pipelines for your cloud-native apps with Skaffold. Although the examples covered in this book are written in Java and Spring Boot, the techniques can be applied to apps built using other technologies too.

By the end of this Skaffold book, you'll develop skills that will help accelerate your inner development loop and be able to build and deploy your apps to the Kubernetes cluster with Skaffold.

## This book covers the following exciting features:
:bulb: Overcome challenges faced while working in an inner development loop using Skaffold

:bulb: Accelerate your development workflow using Skaffold

:open_book: Understand Skaffold's architecture, internal working, and supported CLI commands

:hammer_and_wrench: Build and deploy containers to Kubernetes using the Skaffold CLI and Cloud Code

:wheel_of_dharma: Deploy Spring Boot applications to fully managed Kubernetes services such as Google Kubernetes Engine using Skaffold

:man_technologist: Explore best practices for developing an app with Skaffold

:warning: Avoid common pitfalls when developing cloud-native apps with Skaffold in Kubernetes

If you feel this book is for you, get your [copy](https://www.amazon.com/dp/B098KKF6RV) today!

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" 
alt="https://www.packtpub.com/" border="5" /></a>

## Instructions and Navigations
All of the code is organized into folders. For example, Chapter02.

The code will look like the following:
```
profiles:
   - name: userDefinedPortForward
   portForward:
     - localPort: 9090
	 port: 8080
	 resourceName: reactive-web-app
	 resourceType: deployment
```

**Who this book is for:**
Cloud-native application developers, software engineers working with Kubernetes, and DevOps professionals who are looking for a solution to simplify and improve their software development life cycle will find this book useful. Beginner-level knowledge of Docker, Kubernetes, and the container ecosystem is required to get started with this book.

With the following software and hardware list you can run all code files present in the book (Chapter 1-10).
### Software and Hardware List
| Software required | OS required |
| ------------------------------------ | ----------------------------------- |
| OpenJDK 16 | Windows,Mac OS and Linux |
| Spring Boot 2.5| Windows,Mac OS and Linux|
| Docker Desktop | macOS and Windows |
| IntelliJ or Eclipse IDE |  macOS and Windows |
| Skaffold CLI V29.0 or above |  Windows,Mac OS and Linux |


We also provide a PDF file that has color images of the screenshots/diagrams used in this book. [Click here to download it](https://static.packt-cdn.com/downloads/9781801077118_ColorImages.pdf).

### Related products
* Cloud Native with Kubernetes [[Packt]](https://www.packtpub.com/product/cloud-native-with-kubernetes/9781838823078) [[Amazon]](https://www.amazon.com/dp/B08L84NJVN)

* Mastering Kubernetes - Third Edition [[Packt]](https://www.packtpub.com/product/mastering-kubernetes-third-edition/9781839211256) [[Amazon]](https://www.amazon.com/dp/B08BLLY5B8)

* Kubernetes in Production Best Practices [[Packt]](https://www.packtpub.com/product/mastering-kubernetes-third-edition/9781839211256) [[Amazon]](https://www.amazon.com/dp/B08T5Y4CJP)



## Get to Know the Author
**Ashish Choudhary**
Ashish Choudhary is a software engineer and has over 10 years of experience in the IT industry. He has experience in designing, developing, and deploying web applications. His technical expertise includes Java, Spring Boot, Docker, Kubernetes, IMDG, distributed systems, microservices, DevOps, the cloud, and the general software development life cycle. He is an active blogger and technical writer. He has delivered talks to some renowned conferences such as GitHub Satellite India and Fosdem. He is also a strong advocate of open source technologies. He has been contributing to various open source projects for quite some time. Ashish believes in continuous learning and knowledge sharing.

