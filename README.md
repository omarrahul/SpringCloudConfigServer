# SpringCloudConfigServer

![alt text](https://https://github.com/omarrahul/SpringCloudConfigServer/blob/master/images/springcloudconfigserver.png)

1. Clone the repo and import as maven project for both range-service and spring-cloud-config-server
2. Set up your local git repo and create properties file based on {application_name}-{label}.properties
3. Configure the right path to your git repo in spring-cloud-config-server application.properties
4. Now first deploy the config server and then deploy the range server
5. If profile is not set then default properties are picked up
6. We can either activate the profile in bootstrap.properties or could pass them as VM arguments while launching the application.

Voila all ready to go !!
