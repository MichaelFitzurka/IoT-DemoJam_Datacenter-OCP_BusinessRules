# IoT-Demo_Datacenter-OCP_BusinessRules
Internet of Things DemoJam :: Datacenter OpenShift Container Platform :: Business Rules

---
Based on [PatrickSteiner/IoT_Demo_Datacenter](https://github.com/PatrickSteiner/IoT_Demo_Datacenter)  
Updated to run as microservices on Openshift/CDK.

## Notes:
This repository does not define a specific pod, but is instead used by the BRMS Decision Server.  
To ensure that the code is accessible, you will need to add the compiled code to the Nexus pod.  
The included shell script will do just that; simply run:
```sh
. maven-add.sh
```
