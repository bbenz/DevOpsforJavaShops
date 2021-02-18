# Workshop: DevOps for Java Shops

>DevOps is great, if you have the people, processes and tools to support it.  In this session I’ll highlight the easiest ways for developers to work with their IT organizations and partners to deliver their Java code to the cloud using GitHub, including the best ways to reliably make updates and maintain production java code. The focus is on real-world examples using command line tools, free tools including GitHub Actions, and free SDKs and tools available on GitHub. 


## Workshop delivery 
I'm happy to deliver this workshop virtually at destinations worldwide, and also to support anyone else who wants to deliver this, especially in local languages.

### Next workshop: 
[DevNexus 2021](https://devnexus.com/), February 18, Time TBD 



### Past deliveries:
 October 12 - JDD Conference Europe.  
 - [JDD Conference Europe, Virtually (CET) October 12, 2020](https://jdd.org.pl/) 

## Prerequisites
Here are list of free and open source [prerequisites](001_workshop_Prerequisites.md)


# Agenda

## DevOps with Azure

### Introduction

### Exercise 1 – Fork and Clone GitHub repositories for this workshop 

 - Fork and clone a main branch
 - Making changes to the local repo
 - Staging
 - Committing

### Azure Basics 
 - Resource Groups
 - Target environments - VMs, App Service, ACI, Kubernetes

### Exercise 2 - Set up Azure for this workshop

 - Create a resource group
 - Create a staging server
 - Create a production server
 - Create a deployment slot on the production server 
 - Set the deployment slot to 50% traffic

 
 ### Feature Flags
 - Azure App configuration Manager
 - Options for filters
 - Connecting apps to Feature Manager
 - Feature flags in action

### Exercise 3 - Setting up feature flags 
 [Related Materials on Microsoft Docs](https://cda.ms/1XD)
 - Create an App Configuration Store
 - Add a feature Manager
 - Set the percentage filter

### DevOps Introduction
 - People, process and products
 - Builds 
 - Releases 
 - Infrastructure as code

### Azure DevOps Introduction 
 - Azure Organizations
 - Azure Projects
 - Boards
 - Repos
 - Pipelines
 - Release Pipelines 
 - Test Plans
 - Artifacts
 - GitHub Extensions

### Exercise – 4 - Azure DevOps for CI
 - Connect a repo to an Azure DevOps project using the Azure Pipelines extension in the GitHub marketplace
 - Choose the default build template
 - Replace the default template with a provided template
 - Add and run the customized build template
 - Review hosted agents
 - Review the build log

### Exercise 5 – Azure DevOps for CD 
 - Create a new Release pipeline
	Staging
	Production
	Deployment Slot
 - Set up pre-and post deployment approvals
 - Review automated options
 - Set up CD trigger 
 - Run the release pipeline 
 - Review the release

### Exercise 6 - A/B testing
 - Make a change in GitHub
 - Commit and Push
 - Review the change 
	Build
	Release
	Staging
	Deployment slot
 - Review the changes and function of deployment slots
 - Approve the change – post-deployment approval
 - Approve the change – pre-deployment approval

## DevOps with GitHub

### GitHub Actions Introduction 
[Related materials on Microsoft Learn ](https://cda.ms/1XF)

[Related Materials on Microsoft Docs](https://cda.ms/1XG)
 - Workflows
 - Action blocks
 - Triggers
 - Runners
 - Checkin and Checkout
 - Logs

### GitHub Actions for CI and CD 
 [Related materials on Microsoft Learn ](https://cda.ms/1XH)
 - Using a Template
 - Building
 - Working with Artifacts
 - Testing
 - Automating Reviews
 
### Exercise 7 - Generating a template with deployment manager
 - Deploy to an Azure Web App 
 - Review the workflow results
 - Set up a connection string to the App Configuration store
 - Restart the application 
- Review the workflow template

### Summary and Review



