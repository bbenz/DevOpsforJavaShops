
[Return to Agenda](README.md)
<br/>

## Workshop: DevOps for Java shops


### Exercise 6 - A/B testing

[Related Microsoft Learn Materials](https://docs.microsoft.com/en-us/learn/paths/deploy-applications-with-azure-devops/)

 - Make a change in GitHub
 - Submit and accept a PR
 - Review the change 
	Build
	Release
	Staging
	Deployment slot
 - Review the changes and function of deployment slots
 - Approve the change – post-deployment approval
 - Approve the change – pre-deployment approval


### Make a change to the sample application 
In Visual Studio Code, Make a change to your local copy of the Sample App:

In the file Views\Home\Index.cshtml

Remove the comments in the following code:

```HTML  
<!--<div class="text-center">
    <h1 class="display-4">Also</h1>
    <p>Check out this awesome workshop <a href="https://github.com/bbenz/devopswithgithub">DevOps for Java shops!</a>.</p>
</div>
-->
```
It should look like this when you're done: 

```HTML 
<div class="text-center">
    <h1 class="display-4">Also</h1>
    <p>Check out this awesome workshop <a href="https://github.com/bbenz/devopswithgithub">DevOps for Java shops!</a>.</p>
</div>
```

### Push the changes to GitHub:

1. Save the file.  
1. Stage and commit the changes
1. Push to GitHub
1. Open your Azure DevOps project and follow the reelase and build. 
1. The deployment should stop at the Canary deployment slot if approvals were set up correctly.  
1. Select the **Canary App Service Deploy** task to view the detailed log. You should find the URL to the published website in the deployment slot. **Ctrl+Click** the link to open it in a separate tab.
1. Select the **Production App Service Deploy** task from the previous job to view the detailed log. You should find the URL to the published website in the production website. **Ctrl+Click** the link to open it in a separate tab.
1. Note the changes between the Canary deployment slot and the Production Website.  
1. If you're happy with the changes, approve the deployment of the latest release to production.


